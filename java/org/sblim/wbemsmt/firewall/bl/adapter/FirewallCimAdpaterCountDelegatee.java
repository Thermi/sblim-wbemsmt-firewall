/** 
 * FirewallCimAdpaterCountDelegatee.java
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
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesListContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesListContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FSupportedServicesWithInterfacesContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FirewallManagedPortContainer;
import org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard2Container;
import org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard3Container;

public class FirewallCimAdpaterCountDelegatee implements FirewallCimAdapterCountIf {

	private FirewallCimAdapter adapter = null;
	
	public  FirewallCimAdpaterCountDelegatee( FirewallCimAdapter adapter){
		this.adapter=adapter;
	}
	
	public int countImpl_InterfacesForServiceList ( Class<?> childClass, FInterfacesForServicesListContainer parent )
			throws WbemsmtException {
		return adapter.getFirewallInterfacesobjlist ().size ();
	}

	public int countImpl_InterfacesList ( Class<?> childClass, FInterfacesListContainer parent ) throws WbemsmtException {
		return adapter.getFirewallInterfacesobjlist ().size ();
	}

	public int countImpl_ServicesList ( Class<?> childClass, FSupportedServicesWithInterfacesContainer parent )
			throws WbemsmtException {
		return adapter.getFirewallSupportedServicesobjlist ().size ();
	}

	public int countImpl_InterfacesListForPort ( Class<?> childClass, NewManagedPortWizard2Container parent ) throws WbemsmtException {
		return adapter.getFirewallInterfacesobjlist ().size ();
	}

	public int countImpl_InterfacesListForPortSummary ( Class<?> childClass, NewManagedPortWizard3Container parent ) throws WbemsmtException {
		return adapter.getFirewallInterfacesobjlist ().size ();
	}

	public int countImpl_InterfacesList ( Class<?> childClass, FSupportedServicesWithInterfacesContainer parent ) throws WbemsmtException {
		return adapter.getFirewallInterfacesobjlist ().size ();
	}

	public int countImpl_InterfacesForPort ( Class<?> childClass, FirewallManagedPortContainer parent ) throws WbemsmtException {
		return adapter.getFirewallInterfacesobjlist ().size ();
	}

}
