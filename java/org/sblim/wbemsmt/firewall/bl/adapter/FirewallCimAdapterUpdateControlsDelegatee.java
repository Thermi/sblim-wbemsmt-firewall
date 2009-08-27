/** 
 * FirewallCimAdapterUpdateControlsDelegatee.java
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


package org.sblim.wbemsmt.firewall.bl.adapter;

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfaceContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortSummaryContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesListContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesListContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FSupportedServicesContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FSupportedServicesWithInterfacesContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FirewallInterfacesContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FirewallManagedPortContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FirewallServiceConfContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FirewallServiceOptionsContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FirewallSupportedServicesContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.WelcomeContainer;
import org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard1Container;
import org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard2Container;
import org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard3Container;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallInterface;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallManagedPorts;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallTrustedServices;

public class FirewallCimAdapterUpdateControlsDelegatee implements FirewallCimAdapterUpdateControlsIf {

	private FirewallCimAdapter adapter = null;
	
	public FirewallCimAdapterUpdateControlsDelegatee ( FirewallCimAdapter adapter2 ) {
		this.adapter=adapter2;
	}

	public void updateControlsImpl ( FirewallInterfacesContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub

	}

	public void updateControlsImpl ( FirewallManagedPortContainer container ) throws WbemsmtException {
		adapter.getFirewallManagedPortObj().updateControls ( container ); 
	}

	public void updateControlsImpl ( FirewallServiceConfContainer container ) throws WbemsmtException {
//		adapter.getFirewallServiceObj ().getServiceconf ().updateControls ( container );
	}

	public void updateControlsImpl ( FirewallSupportedServicesContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub

	}

	public void updateControlsImpl ( NewManagedPortWizard1Container container ) throws WbemsmtException {
		adapter.getNewportwizard ().updatecontrols ( container );
	}

	public void updateControlsImpl ( NewManagedPortWizard2Container container ) throws WbemsmtException {
		adapter.getNewportwizard ().updatecontrols ( container );
	}

	public void updateControlsImpl ( NewManagedPortWizard3Container container ) throws WbemsmtException {
		adapter.getNewportwizard ().updatecontrols ( container );
	}

	public void updateControlsImpl ( WelcomeContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub

	}

	public void updateControlsImpl ( FInterfaceContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void updateControlsImpl ( FInterfacesForServicesContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void updateControlsImpl ( FInterfacesForServicesListContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void updateControlsImpl ( FInterfacesListContainer container ) throws WbemsmtException {
		adapter.getFirewallServiceConfigurationObj ().updateControls ( container );
	}

	public void updateControlsImpl ( FSupportedServicesContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void updateControlsImpl ( FSupportedServicesWithInterfacesContainer container ) throws WbemsmtException {
		adapter.getFirewallSupportedServicesObj ().updateControls ( container );
	}

	public void updateControlsImpl ( FirewallServiceOptionsContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void updateControlsImpl ( FInterfaceContainer container, Linux_FirewallInterface fco ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void updateControlsImpl ( FInterfacesForServicesContainer container, Linux_FirewallInterface fco ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void updateControlsImpl ( FSupportedServicesContainer container, Linux_FirewallTrustedServices fco ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void updateControlsImpl ( FInterfacesForPortSummaryContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void updateControlsImpl ( FInterfacesForPortSummaryContainer container, Linux_FirewallInterface fco ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void updateControlsImpl ( FInterfacesForPortContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void updateControlsImpl ( FInterfacesForPortContainer container, Linux_FirewallManagedPorts fco ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

}
