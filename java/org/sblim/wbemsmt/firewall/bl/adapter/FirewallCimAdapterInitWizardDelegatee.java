/** 
 * FirewallCimAdapterInitWizardDelegatee.java
 *
* 
 * � Copyright IBM Corp.  2009,2008, 
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
import org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard1Container;
import org.sblim.wbemsmt.firewall.wizard.NewManagedPortWizardContainer1;

public class FirewallCimAdapterInitWizardDelegatee implements FirewallCimAdapterInitWizardIf {

	private FirewallCimAdapter adapter = null;
	
	public FirewallCimAdapterInitWizardDelegatee ( FirewallCimAdapter adapter ) {
		this.adapter = adapter;
	}

	public void initWizardImpl ( NewManagedPortWizard1Container container, NewManagedPortWizardContainer1 wizardContainer, String currentPagename ) throws WbemsmtException {
		
	}

	
}
