/** 
  * FirewallInterfacesContainerImpl.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/jsf/containerImpl.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.firewall.bl.container.edit.jsf;

import org.sblim.wbemsmt.exception.*;
import java.util.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;




import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class FirewallInterfacesContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.firewall.bl.container.edit.FirewallInterfacesContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_IsTrusted;

    	
		
			FirewallInterfacesContainerImplLayouter layouter = null;
		
		public FirewallInterfacesContainerImplLayouter getLayouter()
		{
			return layouter;
		}	
	
	public FirewallInterfacesContainerImpl(org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "FirewallInterfacesContainer.caption",false);
				
				
		
				
    			
    				layouter = new FirewallInterfacesContainerImplLayouter();
			//layout is done in the edit-method of the Editbean
			//layouter.layout(getPanelForCustomLayout(),this,bundle);
				
		setFooter(getPanelForCustomLayout(),"FirewallInterfacesContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_IsTrusted() {
    		if (ic_usr_IsTrusted == null)
    		{
				String label = bundle.getString("FirewallInterfacesContainer.isTrusted");
				String binding = expressionPrefix + "_usr_IsTrusted.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_IsTrusted = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_IsTrusted;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_IsTrusted != null)
    		{
				ic_usr_IsTrusted.setLabelText(bundle.getString("FirewallInterfacesContainer.isTrusted"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesFirewall"};
	}

	public void countAndCreateChildren() throws WbemsmtException {
	
    		}


	/**
	 * count and create childrens
	 * @throws WbemsmtException
	 */
	public void updateControls() throws WbemsmtException {
			   countAndCreateChildren();
			   adapter.updateControls(this);
		
			   		}

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    				fields.add(get_usr_IsTrusted());
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       FirewallInterfacesContainerImpl source = (FirewallInterfacesContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_IsTrusted().copyFrom(source.get_usr_IsTrusted());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}