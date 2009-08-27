/** 
  * FInterfacesListContainerImpl.java
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

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfaceContainer;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;

public class FInterfacesListContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesListContainer
			, org.sblim.wbemsmt.firewall.bl.container.edit.FInterfaceContainerHeader		
	{
				
				private java.util.List<FInterfaceContainer> icInterfacesList = new java.util.ArrayList<FInterfaceContainer>();
		
		private MultiLinePanel interfacesListPanel;
		private int interfacesListCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icInterfacesListHeader_DeviceID;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icInterfacesListHeader_IsTrusted;
				
	
		
			FInterfacesListContainerImplLayouter layouter = null;
		
		public FInterfacesListContainerImplLayouter getLayouter()
		{
			return layouter;
		}	
	
	public FInterfacesListContainerImpl(org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "FInterfacesListContainer.caption",false);
				
				
		
				
    			
    				layouter = new FInterfacesListContainerImplLayouter();
			//layout is done in the edit-method of the Editbean
			//layouter.layout(getPanelForCustomLayout(),this,bundle);
				
		setFooter(getPanelForCustomLayout(),"FInterfacesListContainer.footerText");
		adapter.initContainer(this);
	}
	

		
			
				
		/**
		* 
		* linked container FInterfaceContainer
		*/
				public java.util.List<FInterfaceContainer> getInterfacesList()
				{
						return icInterfacesList;
		}
		
		public MultiLinePanel getInterfacesListPanel()
		{
			if (interfacesListPanel == null)
			{
  			   interfacesListPanel = new InterfacesListPanel(adapter,expressionPrefix, // the prefix for binding values
							  "#{" +  expressionPrefix + "interfacesListPanel", // binding for Title
							  "FInterfaceContainer_AsInterfacesList_InFInterfacesListContainer.caption", //Key for title
							  org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfaceContainer_AsInterfacesList_InFInterfacesListContainerImpl.COLS);
			  addInterfacesListHeader();							  
			}		
			
			return interfacesListPanel;
		}

		static class InterfacesListPanel extends MultiLinePanel
		{
			public InterfacesListPanel(AbstractBaseCimAdapter adapter, String expressionPrefix, String bindigForTitle, String keyForTitle, int cols) {
				super(adapter, expressionPrefix, bindigForTitle, keyForTitle, "interfacesList", cols);
			}
	
			protected String getOrientationOfColumnAsCss(int column) {
				return org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfaceContainer_AsInterfacesList_InFInterfacesListContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	private void addInterfacesList(org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfaceContainer_AsInterfacesList_InFInterfacesListContainerImpl child) {

		getInterfacesList().add(child);
		getInterfacesListPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getInterfacesList_DeviceIDHeader()).getDependentChildFields().add(child.get_DeviceID());
					//((LabeledJSFInputComponent)getInterfacesList_IsTrustedHeader()).getDependentChildFields().add(child.get_IsTrusted());
			}
	
	private void clearInterfacesList() {
		getInterfacesList().clear();
	}

	/**
	* 
	* Get the InterfacesList for the UI repesentation
	*/
	public java.util.List<FInterfaceContainer> getInterfacesListForUI()
	{
				
		List<FInterfaceContainer> result = new ArrayList<FInterfaceContainer>();
		result.addAll(icInterfacesList);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfaceContainer_AsInterfacesList_InFInterfacesListContainerImpl item = new org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfaceContainer_AsInterfacesList_InFInterfacesListContainerImpl((org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter)adapter,expressionPrefix, result.size());
				DataContainerUtil.setVisibilityOfFields(item,false);
				result.add(item);
			} catch (WbemsmtException e) {
				e.printStackTrace();
			}
		}
		
		interfacesListPanel.setList(result);
		
		return result;
	}		
		
		
	/**
	 * manages the style for whole footer which is displayed if there are no entries in the table or if there is a custom panel in it
	 * @return
	 */
	public String getInterfacesListFooterClass()
	{
		return "multiLineRowHeader center "  
		+ (icInterfacesList.size() == 0 || getInterfacesListPanel().isHavingCustomFooter() ?  "visible " : "hidden ");
	}
	
	/**
	 * manages the style for the label which is displayed if there are no entries in the table
	 * @return
	 */
	public String getInterfacesListAvailableFooterClass()
	{
		return icInterfacesList.size() > 0 ? " hidden " : " visible ";
	}
	
	private void addInterfacesListHeader() {
		getInterfacesListPanel().setHeader(getInterfacesListHeaderComponents(),getInterfacesListFieldNames());
	}
	
	private LabeledJSFInputComponent[] getInterfacesListHeaderComponents() {
		return new LabeledJSFInputComponent[]{
							(LabeledJSFInputComponent)getInterfacesListHeader_DeviceID(),
							(LabeledJSFInputComponent)getInterfacesListHeader_IsTrusted(),
						};
	}

	private String[] getInterfacesListFieldNames() {
		return new String[]{
							"_DeviceID",
							"_IsTrusted",
						};
	}

	   /**
		* Header for:
		* 
		* linked container FInterfaceContainer
		*/
		public org.sblim.wbemsmt.firewall.bl.container.edit.FInterfaceContainerHeader getInterfacesListHeader()
		{
			return this;
		}
		
				/**
   		 * Header for field DeviceID
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getInterfacesListHeader_DeviceID() {
    		if (icInterfacesListHeader_DeviceID == null)
    		{
				String label = bundle.getString("FInterfaceContainer.DeviceID");
				String binding = expressionPrefix + "interfacesListHeader_DeviceID.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			icInterfacesListHeader_DeviceID = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icInterfacesListHeader_DeviceID).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icInterfacesListHeader_DeviceID).setHeader(true);
			
    		return icInterfacesListHeader_DeviceID;
    	}
				/**
   		 * Header for field isTrusted
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getInterfacesListHeader_IsTrusted() {
    		if (icInterfacesListHeader_IsTrusted == null)
    		{
				String label = bundle.getString("FInterfaceContainer.isTrusted");
				String binding = expressionPrefix + "interfacesListHeader_IsTrusted.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icInterfacesListHeader_IsTrusted = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icInterfacesListHeader_IsTrusted).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icInterfacesListHeader_IsTrusted).setHeader(true);
			
    		return icInterfacesListHeader_IsTrusted;
    	}
		
	
		
	public void reload()
	{
		super.reload();
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesFirewall"};
	}

	public void countAndCreateChildren() throws WbemsmtException {
	
    			try
		{
			int count = adapter.count("interfacesList",org.sblim.wbemsmt.firewall.bl.container.edit.FInterfaceContainer.class, this);
	        if (count != interfacesListCount)
	        {
	           interfacesListCount = count;
	           clearInterfacesList();
			   for (int i=0; i < count ; i++) {
	    			addInterfacesList(new org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfaceContainer_AsInterfacesList_InFInterfacesListContainerImpl((org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter)adapter,expressionPrefix, i));
			   }
	        }
			getInterfacesListPanel().setList(getInterfacesList());				   
		} catch (WbemsmtException e) {
			throw new WbemsmtException(WbemsmtException.ERR_INIT_CONTAINER,e);
		}
    		}


	/**
	 * count and create childrens
	 * @throws WbemsmtException
	 */
	public void updateControls() throws WbemsmtException {
			   countAndCreateChildren();
			   adapter.updateControls(this);
		
			   				      getInterfacesListPanel().updateRows();				
			   		}

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    		childs.addAll(getInterfacesList());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       FInterfacesListContainerImpl source = (FInterfacesListContainerImpl)sourceContainer;
		    		    
    			
    	    		   List<FInterfaceContainer> targetListForInterfacesList = getInterfacesList();
    		   List<FInterfaceContainer> sourceListForInterfacesList = source.getInterfacesList();
    		   if (sourceListForInterfacesList.size() != targetListForInterfacesList.size())
    		   {
    			      throw new WbemsmtException(WbemsmtException.ERR_FAILED,"The Lists are not from same size. Source is " + sourceListForInterfacesList.size() + " and target is " + targetListForInterfacesList.size() );
    		   }
			       for (int ii=0; ii < sourceListForInterfacesList.size(); ii++)
			       {
				          ((DataContainer) targetListForInterfacesList.get(ii)).copyFrom(((DataContainer) sourceListForInterfacesList.get(ii)));
			        }
			
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}