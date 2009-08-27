/** 
 * WizardContainer1Util.java
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


package org.sblim.wbemsmt.firewall.wizard;

import java.util.HashMap;
import java.util.Map;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.wizard.WizardContainerUtil;
import org.sblim.wbemsmt.tools.wizard.WizardStepList;
import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;


public class NewManagedPortWizardContainer1Util extends WizardContainerUtil {

	private String[] panelNames = {NewManagedPortWizardContainer1.WIZARD_PANEL_NEWMANAGEDPORTPANEL1 , NewManagedPortWizardContainer1.WIZARD_PANEL_NEWMANAGEDPORTPANEL2 , NewManagedPortWizardContainer1.WIZARD_PANEL_NEWMANAGEDPORTPANEL3 };
	
	public void addInitialWizardSteps ( IWizardContainer wizardContainer, WizardStepList stepList, HashMap<String, DataContainer> hmPages ) {
		super.addInitialWizardStepsDefault(wizardContainer, stepList, panelNames);
	}

	public String getNextPanel ( String currentPageName, Map<String, DataContainer> hmPages ) {
		return super.getNextPanelDefault ( currentPageName, panelNames );
	}

}
