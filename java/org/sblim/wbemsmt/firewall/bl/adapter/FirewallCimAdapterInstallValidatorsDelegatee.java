/** 
 * FirewallCimAdapterInstallValidatorsDelegatee.java
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
import org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard1Container;
import org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard2Container;
import org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard3Container;
import org.sblim.wbemsmt.firewall.validator.FirewallValidator;
import org.sblim.wbemsmt.tools.validator.RequiredFieldValidator;

public class FirewallCimAdapterInstallValidatorsDelegatee implements FirewallCimAdapterInstallValidatorsIf {

	private FirewallCimAdapter adapter = null;
	
	public FirewallCimAdapterInstallValidatorsDelegatee ( FirewallCimAdapter adapter ) {
		this.adapter= adapter;
	}

	public void installValidatorsImpl ( FirewallInterfacesContainer container ) throws WbemsmtException {

	}

	public void installValidatorsImpl ( FirewallManagedPortContainer container ) throws WbemsmtException {

	}

	public void installValidatorsImpl ( FirewallServiceConfContainer container ) throws WbemsmtException {

	}

	public void installValidatorsImpl ( FirewallSupportedServicesContainer container ) throws WbemsmtException {

	}

	public void installValidatorsImpl ( NewManagedPortWizard1Container container ) throws WbemsmtException {

		RequiredFieldValidator reqField = new RequiredFieldValidator(container.get_usr_StartPort (),adapter);
		reqField.addChild ( new FirewallValidator(container.get_usr_StartPort (),adapter) );
		
		adapter.addValidator ( container, reqField );
		
		FirewallValidator startportvalidator = new FirewallValidator(container.get_usr_StartPort (),adapter);
		FirewallValidator endportvalidator = new FirewallValidator(container.get_usr_EndPort (),adapter);
		
		startportvalidator.setFlags ( FirewallValidator.CHECK_NUMBER );
		endportvalidator.setFlags ( FirewallValidator.CHECK_NUMBER );
		
		startportvalidator.addChild ( endportvalidator );
		
		adapter.addValidator ( container, startportvalidator );
		
	}

	public void installValidatorsImpl ( NewManagedPortWizard2Container container ) throws WbemsmtException {
		// TODO Auto-generated method stub

	}

	public void installValidatorsImpl ( NewManagedPortWizard3Container container ) throws WbemsmtException {
		// TODO Auto-generated method stub

	}

	public void installValidatorsImpl ( FInterfaceContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void installValidatorsImpl ( FInterfacesForServicesContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void installValidatorsImpl ( FInterfacesForServicesListContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void installValidatorsImpl ( FInterfacesListContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void installValidatorsImpl ( FSupportedServicesContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void installValidatorsImpl ( FSupportedServicesWithInterfacesContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void installValidatorsImpl ( FirewallServiceOptionsContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void installValidatorsImpl ( FInterfacesForPortSummaryContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

	public void installValidatorsImpl ( FInterfacesForPortContainer container ) throws WbemsmtException {
		// TODO Auto-generated method stub
		
	}

}
