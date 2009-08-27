/** 
 * FirewallCimAdapterSaveDelegatee.java
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

import org.sblim.wbemsmt.bl.messages.MessageList;
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
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallInterface;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallManagedPorts;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallTrustedServices;

public class FirewallCimAdapterSaveDelegatee implements FirewallCimAdapterSaveIf {

	private FirewallCimAdapter adapter = null;
	
	public FirewallCimAdapterSaveDelegatee ( FirewallCimAdapter adapter ) {
		this.adapter= adapter;
	}

	public MessageList saveImpl ( FirewallInterfacesContainer container ) throws WbemsmtException {
		return null;
	}

	public MessageList saveImpl ( FirewallManagedPortContainer container ) throws WbemsmtException {
		return adapter.getFirewallManagedPortObj ().save ( container );
	}

	public MessageList saveImpl ( FirewallServiceConfContainer container ) throws WbemsmtException {
		return adapter.getFirewallServiceConfigurationObj ().save ( container );
	}

	public MessageList saveImpl ( FirewallSupportedServicesContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList saveImpl ( FInterfaceContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList saveImpl ( FInterfacesForServicesContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList saveImpl ( FInterfacesForServicesListContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList saveImpl ( FInterfacesListContainer container ) throws WbemsmtException {
		return adapter.getFirewallServiceConfigurationObj ().save ( container );
	}

	public MessageList saveImpl ( FSupportedServicesContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList saveImpl ( FSupportedServicesWithInterfacesContainer container ) throws WbemsmtException {
		return adapter.getFirewallSupportedServicesObj ().save ( container );
	}

	public MessageList saveImpl ( FirewallServiceOptionsContainer container ) throws WbemsmtException {
		return adapter.getFirewallServiceConfigurationObj ().save ( container );
	}

	public MessageList saveImpl ( FInterfaceContainer container, Linux_FirewallInterface fco ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList saveImpl ( FInterfacesForServicesContainer container, Linux_FirewallInterface fco ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList saveImpl ( FSupportedServicesContainer container, Linux_FirewallTrustedServices fco ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList saveImpl ( FInterfacesForPortSummaryContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList saveImpl ( FInterfacesForPortContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList saveImpl ( FInterfacesForPortContainer container, Linux_FirewallManagedPorts fco ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

}
