 /** 
  * NewManagedPortWizard1ContainerImplLayouter.java
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


package org.sblim.wbemsmt.firewall.bl.container.wizard.jsf;

import javax.faces.component.html.HtmlPanelGrid;

import org.sblim.wbemsmt.jsf.layout.JsfLayouter;
import org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class NewManagedPortWizard1ContainerImplLayouter extends JsfLayouter {

	public void layout ( HtmlPanelGrid panelForCustomLayout, NewManagedPortWizard1ContainerImpl panel1, WbemSmtResourceBundle bundle ) {

		LabeledStringArrayInputComponentIf pro = (LabeledStringArrayInputComponentIf)panel1.get_usr_Protocol ();
		String[] val = {"udp","tcp"};
		pro.setValues(val);
		
		panelForCustomLayout.getChildren ().add(getLabel ( "Start Port "));
		panelForCustomLayout.getChildren ().add(((LabeledJSFInputComponent)panel1.get_usr_StartPort ()).getComponentPanel ());
		panelForCustomLayout.getChildren ().add (getLabel("End Port"));
		panelForCustomLayout.getChildren ().add(((LabeledJSFInputComponent)panel1.get_usr_EndPort ()).getComponentPanel ());
		panelForCustomLayout.getChildren ().add(getLabel ( "Protocol ")); 
		panelForCustomLayout.getChildren ().add(((LabeledJSFInputComponent)pro).getComponentPanel ());
		
	}

}
