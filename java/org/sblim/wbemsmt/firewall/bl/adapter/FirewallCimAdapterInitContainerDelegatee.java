/** 
 * FirewallCimAdapterInitContainerDelegatee.java
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

public class FirewallCimAdapterInitContainerDelegatee implements FirewallCimAdapterInitContainerIf {

	private FirewallCimAdapter adapter = null;
	
	public FirewallCimAdapterInitContainerDelegatee ( FirewallCimAdapter adapter ) {
		this.adapter=adapter;
	}

	public void initContainerImpl ( FirewallInterfacesContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub

	}

	public void initContainerImpl ( FirewallManagedPortContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub

	}

	public void initContainerImpl ( FirewallServiceConfContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub

	}

	public void initContainerImpl ( FirewallSupportedServicesContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub

	}

	public void initContainerImpl ( NewManagedPortWizard1Container container ) throws WbemsmtException {
		// TODO Auto-generated method stub

	}

	public void initContainerImpl ( NewManagedPortWizard2Container container ) throws WbemsmtException {
		// TODO Auto-generated method stub

	}

	public void initContainerImpl ( NewManagedPortWizard3Container container ) throws WbemsmtException {
		// TODO Auto-generated method stub

	}

	public void initContainerImpl ( WelcomeContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub

	}

	public void initContainerImpl ( FInterfaceContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void initContainerImpl ( FInterfacesForServicesContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void initContainerImpl ( FInterfacesForServicesListContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void initContainerImpl ( FInterfacesListContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void initContainerImpl ( FSupportedServicesContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void initContainerImpl ( FSupportedServicesWithInterfacesContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void initContainerImpl ( FirewallServiceOptionsContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void initContainerImpl ( FInterfacesForPortSummaryContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void initContainerImpl ( FInterfacesForPortContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

}
