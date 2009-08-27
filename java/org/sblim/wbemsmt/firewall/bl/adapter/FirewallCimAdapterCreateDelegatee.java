/** 
 * FirewallCimAdapterCreateDelegatee.java
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
import org.sblim.wbemsmt.firewall.bl.container.edit.FirewallManagedPortContainer;
import org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard3Container;

public class FirewallCimAdapterCreateDelegatee implements FirewallCimAdapterCreateIf {

	private FirewallCimAdapter adapter = null;
	
	public FirewallCimAdapterCreateDelegatee ( FirewallCimAdapter adapter ) {
		this.adapter = adapter;
	}

	public void createImpl ( FirewallManagedPortContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub

	}

	public void createImpl ( NewManagedPortWizard3Container container ) throws WbemsmtException {
		adapter.getNewportwizard ().create ( container );
	}

}
