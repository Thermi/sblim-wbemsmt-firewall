/** 
  * FInterfacesForServicesListContainerImpl.java
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
import org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;

public class FInterfacesForServicesListContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesListContainer
			, org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainerHeader		
	{
				
				private java.util.List<FInterfacesForServicesContainer> icInterfacesForServiceList = new java.util.ArrayList<FInterfacesForServicesContainer>();
		
		private MultiLinePanel interfacesForServiceListPanel;
		private int interfacesForServiceListCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icInterfacesForServiceListHeader_DeviceID;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icInterfacesForServiceListHeader_usr_IsEnabled;
				
	
			private org.sblim.wbemsmt.firewall.bl.container.edit.FSupportedServicesContainer icServicesList = null;
		
	
	public FInterfacesForServicesListContainerImpl(org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "FInterfacesForServicesListContainer.caption",false);
				
				
		
				String childBindingPrefix = null;
				
    				childBindingPrefix = this.expressionPrefix + "servicesList.";
    		icServicesList 
				= new org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FSupportedServicesContainerImpl((org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter)org.sblim.wbemsmt.bl.adapter.CimAdapterFactory.getInstance()
                         				   .getAdapter(org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter.class,javax.faces.context.FacesContext.getCurrentInstance(),adapter.getCimClient())
					                     ,childBindingPrefix);
    			
    	    						
		setFooter(getPanelForCustomLayout(),"FInterfacesForServicesListContainer.footerText");
		adapter.initContainer(this);
	}
	

		
			
				
		/**
		* 
		* linked container FInterfacesForServicesContainer
		*/
				public java.util.List<FInterfacesForServicesContainer> getInterfacesForServiceList()
				{
						return icInterfacesForServiceList;
		}
		
		public MultiLinePanel getInterfacesForServiceListPanel()
		{
			if (interfacesForServiceListPanel == null)
			{
  			   interfacesForServiceListPanel = new InterfacesForServiceListPanel(adapter,expressionPrefix, // the prefix for binding values
							  "#{" +  expressionPrefix + "interfacesForServiceListPanel", // binding for Title
							  "FInterfacesForServicesContainer_AsInterfacesForServiceList_InFInterfacesForServicesListContainer.caption", //Key for title
							  org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForServicesContainer_AsInterfacesForServiceList_InFInterfacesForServicesListContainerImpl.COLS);
			  addInterfacesForServiceListHeader();							  
			}		
			
			return interfacesForServiceListPanel;
		}

		static class InterfacesForServiceListPanel extends MultiLinePanel
		{
			public InterfacesForServiceListPanel(AbstractBaseCimAdapter adapter, String expressionPrefix, String bindigForTitle, String keyForTitle, int cols) {
				super(adapter, expressionPrefix, bindigForTitle, keyForTitle, "interfacesForServiceList", cols);
			}
	
			protected String getOrientationOfColumnAsCss(int column) {
				return org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForServicesContainer_AsInterfacesForServiceList_InFInterfacesForServicesListContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	private void addInterfacesForServiceList(org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForServicesContainer_AsInterfacesForServiceList_InFInterfacesForServicesListContainerImpl child) {

		getInterfacesForServiceList().add(child);
		getInterfacesForServiceListPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getInterfacesForServiceList_DeviceIDHeader()).getDependentChildFields().add(child.get_DeviceID());
					//((LabeledJSFInputComponent)getInterfacesForServiceList_usr_IsEnabledHeader()).getDependentChildFields().add(child.get_usr_IsEnabled());
			}
	
	private void clearInterfacesForServiceList() {
		getInterfacesForServiceList().clear();
	}

	/**
	* 
	* Get the InterfacesForServiceList for the UI repesentation
	*/
	public java.util.List<FInterfacesForServicesContainer> getInterfacesForServiceListForUI()
	{
				
		List<FInterfacesForServicesContainer> result = new ArrayList<FInterfacesForServicesContainer>();
		result.addAll(icInterfacesForServiceList);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForServicesContainer_AsInterfacesForServiceList_InFInterfacesForServicesListContainerImpl item = new org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForServicesContainer_AsInterfacesForServiceList_InFInterfacesForServicesListContainerImpl((org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter)adapter,expressionPrefix, result.size());
				DataContainerUtil.setVisibilityOfFields(item,false);
				result.add(item);
			} catch (WbemsmtException e) {
				e.printStackTrace();
			}
		}
		
		interfacesForServiceListPanel.setList(result);
		
		return result;
	}		
		
		
	/**
	 * manages the style for whole footer which is displayed if there are no entries in the table or if there is a custom panel in it
	 * @return
	 */
	public String getInterfacesForServiceListFooterClass()
	{
		return "multiLineRowHeader center "  
		+ (icInterfacesForServiceList.size() == 0 || getInterfacesForServiceListPanel().isHavingCustomFooter() ?  "visible " : "hidden ");
	}
	
	/**
	 * manages the style for the label which is displayed if there are no entries in the table
	 * @return
	 */
	public String getInterfacesForServiceListAvailableFooterClass()
	{
		return icInterfacesForServiceList.size() > 0 ? " hidden " : " visible ";
	}
	
	private void addInterfacesForServiceListHeader() {
		getInterfacesForServiceListPanel().setHeader(getInterfacesForServiceListHeaderComponents(),getInterfacesForServiceListFieldNames());
	}
	
	private LabeledJSFInputComponent[] getInterfacesForServiceListHeaderComponents() {
		return new LabeledJSFInputComponent[]{
							(LabeledJSFInputComponent)getInterfacesForServiceListHeader_DeviceID(),
							(LabeledJSFInputComponent)getInterfacesForServiceListHeader_usr_IsEnabled(),
						};
	}

	private String[] getInterfacesForServiceListFieldNames() {
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
		public org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainerHeader getInterfacesForServiceListHeader()
		{
			return this;
		}
		
				/**
   		 * Header for field DeviceID
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getInterfacesForServiceListHeader_DeviceID() {
    		if (icInterfacesForServiceListHeader_DeviceID == null)
    		{
				String label = bundle.getString("FInterfacesForServicesContainer.DeviceID");
				String binding = expressionPrefix + "interfacesForServiceListHeader_DeviceID.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			icInterfacesForServiceListHeader_DeviceID = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icInterfacesForServiceListHeader_DeviceID).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icInterfacesForServiceListHeader_DeviceID).setHeader(true);
			
    		return icInterfacesForServiceListHeader_DeviceID;
    	}
				/**
   		 * Header for field isEnabled
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getInterfacesForServiceListHeader_usr_IsEnabled() {
    		if (icInterfacesForServiceListHeader_usr_IsEnabled == null)
    		{
				String label = bundle.getString("FInterfacesForServicesContainer.isEnabled");
				String binding = expressionPrefix + "interfacesForServiceListHeader_usr_IsEnabled.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icInterfacesForServiceListHeader_usr_IsEnabled = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icInterfacesForServiceListHeader_usr_IsEnabled).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icInterfacesForServiceListHeader_usr_IsEnabled).setHeader(true);
			
    		return icInterfacesForServiceListHeader_usr_IsEnabled;
    	}
		
	
			
		/**
		* 
		* linked container FSupportedServicesContainer
		*/
				public org.sblim.wbemsmt.firewall.bl.container.edit.FSupportedServicesContainer getServicesList()
					{
						return icServicesList;
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
			int count = adapter.count("interfacesForServiceList",org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainer.class, this);
	        if (count != interfacesForServiceListCount)
	        {
	           interfacesForServiceListCount = count;
	           clearInterfacesForServiceList();
			   for (int i=0; i < count ; i++) {
	    			addInterfacesForServiceList(new org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForServicesContainer_AsInterfacesForServiceList_InFInterfacesForServicesListContainerImpl((org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter)adapter,expressionPrefix, i));
			   }
	        }
			getInterfacesForServiceListPanel().setList(getInterfacesForServiceList());				   
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
		
			   				      getInterfacesForServiceListPanel().updateRows();				
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
    	    		childs.addAll(getInterfacesForServiceList());
    	    	    		childs.add(getServicesList());
				return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       FInterfacesForServicesListContainerImpl source = (FInterfacesForServicesListContainerImpl)sourceContainer;
		    		    
    			
    	    		   List<FInterfacesForServicesContainer> targetListForInterfacesForServiceList = getInterfacesForServiceList();
    		   List<FInterfacesForServicesContainer> sourceListForInterfacesForServiceList = source.getInterfacesForServiceList();
    		   if (sourceListForInterfacesForServiceList.size() != targetListForInterfacesForServiceList.size())
    		   {
    			      throw new WbemsmtException(WbemsmtException.ERR_FAILED,"The Lists are not from same size. Source is " + sourceListForInterfacesForServiceList.size() + " and target is " + targetListForInterfacesForServiceList.size() );
    		   }
			       for (int ii=0; ii < sourceListForInterfacesForServiceList.size(); ii++)
			       {
				          ((DataContainer) targetListForInterfacesForServiceList.get(ii)).copyFrom(((DataContainer) sourceListForInterfacesForServiceList.get(ii)));
			        }
			
    	    	    		   getServicesList().copyFrom(source.getServicesList());
		    	}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}





	public LabeledBaseHeaderComponentIf getInterfacesListHeader_DeviceID() {
		// TODO Auto-generated method stub
		return null;
	}




	public LabeledBaseHeaderComponentIf getInterfacesListHeader_usr_IsEnabled() {
		// TODO Auto-generated method stub
		return null;
	}		

	
}