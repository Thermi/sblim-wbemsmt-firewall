/** 
 * FirewallInterfacesContainerImplLayouter.java
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

import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.component.html.HtmlPanelGroup;

import org.sblim.wbemsmt.jsf.layout.JsfLayouter;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class FirewallInterfacesContainerImplLayouter extends JsfLayouter {

	private String gridData[][];
	private int rowSize = 0;
	private HtmlPanelGrid grid;

	public void layout ( HtmlPanelGrid panelForCustomLayout, FirewallInterfacesContainerImpl currentEditContainer1, WbemSmtResourceBundle bundle ) {
	
		HtmlPanelGroup parent = (HtmlPanelGroup) currentEditContainer1.getInputFieldContainer ();
		createInterfacesGrid ( currentEditContainer1 );
		parent .getChildren (). add ( grid );
		
	}

	public void setRowSize(int n){
		this.gridData = new String[n][2];
		this.rowSize = n;
	}
	
	public void setGridData(String[] data){

		for(int i=0 ; i < data.length ; i++)
			this.gridData[i][0]=data[i];

	}
	
	public void createInterfacesGrid(FirewallInterfacesContainerImpl container){
		HtmlPanelGrid grid = createTable ( rowSize, "0", "0" );
		
		for(int i=0 ; i < rowSize ; i++)
			grid.getChildren ().add((UIComponent)container.get_usr_IsTrusted ());
	}
}
