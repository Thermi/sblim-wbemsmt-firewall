/** 
 * FirewallManagedPortObject.java
 *
* 
 * © Copyright IBM Corp.  2009,2008, 
 * 
 * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE 
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE 
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. 
 * 
 * You can obtain a current copy of the Eclipse Public License from 
 * http://www.opensource.org/licenses/eclipse-1.0.php 
 *  *
 * @author: Prashanth Karnam <prkarnam@in.ibm.com>
 *
 * Contributors: 
 * 
 * Description: 
 * 
 */


package org.sblim.wbemsmt.firewall.wrapper.object;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.cim.CIMInstance;
import javax.cim.CIMObjectPath;
import javax.wbem.WBEMException;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.bl.wrapper.WbemsmtBusinessObject;
import org.sblim.wbemsmt.exception.ErrorCode;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter;
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FirewallManagedPortContainer;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallInterface;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallManagedPorts;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallManagedPortsForInterface;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallManagedPortsForInterfaceHelper;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

public class FirewallManagedPortObject extends WbemsmtBusinessObject {

	private Linux_FirewallManagedPorts fco;
	private FirewallCimAdapter adapter ;
	
	protected FirewallManagedPortObject ( AbstractBaseCimAdapter adapter ) {
		super ( adapter );
	}

	public FirewallManagedPortObject ( Linux_FirewallManagedPorts fco , AbstractBaseCimAdapter adapter ) {
		this ( adapter );
		this.fco = fco;
		this.adapter = (FirewallCimAdapter) adapter;
	}
	
	public Linux_FirewallManagedPorts getFco() {
		return fco;
	}
	
	public CimObjectKey getCimObjectKey () throws WbemsmtException {
		return new CimObjectKey(fco.getCimObjectPath());
	}
	
	public void updateControls(FirewallManagedPortContainer container) throws WbemsmtException {
		
		FirewallInterfacesObject obj = null;
		int i=0;
		
		container.get_StartPort ().setControlValue(
				fco.get_StartPort ());
		container.get_EndPort ().setControlValue(
				fco.get_EndPort ());

		for (Iterator<Object> iter = adapter.getFirewallInterfacesobjlist ().iterator (); iter.hasNext ();){ 
			obj  = (FirewallInterfacesObject)iter.next();
			FInterfacesForPortContainer cont = (FInterfacesForPortContainer)container.getInterfacesForPort ().get ( i ++);
			cont.get_DeviceID ().setControlValue ( obj.getFco ().get_key_DeviceID () );
			cont.get_usr_IsEnabled ().setControlValue ( new Boolean("false") );
			List<Linux_FirewallInterface> intforservice = fco.getAssociated_Linux_FirewallInterface_Linux_FirewallManagedPortsForInterfaces ( adapter.getCimClient () );
			for(Iterator<Linux_FirewallInterface> iter1 = intforservice.iterator();iter1.hasNext ();){
				Linux_FirewallInterface intobj = (Linux_FirewallInterface) iter1.next ();
				if(obj.getFco ().get_key_DeviceID ().equalsIgnoreCase ( intobj.get_key_DeviceID () ))
					cont.get_usr_IsEnabled ().setControlValue ( new Boolean("true") );
				}
		}
		
		container.get_Protocol ().setControlValue(adapter.getProtocolVals ().get(
				fco.get_Protocol ()));
		
		if(RuntimeUtil.getInstance ().isCommandline ()){
			
			HashMap<String, String> data = adapter.getManagedPortInterfacesCLIData ();
			
				for(Iterator<FInterfacesForPortContainer> iter = container.getInterfacesForPort().iterator ();iter.hasNext ();){
					
					FInterfacesForPortContainer c = (FInterfacesForPortContainer) iter.next ();

					Boolean isEn = new Boolean((String) data.get(c.get_DeviceID ().getConvertedControlValue ()));
					
					if(isEn.booleanValue () && (((Boolean) c.get_usr_IsEnabled ().getConvertedControlValue ()).booleanValue () == false) )
						c.get_usr_IsEnabled ().setControlValue ( isEn );
					
				}
			
		}

		
	}

	public MessageList save ( FirewallManagedPortContainer container ) throws WbemsmtException{

		boolean found = false;
		int i = 0;

		for (Iterator<FInterfacesForPortContainer> iter = container.getInterfacesForPort ().iterator(); iter.hasNext ();) {
			found = false;
			FInterfacesForPortContainer c = (FInterfacesForPortContainer) iter.next ();
			List<Linux_FirewallManagedPortsForInterface> intforservice = Linux_FirewallManagedPortsForInterfaceHelper.enumerateInstances ( adapter.getCimClient (), adapter.getNamespace (), true );
				//fco.getAssociated_Linux_FirewallInterface_Linux_FirewallManagedPortsForInterfaces ( adapter.getCimClient () );
			for (Iterator<Linux_FirewallManagedPortsForInterface> iter1 = intforservice.iterator (); iter1.hasNext ();) {
				Linux_FirewallManagedPortsForInterface pforint = (Linux_FirewallManagedPortsForInterface) iter1.next ();
				Linux_FirewallInterface intobj = pforint.get_GroupComponent_Linux_FirewallInterface ( adapter.getCimClient () );
				Linux_FirewallManagedPorts port = pforint.get_PartComponent_Linux_FirewallManagedPorts ( adapter.getCimClient () );
				if (((String) c.get_DeviceID ().getConvertedControlValue ()).equalsIgnoreCase ( intobj
						.get_key_DeviceID () ) && port.get_key_InstanceID ().equalsIgnoreCase ( fco.get_key_InstanceID () )) {
					if (((Boolean) c.get_usr_IsEnabled ().getConvertedControlValue ()).booleanValue () == false){
						try {
							adapter.getCimClient ().deleteInstance ( pforint.getCimObjectPath ());
						} catch (WBEMException e) {
							e.printStackTrace();
						}
					}
					found = true;
				}
			}

			if (found == false && ((Boolean) c.get_usr_IsEnabled ().getConvertedControlValue ()).booleanValue () == true) {
				Linux_FirewallManagedPortsForInterface sforint = new Linux_FirewallManagedPortsForInterface ( adapter
						.getCimClient (), adapter.getNamespace () );
				sforint.set_PartComponent_Linux_FirewallManagedPorts ( fco );
				sforint.set_GroupComponent_Linux_FirewallInterface ( (Linux_FirewallInterface) adapter
						.getFirewallInterfacesobjlist ().getFCOs ().get ( i ) );
				adapter.getFcoHelper ().create ( sforint, adapter.getCimClient () );
			}
			
			i=i+1;
		}

//		fco.set_StartPort ( (String) container.get_StartPort ().getConvertedControlValue () );
//		fco.set_EndPort ( (String) container.get_EndPort ().getConvertedControlValue () );
//		fco.set_Protocol ( (String) adapter.getProtocolVals ().get (
//				container.get_Protocol ().getConvertedControlValue () ) );
//
		adapter.getFcoHelper ().save ( fco, adapter.getCimClient () );

		adapter.setMarkedForReload();
		adapter.setPathOfTreeNode(fco.getCimObjectPath());
		return null;

	}

	public MessageList revert(FirewallManagedPortContainer container)
			throws WbemsmtException {
		try {
			adapter.getFcoHelper().reload(fco, adapter.getCimClient());
		} catch (WbemsmtException e) {
			throw new WbemsmtException((ErrorCode)e.getErrorCode (),e);
		}
		return null;
	}

	public void delete() throws WbemsmtException {
		
//		Linux_FirewallManagedPorts portfco = this.fco;
		
		List<CIMObjectPath> list = Linux_FirewallManagedPortsForInterfaceHelper.enumerateInstanceNames ( adapter.getCimClient (),adapter.getNamespace (), true );
		
		for (Iterator<CIMObjectPath> iter = list.iterator (); iter.hasNext ();) {
			CIMObjectPath path =  (CIMObjectPath) iter.next ();
			Linux_FirewallManagedPortsForInterface portforint = new Linux_FirewallManagedPortsForInterface(new CIMInstance(path,null));
//			Linux_FirewallManagedPortsForInterface p = new Linux_FirewallManagedPortsForInterface (adapter.getCimClient (),adapter.getNamespace ());
//			Linux_FirewallManagedPortsForInterface portforint = new Linux_FirewallManagedPortsForInterface (p.getCimInstance ());
			String InstanceinAssoc = (String) portforint.get_PartComponent_Linux_FirewallManagedPorts  (adapter.getCimClient ()).get_key_InstanceID ();
			String Instanceinfco = fco.get_key_InstanceID();
			if (InstanceinAssoc.equals ( Instanceinfco ))
				try {
					adapter.getCimClient ().deleteInstance ( portforint.getCimObjectPath () );
				} catch (WBEMException e) {
					e.printStackTrace();
				}
		}
		
		//adapter.getFcoHelper ().delete ( fco, adapter.getCimClient (), true );
		try {
			adapter.getCimClient ().deleteInstance ( fco.getCimObjectPath () );
		} catch (WBEMException e) {
			e.printStackTrace();
		}
		
		adapter.setMarkedForReload();
		adapter.setPathOfTreeNode ( null );
	}
}
