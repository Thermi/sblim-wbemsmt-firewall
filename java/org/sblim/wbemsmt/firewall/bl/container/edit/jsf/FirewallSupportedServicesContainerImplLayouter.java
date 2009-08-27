/** 
 * FirewallSupportedServicesContainerImplLayouter.java
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


package org.sblim.wbemsmt.firewall.bl.container.edit.jsf;

import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.component.html.HtmlPanelGroup;

import org.sblim.wbemsmt.jsf.layout.JsfLayouter;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class FirewallSupportedServicesContainerImplLayouter extends JsfLayouter {

	public void layout ( HtmlPanelGrid panelForCustomLayout, FirewallSupportedServicesContainerImpl currentEditContainer1, WbemSmtResourceBundle bundle ) {

		HtmlPanelGroup parent = (HtmlPanelGroup) currentEditContainer1.getInputFieldContainer ();
		
		HtmlPanelGrid grid = createTable ( 1, "0", "0" );
//		HtmlPanelGrid serviceName = create(UI)
		
		parent .getChildren (). add ( grid );
		
	}

}
