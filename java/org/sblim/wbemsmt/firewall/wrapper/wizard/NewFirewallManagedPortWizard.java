/** 
 * NewFirewallManagedPortWizard.java
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


package org.sblim.wbemsmt.firewall.wrapper.wizard;

import java.util.Iterator;

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter;
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortSummaryContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainer;
import org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard1Container;
import org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard2Container;
import org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard3Container;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallInterface;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallManagedPorts;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallManagedPortsForInterface;
import org.sblim.wbemsmt.firewall.wrapper.object.FirewallInterfacesObject;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

public class NewFirewallManagedPortWizard {


	private NewManagedPortWizard1Container newManagedPort1 = null;
	private NewManagedPortWizard2Container newManagedPort2 = null;
	private FirewallCimAdapter adapter = null;
	private String[] val = {"udp","tcp"};
	
	public NewFirewallManagedPortWizard ( FirewallCimAdapter adapter ) {
		super ();
		this.adapter = adapter;
	}

	public void updatecontrols(NewManagedPortWizard1Container container){
		this.newManagedPort1 = container;
		
		if(RuntimeUtil.getInstance ().isCommandline ()){
			container.get_usr_Protocol ().setValues ( val );
		}
		
	}

	public void updatecontrols(NewManagedPortWizard2Container container) throws WbemsmtException{
		this.newManagedPort2 = container;
		container.get_usr_StartPort ().setControlValue ( newManagedPort1.get_usr_StartPort ().getConvertedControlValue () );
		container.get_usr_EndPort ().setControlValue ( newManagedPort1.get_usr_EndPort ().getConvertedControlValue () );
		container.get_usr_Protocol ().setControlValue (val [new Integer(newManagedPort1.get_usr_Protocol ().getConvertedControlValue ().toString ()).intValue ()]);

		FirewallInterfacesObject obj = null;
		int i=0;
		for (Iterator<Object> iter = adapter.getFirewallInterfacesobjlist ().iterator (); iter.hasNext ();){ 
			obj  = (FirewallInterfacesObject)iter.next();
			FInterfacesForServicesContainer c =  (FInterfacesForServicesContainer) container.getInterfacesListForPort().get(i++);
			c.get_DeviceID ().setControlValue ( obj.getFco ().get_key_DeviceID () );
//			List intforport = obj.getFco ().getAssociated_Linux_FirewallManagedPorts_Linux_FirewallManagedPortsForInterfaces ( adapter.getCimClient () );
//			for(Iterator iter1 = intforport.iterator();iter1.hasNext ();){
//				Linux_FirewallManagedPorts intobj = (Linux_FirewallManagedPorts) iter1.next ();
//				if(obj.getFco ().get_key_DeviceID ().equalsIgnoreCase ( intobj.get_key_DeviceID () ))
//					c.get_usr_IsEnabled ().setControlValue ( new Boolean("true") );
//				else
//					c.get_usr_IsEnabled ().setControlValue ( new Boolean("false") );
//				}
			c.get_usr_IsEnabled ().setControlValue ( new Boolean("false"));
			}
		
	}

	public void updatecontrols(NewManagedPortWizard3Container container){
		
		container.get_usr_StartPort ().setControlValue ( newManagedPort2.get_usr_StartPort ().getConvertedControlValue () );
		container.get_usr_EndPort ().setControlValue ( newManagedPort2.get_usr_EndPort () .getConvertedControlValue ());
		container.get_usr_Protocol ().setControlValue ( newManagedPort2.get_usr_Protocol () .getConvertedControlValue ());
		
		int i =0;
		
		for(Iterator<FInterfacesForServicesContainer> iter = newManagedPort2.getInterfacesListForPort().iterator();iter.hasNext ();){
			FInterfacesForServicesContainer cont2 = (FInterfacesForServicesContainer) iter.next();
			FInterfacesForPortSummaryContainer cont3 = (FInterfacesForPortSummaryContainer) container.getInterfacesListForPortSummary().get(i++);
			cont3.get_DeviceID ().setControlValue ( cont2.get_DeviceID ().getConvertedControlValue () );
			cont3.get_usr_IsEnabled ().setControlValue ( cont2.get_usr_IsEnabled ().getConvertedControlValue () );
		}
		
	}

	public void create(NewManagedPortWizard3Container container) throws WbemsmtException{
		
		Linux_FirewallManagedPorts portfco = new Linux_FirewallManagedPorts(adapter.getCimClient (),adapter.getNamespace ());
		
		portfco.set_StartPort ( (String) container.get_usr_StartPort ().getConvertedControlValue () );
		portfco.set_EndPort ( (String) container.get_usr_EndPort ().getConvertedControlValue () );
		portfco.set_Protocol ( (String) container.get_usr_Protocol ().getConvertedControlValue () );
		//		portfco.set_key_InstanceID ( "WBEMSMT::Linxu_FirewallManagedPort::"+ portfco.get_StartPort ()  + portfco.get_EndPort ()+portfco.get_Protocol ());
	
		portfco.set_key_InstanceID("");
		portfco = (Linux_FirewallManagedPorts) adapter.getFcoHelper ().create ( portfco, adapter.getCimClient () );

		for(Iterator<FInterfacesForPortSummaryContainer> iter = container.getInterfacesListForPortSummary ().iterator();iter.hasNext ();){
			FInterfacesForPortSummaryContainer cont3 = (FInterfacesForPortSummaryContainer) iter.next ();
			if(((Boolean)cont3.get_usr_IsEnabled ().getConvertedControlValue ()).booleanValue ()){
				Linux_FirewallManagedPortsForInterface portint = new Linux_FirewallManagedPortsForInterface(adapter.getCimClient (),adapter.getNamespace ());
				for(int j =0 ; j < adapter.getFirewallInterfacesobjlist ().size () ; j++){
					Linux_FirewallInterface o = (Linux_FirewallInterface)adapter.getFirewallInterfacesobjlist ().getFCOs ().get(j);
					if(o.get_key_DeviceID ().equals(cont3.get_DeviceID ().getConvertedControlValue ()))
						portint.set_GroupComponent_Linux_FirewallInterface ( o );
				}
				portint.set_PartComponent_Linux_FirewallManagedPorts ( portfco );
				portint = (Linux_FirewallManagedPortsForInterface) adapter.getFcoHelper ().create ( portint, adapter.getCimClient () );
			}
				
		}

		adapter.setMarkedForReload ();
		adapter.setPathOfTreeNode ( portfco.getCimObjectPath () );
	}
	
}
