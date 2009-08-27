/** 
 * FirewallCimAdapterUpdateModelDelegatee.java
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
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesListContainer;
import org.sblim.wbemsmt.firewall.bl.container.edit.FirewallServiceConfContainer;
import org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard1Container;
import org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard2Container;

public class FirewallCimAdapterUpdateModelDelegatee implements FirewallCimAdapterUpdateModelIf {

	private FirewallCimAdapter adapter = null;
	
	public FirewallCimAdapterUpdateModelDelegatee ( FirewallCimAdapter adapter ) {
		this.adapter=adapter;
	}

	public void updateModelImpl ( NewManagedPortWizard1Container container ) throws WbemsmtException {

	}

	public void updateModelImpl ( NewManagedPortWizard2Container container ) throws WbemsmtException {
		// TODO Auto-generated method stub

	}

	public void updateModelImpl ( FInterfacesListContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void updateModelImpl ( FirewallServiceConfContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void updateModelImpl ( FInterfaceContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

}
