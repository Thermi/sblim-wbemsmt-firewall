/** 
  * FSupportedServicesWithInterfacesContainerImpl.java
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
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainer;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;

public class FSupportedServicesWithInterfacesContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.firewall.bl.container.edit.FSupportedServicesWithInterfacesContainer
			, org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainerHeader		
	{
				
				private java.util.List<FInterfacesForServicesContainer> icInterfacesList = new java.util.ArrayList<FInterfacesForServicesContainer>();
		
		private MultiLinePanel interfacesListPanel;
		private int interfacesListCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icInterfacesListHeader_DeviceID;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icInterfacesListHeader_usr_IsEnabled;
				
	
			private org.sblim.wbemsmt.firewall.bl.container.edit.FSupportedServicesContainer icServiceList = null;
		
			FSupportedServicesWithInterfacesContainerImplLayouter layouter = null;
		
		public FSupportedServicesWithInterfacesContainerImplLayouter getLayouter()
		{
			return layouter;
		}	
	
	public FSupportedServicesWithInterfacesContainerImpl(org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "FSupportedServicesWithInterfacesContainer.caption",false);
				
				
		
				String childBindingPrefix = null;
				
    				childBindingPrefix = this.expressionPrefix + "serviceList.";
    		icServiceList 
				= new org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FSupportedServicesContainerImpl((org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter)org.sblim.wbemsmt.bl.adapter.CimAdapterFactory.getInstance()
                         				   .getAdapter(org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter.class,javax.faces.context.FacesContext.getCurrentInstance(),adapter.getCimClient())
					                     ,childBindingPrefix);
    			
    				layouter = new FSupportedServicesWithInterfacesContainerImplLayouter();
			//layout is done in the edit-method of the Editbean
			//layouter.layout(getPanelForCustomLayout(),this,bundle);
				
		setFooter(getPanelForCustomLayout(),"FSupportedServicesWithInterfacesContainer.footerText");
		adapter.initContainer(this);
	}
	

		
			
				
		/**
		* 
		* linked container FInterfacesForServicesContainer
		*/
				public java.util.List<FInterfacesForServicesContainer> getInterfacesList()
				{
						return icInterfacesList;
		}
		
		public MultiLinePanel getInterfacesListPanel()
		{
			if (interfacesListPanel == null)
			{
  			   interfacesListPanel = new InterfacesListPanel(adapter,expressionPrefix, // the prefix for binding values
							  "#{" +  expressionPrefix + "interfacesListPanel", // binding for Title
							  "FInterfacesForServicesContainer_AsInterfacesList_InFSupportedServicesWithInterfacesContainer.caption", //Key for title
							  org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForServicesContainer_AsInterfacesList_InFSupportedServicesWithInterfacesContainerImpl.COLS);
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
				return org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForServicesContainer_AsInterfacesList_InFSupportedServicesWithInterfacesContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	private void addInterfacesList(org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForServicesContainer_AsInterfacesList_InFSupportedServicesWithInterfacesContainerImpl child) {

		getInterfacesList().add(child);
		getInterfacesListPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getInterfacesList_DeviceIDHeader()).getDependentChildFields().add(child.get_DeviceID());
					//((LabeledJSFInputComponent)getInterfacesList_usr_IsEnabledHeader()).getDependentChildFields().add(child.get_usr_IsEnabled());
			}
	
	private void clearInterfacesList() {
		getInterfacesList().clear();
	}

	/**
	* 
	* Get the InterfacesList for the UI repesentation
	*/
	public java.util.List<FInterfacesForServicesContainer> getInterfacesListForUI()
	{
				
		List<FInterfacesForServicesContainer> result = new ArrayList<FInterfacesForServicesContainer>();
		result.addAll(icInterfacesList);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForServicesContainer_AsInterfacesList_InFSupportedServicesWithInterfacesContainerImpl item = new org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForServicesContainer_AsInterfacesList_InFSupportedServicesWithInterfacesContainerImpl((org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter)adapter,expressionPrefix, result.size());
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
							(LabeledJSFInputComponent)getInterfacesListHeader_usr_IsEnabled(),
						};
	}

	private String[] getInterfacesListFieldNames() {
		return new String[]{
							"_DeviceID",
							"_usr_IsEnabled",
						};
	}

	   /**
		* Header for:
		* 
		* linked container FInterfacesForServicesContainer
		*/
		public org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainerHeader getInterfacesListHeader()
		{
			return this;
		}
		
				/**
   		 * Header for field DeviceID
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getInterfacesListHeader_DeviceID() {
    		if (icInterfacesListHeader_DeviceID == null)
    		{
				String label = bundle.getString("FInterfacesForServicesContainer.DeviceID");
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
   		 * Header for field isEnabled
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getInterfacesListHeader_usr_IsEnabled() {
    		if (icInterfacesListHeader_usr_IsEnabled == null)
    		{
				String label = bundle.getString("FInterfacesForServicesContainer.isEnabled");
				String binding = expressionPrefix + "interfacesListHeader_usr_IsEnabled.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icInterfacesListHeader_usr_IsEnabled = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icInterfacesListHeader_usr_IsEnabled).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icInterfacesListHeader_usr_IsEnabled).setHeader(true);
			
    		return icInterfacesListHeader_usr_IsEnabled;
    	}
		
	
			
		/**
		* 
		* linked container FSupportedServicesContainer
		*/
				public org.sblim.wbemsmt.firewall.bl.container.edit.FSupportedServicesContainer getServiceList()
					{
						return icServiceList;
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
			int count = adapter.count("interfacesList",org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainer.class, this);
	        if (count != interfacesListCount)
	        {
	           interfacesListCount = count;
	           clearInterfacesList();
			   for (int i=0; i < count ; i++) {
	    			addInterfacesList(new org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForServicesContainer_AsInterfacesList_InFSupportedServicesWithInterfacesContainerImpl((org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter)adapter,expressionPrefix, i));
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
    	    	    		childs.add(getServiceList());
				return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       FSupportedServicesWithInterfacesContainerImpl source = (FSupportedServicesWithInterfacesContainerImpl)sourceContainer;
		    		    
    			
    	    		   List<FInterfacesForServicesContainer> targetListForInterfacesList = getInterfacesList();
    		   List<FInterfacesForServicesContainer> sourceListForInterfacesList = source.getInterfacesList();
    		   if (sourceListForInterfacesList.size() != targetListForInterfacesList.size())
    		   {
    			      throw new WbemsmtException(WbemsmtException.ERR_FAILED,"The Lists are not from same size. Source is " + sourceListForInterfacesList.size() + " and target is " + targetListForInterfacesList.size() );
    		   }
			       for (int ii=0; ii < sourceListForInterfacesList.size(); ii++)
			       {
				          ((DataContainer) targetListForInterfacesList.get(ii)).copyFrom(((DataContainer) sourceListForInterfacesList.get(ii)));
			        }
			
    	    	    		   getServiceList().copyFrom(source.getServiceList());
		    	}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}