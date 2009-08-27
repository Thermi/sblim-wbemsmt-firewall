/** 
 * FirewallSupportedServicesObject.java
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

import javax.wbem.WBEMException;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.bl.wrapper.WbemsmtBusinessObject;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter;
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FSupportedServicesWithInterfacesContainer;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallInterface;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallTrustedServices;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallTrustedServicesForInterface;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallTrustedServicesForInterfaceHelper;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

public class FirewallSupportedServicesObject extends WbemsmtBusinessObject {

	Linux_FirewallTrustedServices fco = null;
	FirewallCimAdapter adapter = null;
	
	public FirewallSupportedServicesObject ( Linux_FirewallTrustedServices fco, FirewallCimAdapter adapter2 ) {
		super ( adapter2 );
		this.fco = fco;
		this.adapter = adapter2;
	}

	protected FirewallSupportedServicesObject ( AbstractBaseCimAdapter adapter ) {
		super ( adapter );
	}

	public CimObjectKey getCimObjectKey () throws WbemsmtException {
		return new CimObjectKey(fco.getCimObjectPath());
	}
	
	public Linux_FirewallTrustedServices getFco(){
		return fco;
	}
	
	public void updateControls(FSupportedServicesWithInterfacesContainer container) throws WbemsmtException{
		
		FirewallInterfacesObject obj = null;
		int i=0;
		
		container.getServiceList ().get_ServiceName ().setControlValue ( fco.get_ServiceName () );
		
		for (Iterator<Object> iter = adapter.getFirewallInterfacesobjlist ().iterator (); iter.hasNext ();){ 
			obj  = (FirewallInterfacesObject)iter.next();
			FInterfacesForServicesContainer cont = (FInterfacesForServicesContainer)container.getInterfacesList ().get ( i ++);
			cont.get_DeviceID ().setControlValue ( obj.getFco ().get_key_DeviceID () );
			cont.get_usr_IsEnabled ().setControlValue ( new Boolean("false") );
			List<Linux_FirewallInterface> intforservice = fco.getAssociated_Linux_FirewallInterface_Linux_FirewallTrustedServicesForInterfaces ( adapter.getCimClient () );
			for(Iterator<Linux_FirewallInterface> iter1 = intforservice.iterator();iter1.hasNext ();){
				Linux_FirewallInterface intobj = (Linux_FirewallInterface) iter1.next ();
				if(obj.getFco ().get_key_DeviceID ().equalsIgnoreCase ( intobj.get_key_DeviceID () ))
					cont.get_usr_IsEnabled ().setControlValue ( new Boolean("true") );
				}
		}

		if(RuntimeUtil.getInstance ().isCommandline ()){
			
			HashMap<String, String> data = adapter.getSupportedServicesInterfacesCLIData ();
			
				for(Iterator<FInterfacesForServicesContainer> iter = container.getInterfacesList ().iterator ();iter.hasNext ();){
					
					FInterfacesForServicesContainer c = (FInterfacesForServicesContainer) iter.next ();
					
					Boolean isEn = new Boolean((String) data.get(c.get_DeviceID ().getConvertedControlValue ()));
					
					if(isEn.booleanValue () && (((Boolean) c.get_usr_IsEnabled ().getConvertedControlValue ()).booleanValue () == false) )
						c.get_usr_IsEnabled ().setControlValue ( isEn );
					
				}
			
		}
		
	}

	public MessageList save(FSupportedServicesWithInterfacesContainer container) throws WbemsmtException{
		
		boolean found = false;
		int i =0;

		for(Iterator<FInterfacesForServicesContainer> iter = container.getInterfacesList ().iterator ();iter.hasNext ();){
			found=false;
			FInterfacesForServicesContainer c = (FInterfacesForServicesContainer) iter.next ();
			List<Linux_FirewallTrustedServicesForInterface> intforservice = Linux_FirewallTrustedServicesForInterfaceHelper.enumerateInstances ( adapter.getCimClient (), adapter.getNamespace (), true ); 
				//fco.getAssociated_Linux_FirewallInterface_Linux_FirewallSupportedServicesForInterfaceNames( adapter.getCimClient () );
			for(Iterator<Linux_FirewallTrustedServicesForInterface> iter1 = intforservice.iterator();iter1.hasNext ();){
				Linux_FirewallTrustedServicesForInterface ssforint = (Linux_FirewallTrustedServicesForInterface) iter1.next ();
				Linux_FirewallInterface intobj = ssforint.get_GroupComponent_Linux_FirewallInterface ( adapter.getCimClient () );
				Linux_FirewallTrustedServices serv = ssforint.get_PartComponent_Linux_FirewallTrustedServices ( adapter.getCimClient () );
				
				if(((String) c.get_DeviceID ().getConvertedControlValue ()).equalsIgnoreCase ( intobj.get_key_DeviceID () ) && serv.get_ServiceName ().equalsIgnoreCase ( fco.get_ServiceName () )){			
					if(((Boolean)c.get_usr_IsEnabled ().getConvertedControlValue ()).booleanValue ()==false){
						try {
							adapter.getCimClient ().deleteInstance ( ssforint.getCimObjectPath ());
						} catch (WBEMException e) {
							e.printStackTrace();
						}
					}
					found=true;
					}
			}
			
			if(found==false && ((Boolean) c.get_usr_IsEnabled ().getConvertedControlValue ()).booleanValue () == true){
			Linux_FirewallTrustedServicesForInterface sforint = new Linux_FirewallTrustedServicesForInterface(adapter.getCimClient (),adapter.getNamespace ());
			sforint.set_PartComponent_Linux_FirewallTrustedServices ( fco );
			
			for(int j =0 ; j < adapter.getFirewallInterfacesobjlist ().size () ; j++){
				Linux_FirewallInterface o = (Linux_FirewallInterface)adapter.getFirewallInterfacesobjlist ().getFCOs ().get(j);
				if(o.get_key_DeviceID ().equals(c.get_DeviceID ().getConvertedControlValue ()))
					sforint.set_GroupComponent_Linux_FirewallInterface ( o );
			}
			
//			sforint.set_GroupComponent_Linux_FirewallInterface ( (Linux_FirewallInterface) adapter.getFirewallInterfacesobjlist ().getFCOs ().get ( i ) );
			adapter.getFcoHelper ().create ( sforint, adapter.getCimClient () );
			}
			
			i=i+1;
		}
		
//		container.getServiceList ().get_ServiceName ().setControlValue ( fco.get_serviceName () );
//		
//		for (Iterator iter = adapter.getFirewallInterfacesobjlist ().iterator (); iter.hasNext ();){ 
//			obj  = (FirewallInterfacesObject)iter.next();
//			FInterfacesForServicesContainer cont = (FInterfacesForServicesContainer)container.getInterfacesList ().get ( i ++);
//			cont.get_DeviceID ().setControlValue ( obj.getFco ().get_key_DeviceID () );
//			cont.get_usr_IsEnabled ().setControlValue ( new Boolean(false) );
//		}

		adapter.setMarkedForReload ();
		adapter.setPathOfTreeNode ( fco.getCimObjectPath () );
		
		return null;
	}

}
