 /** 
  * FirewallCimAdapterRevertDelegatee.java
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
 *   *
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

public class FirewallCimAdapterRevertDelegatee implements FirewallCimAdapterRevertIf {

	public FirewallCimAdapterRevertDelegatee ( FirewallCimAdapter adapter ) {
	}

	public MessageList revertImpl ( FInterfaceContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( FInterfacesForPortContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( FInterfacesForPortSummaryContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( FInterfacesForServicesContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( FInterfacesForServicesListContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( FInterfacesListContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( FSupportedServicesContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( FSupportedServicesWithInterfacesContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( FirewallInterfacesContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( FirewallManagedPortContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( FirewallServiceConfContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( FirewallServiceOptionsContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( FirewallSupportedServicesContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( FInterfaceContainer container, Linux_FirewallInterface fco )
			throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( FInterfacesForPortContainer container, Linux_FirewallManagedPorts fco )
			throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( FInterfacesForServicesContainer container, Linux_FirewallInterface fco )
			throws WbemsmtException {
		// TODO Auto-generated method stub
		return null;
	}

}
