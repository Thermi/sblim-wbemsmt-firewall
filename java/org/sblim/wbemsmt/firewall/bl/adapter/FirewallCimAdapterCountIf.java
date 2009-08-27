/** 
  * FirewallCimAdapterCountIf.java
  *
  * 
  * Â© Copyright IBM Corp.  2009,2006,2007
  *
  * THIS FILE IS PROVIDED UNDER THE TER	MS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceCount.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.firewall.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.*;

import org.sblim.wbemsmt.exception.WbemsmtException;

	/** 
	 * This is the interface containing only the Count-Methods for the delegate
	 **/

public interface FirewallCimAdapterCountIf extends CountDelegatee
{

	public static final String[] RESOURCE_BUNDLE_NAMES = new String[]{"messages","messagesFirewall"};

	/** 
	 * Count-Methods
	 **/
	public int countImpl_InterfacesList(Class<?> childClass, org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesListContainer parent ) throws WbemsmtException;
	public int countImpl_InterfacesForPort(Class<?> childClass, org.sblim.wbemsmt.firewall.bl.container.edit.FirewallManagedPortContainer parent ) throws WbemsmtException;
	public int countImpl_InterfacesListForPortSummary(Class<?> childClass, org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard3Container parent ) throws WbemsmtException;
	public int countImpl_InterfacesForServiceList(Class<?> childClass, org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesListContainer parent ) throws WbemsmtException;
	public int countImpl_InterfacesList(Class<?> childClass, org.sblim.wbemsmt.firewall.bl.container.edit.FSupportedServicesWithInterfacesContainer parent ) throws WbemsmtException;
	public int countImpl_InterfacesListForPort(Class<?> childClass, org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard2Container parent ) throws WbemsmtException;
			
}