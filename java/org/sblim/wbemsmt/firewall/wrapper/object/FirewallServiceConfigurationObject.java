/** 
 * FirewallServiceConfigurationObject.java
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

import java.util.Iterator;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.bl.wrapper.WbemsmtBusinessObject;
import org.sblim.wbemsmt.exception.ErrorCode;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter;
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfaceContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesListContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FSupportedServicesWithInterfacesContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FirewallServiceConfContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FirewallServiceOptionsContainer;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallServiceConfiguration;

public class FirewallServiceConfigurationObject extends WbemsmtBusinessObject {

	private Linux_FirewallServiceConfiguration fco;

	private FirewallCimAdapter adapter;
	
	protected FirewallServiceConfigurationObject ( AbstractBaseCimAdapter adapter ) {
		super ( adapter );
	}


	public FirewallServiceConfigurationObject(
			final Linux_FirewallServiceConfiguration fco,
			final FirewallCimAdapter adapter) {
		this(adapter);
		this.fco = fco;
		this.adapter = adapter;
	}

	public Linux_FirewallServiceConfiguration getFco() {
		return fco;
	}

	public void updateControls(FirewallServiceConfContainer container){

		container.get_ConfigurationFile().setControlValue(
		fco.get_configurationFile());
		
	}
	
	public void updateControls(FirewallServiceOptionsContainer container) {

		container.get_IPTABLES_MODULES().setControlValue(
				fco.get_IPTABLES_MODULES());

		container.get_IPTABLES_MODULES_UNLOAD ().setControlValue(
				fco.get_IPTABLES_MODULES_UNLOAD ());

		container.get_IPTABLES_SAVE_COUNTER ().setControlValue(
				fco.get_IPTABLES_SAVE_COUNTER ());

		container.get_IPTABLES_SAVE_ON_RESTART ().setControlValue(
				fco.get_IPTABLES_SAVE_ON_RESTART ());

		container.get_IPTABLES_SAVE_ON_STOP ().setControlValue(
				fco.get_IPTABLES_SAVE_ON_STOP ());

		container.get_IPTABLES_STATUS_LINENUMBERS ().setControlValue(
				fco.get_IPTABLES_STATUS_LINENUMBERS ());

		container.get_IPTABLES_STATUS_VERBOSE ().setControlValue(
				fco.get_IPTABLES_STATUS_VERBOSE ());
		
		container.get_IPTABLES_STATUS_NUMERIC ().setControlValue(
				fco.get_IPTABLES_STATUS_NUMERIC ());

	}

	public void updateControls(FInterfacesListContainer container) throws WbemsmtException{
		
		FirewallInterfacesObject obj = null;
		int i=0;
		for (Iterator<Object> iter = adapter.getFirewallInterfacesobjlist ().iterator (); iter.hasNext ();){ 
			obj  = (FirewallInterfacesObject)iter.next();
			obj.updateControls((FInterfaceContainer) container.getInterfacesList ().get(i++));;
			}
	}
	
	public void updateControls(FSupportedServicesWithInterfacesContainer container){
		
	}
	
	public MessageList save(FirewallServiceConfContainer container)
			throws WbemsmtException {
		fco.set_configurationFile((String) container.get_ConfigurationFile()
				.getConvertedControlValue());
		adapter.getFcoHelper().save(fco, adapter.getCimClient());

		adapter.setMarkedForReload ();
		adapter.setPathOfTreeNode ( fco.getCimObjectPath () );
		
		return null;

	}

	public MessageList save ( FirewallServiceOptionsContainer container ) throws WbemsmtException {
		fco.set_IPTABLES_MODULES ( (String) container.get_IPTABLES_MODULES ().getConvertedControlValue () );
		fco.set_IPTABLES_MODULES_UNLOAD ( (Boolean) container.get_IPTABLES_MODULES_UNLOAD ().getConvertedControlValue () );
		fco.set_IPTABLES_SAVE_ON_STOP ( (Boolean) container.get_IPTABLES_SAVE_ON_STOP ().getConvertedControlValue () );
		fco.set_IPTABLES_SAVE_ON_RESTART ( (Boolean) container.get_IPTABLES_SAVE_ON_RESTART ().getConvertedControlValue () );
		fco.set_IPTABLES_SAVE_COUNTER ( (Boolean) container.get_IPTABLES_SAVE_COUNTER ().getConvertedControlValue () );
		fco.set_IPTABLES_STATUS_LINENUMBERS ( (Boolean) container.get_IPTABLES_STATUS_LINENUMBERS ().getConvertedControlValue () );
		fco.set_IPTABLES_STATUS_VERBOSE ( (Boolean) container.get_IPTABLES_STATUS_VERBOSE ().getConvertedControlValue () );
		fco.set_IPTABLES_STATUS_NUMERIC ( (Boolean) container.get_IPTABLES_STATUS_NUMERIC ().getConvertedControlValue () );
		
		adapter.getFcoHelper ().save ( fco, adapter.getCimClient () );

		adapter.setMarkedForReload ();
		adapter.setPathOfTreeNode ( fco.getCimObjectPath () );
		
		return null;

	}

	public MessageList save(FInterfacesListContainer container) throws WbemsmtException{

		FirewallInterfacesObject obj = null;
		int i=0;
		for (Iterator<Object> iter = adapter.getFirewallInterfacesobjlist ().iterator (); iter.hasNext ();){ 
			obj  = (FirewallInterfacesObject)iter.next();
			obj.save((FInterfaceContainer) container.getInterfacesList ().get(i++));;
			}

		return null;
	}
	
	public MessageList save(FSupportedServicesWithInterfacesContainer  container){
		return null;
	}
	
	public MessageList revert(FirewallServiceConfContainer container)
			throws WbemsmtException {
		try {
			adapter.getFcoHelper().reload(fco, adapter.getCimClient());
		} catch (WbemsmtException e) {
			throw new WbemsmtException((ErrorCode)e.getErrorCode (),e);
		}
		return null;
	}

//	public void updateModel(FirewallServiceConfContainer container) throws WbemsmtException{
//		WBEMClient cimclient = adapter.getCimClient ();
//		
//		if(adapter.getUpdateTrigger () == container.get_invoke_StartService ()){
//					adapter.getFirewallServiceObj ().getFco ().invoke_StartService ( cimclient );
//		}
//		
//		if(adapter.getUpdateTrigger () == container.get_invoke_StopService ()){
//			adapter.getFirewallServiceObj ().getFco ().invoke_StopService ( cimclient );
//		}
//
//		if(adapter.getUpdateTrigger () == container.get_usr_Restartservice ()){
//			adapter.getFirewallServiceObj ().getFco ().invoke_StopService ( cimclient );
//			adapter.getFirewallServiceObj ().getFco ().invoke_StartService ( cimclient );
//		}
//
//	}
	
	public CimObjectKey getCimObjectKey () throws WbemsmtException {
		return new CimObjectKey(fco.getCimObjectPath());
	}

}
