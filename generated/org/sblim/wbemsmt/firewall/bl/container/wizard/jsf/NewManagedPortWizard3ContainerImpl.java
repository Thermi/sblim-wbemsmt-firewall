/** 
  * NewManagedPortWizard3ContainerImpl.java
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

package org.sblim.wbemsmt.firewall.bl.container.wizard.jsf;

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortSummaryContainer;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;

public class NewManagedPortWizard3ContainerImpl extends org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel implements org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard3Container
			, org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortSummaryContainerHeader		
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_StartPort;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_EndPort;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Protocol;

    			
				private java.util.List<FInterfacesForPortSummaryContainer> icInterfacesListForPortSummary = new java.util.ArrayList<FInterfacesForPortSummaryContainer>();
		
		private MultiLinePanel interfacesListForPortSummaryPanel;
		private int interfacesListForPortSummaryCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icInterfacesListForPortSummaryHeader_DeviceID;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icInterfacesListForPortSummaryHeader_usr_IsEnabled;
				
	
		
	
	public NewManagedPortWizard3ContainerImpl(org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "NewManagedPortWizard3Container.caption","NewManagedPortWizard3Container.subTitle",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_StartPort());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_EndPort());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Protocol());
        					
		setFooter(getPanelForCustomLayout(),"NewManagedPortWizard3Container.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_StartPort() {
    		if (ic_usr_StartPort == null)
    		{
				String label = bundle.getString("NewManagedPortWizard3Container.StartPort");
				String binding = expressionPrefix + "_usr_StartPort.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_usr_StartPort = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_StartPort;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_EndPort() {
    		if (ic_usr_EndPort == null)
    		{
				String label = bundle.getString("NewManagedPortWizard3Container.EndPort");
				String binding = expressionPrefix + "_usr_EndPort.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_usr_EndPort = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_EndPort;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly true
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Protocol() {
    		if (ic_usr_Protocol == null)
    		{
				String label = bundle.getString("NewManagedPortWizard3Container.Protocol");
				String binding = expressionPrefix + "_usr_Protocol.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_usr_Protocol = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Protocol;
    	}
		
			
				
		/**
		* 
		* linked container FInterfacesForPortSummaryContainer
		*/
				public java.util.List<FInterfacesForPortSummaryContainer> getInterfacesListForPortSummary()
				{
						return icInterfacesListForPortSummary;
		}
		
		public MultiLinePanel getInterfacesListForPortSummaryPanel()
		{
			if (interfacesListForPortSummaryPanel == null)
			{
  			   interfacesListForPortSummaryPanel = new InterfacesListForPortSummaryPanel(adapter,expressionPrefix, // the prefix for binding values
							  "#{" +  expressionPrefix + "interfacesListForPortSummaryPanel", // binding for Title
							  "FInterfacesForPortSummaryContainer_AsInterfacesListForPortSummary_InNewManagedPortWizard3Container.caption", //Key for title
							  org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForPortSummaryContainer_AsInterfacesListForPortSummary_InNewManagedPortWizard3ContainerImpl.COLS);
			  addInterfacesListForPortSummaryHeader();							  
			}		
			
			return interfacesListForPortSummaryPanel;
		}

		static class InterfacesListForPortSummaryPanel extends MultiLinePanel
		{
			public InterfacesListForPortSummaryPanel(AbstractBaseCimAdapter adapter, String expressionPrefix, String bindigForTitle, String keyForTitle, int cols) {
				super(adapter, expressionPrefix, bindigForTitle, keyForTitle, "interfacesListForPortSummary", cols);
			}
	
			protected String getOrientationOfColumnAsCss(int column) {
				return org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForPortSummaryContainer_AsInterfacesListForPortSummary_InNewManagedPortWizard3ContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	private void addInterfacesListForPortSummary(org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForPortSummaryContainer_AsInterfacesListForPortSummary_InNewManagedPortWizard3ContainerImpl child) {

		getInterfacesListForPortSummary().add(child);
		getInterfacesListForPortSummaryPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getInterfacesListForPortSummary_DeviceIDHeader()).getDependentChildFields().add(child.get_DeviceID());
					//((LabeledJSFInputComponent)getInterfacesListForPortSummary_usr_IsEnabledHeader()).getDependentChildFields().add(child.get_usr_IsEnabled());
			}
	
	private void clearInterfacesListForPortSummary() {
		getInterfacesListForPortSummary().clear();
	}

	/**
	* 
	* Get the InterfacesListForPortSummary for the UI repesentation
	*/
	public java.util.List<FInterfacesForPortSummaryContainer> getInterfacesListForPortSummaryForUI()
	{
				
		List<FInterfacesForPortSummaryContainer> result = new ArrayList<FInterfacesForPortSummaryContainer>();
		result.addAll(icInterfacesListForPortSummary);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForPortSummaryContainer_AsInterfacesListForPortSummary_InNewManagedPortWizard3ContainerImpl item = new org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForPortSummaryContainer_AsInterfacesListForPortSummary_InNewManagedPortWizard3ContainerImpl((org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter)adapter,expressionPrefix, result.size());
				DataContainerUtil.setVisibilityOfFields(item,false);
				result.add(item);
			} catch (WbemsmtException e) {
				e.printStackTrace();
			}
		}
		
		interfacesListForPortSummaryPanel.setList(result);
		
		return result;
	}		
		
		
	/**
	 * manages the style for whole footer which is displayed if there are no entries in the table or if there is a custom panel in it
	 * @return
	 */
	public String getInterfacesListForPortSummaryFooterClass()
	{
		return "multiLineRowHeader center "  
		+ (icInterfacesListForPortSummary.size() == 0 || getInterfacesListForPortSummaryPanel().isHavingCustomFooter() ?  "visible " : "hidden ");
	}
	
	/**
	 * manages the style for the label which is displayed if there are no entries in the table
	 * @return
	 */
	public String getInterfacesListForPortSummaryAvailableFooterClass()
	{
		return icInterfacesListForPortSummary.size() > 0 ? " hidden " : " visible ";
	}
	
	private void addInterfacesListForPortSummaryHeader() {
		getInterfacesListForPortSummaryPanel().setHeader(getInterfacesListForPortSummaryHeaderComponents(),getInterfacesListForPortSummaryFieldNames());
	}
	
	private LabeledJSFInputComponent[] getInterfacesListForPortSummaryHeaderComponents() {
		return new LabeledJSFInputComponent[]{
							(LabeledJSFInputComponent)getInterfacesListForPortSummaryHeader_DeviceID(),
							(LabeledJSFInputComponent)getInterfacesListForPortSummaryHeader_usr_IsEnabled(),
						};
	}

	private String[] getInterfacesListForPortSummaryFieldNames() {
		return new String[]{
							"_DeviceID",
							"_usr_IsEnabled",
						};
	}

	   /**
		* Header for:
		* 
		* linked container FInterfacesForPortSummaryContainer
		*/
		public org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortSummaryContainerHeader getInterfacesListForPortSummaryHeader()
		{
			return this;
		}
		
				/**
   		 * Header for field DeviceID
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getInterfacesListForPortSummaryHeader_DeviceID() {
    		if (icInterfacesListForPortSummaryHeader_DeviceID == null)
    		{
				String label = bundle.getString("FInterfacesForPortSummaryContainer.DeviceID");
				String binding = expressionPrefix + "interfacesListForPortSummaryHeader_DeviceID.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			icInterfacesListForPortSummaryHeader_DeviceID = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icInterfacesListForPortSummaryHeader_DeviceID).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icInterfacesListForPortSummaryHeader_DeviceID).setHeader(true);
			
    		return icInterfacesListForPortSummaryHeader_DeviceID;
    	}
				/**
   		 * Header for field isEnabled
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getInterfacesListForPortSummaryHeader_usr_IsEnabled() {
    		if (icInterfacesListForPortSummaryHeader_usr_IsEnabled == null)
    		{
				String label = bundle.getString("FInterfacesForPortSummaryContainer.isEnabled");
				String binding = expressionPrefix + "interfacesListForPortSummaryHeader_usr_IsEnabled.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			icInterfacesListForPortSummaryHeader_usr_IsEnabled = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icInterfacesListForPortSummaryHeader_usr_IsEnabled).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icInterfacesListForPortSummaryHeader_usr_IsEnabled).setHeader(true);
			
    		return icInterfacesListForPortSummaryHeader_usr_IsEnabled;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_StartPort != null)
    		{
				ic_usr_StartPort.setLabelText(bundle.getString("NewManagedPortWizard3Container.StartPort"));
    		}
	    		if (ic_usr_EndPort != null)
    		{
				ic_usr_EndPort.setLabelText(bundle.getString("NewManagedPortWizard3Container.EndPort"));
    		}
	    		if (ic_usr_Protocol != null)
    		{
				ic_usr_Protocol.setLabelText(bundle.getString("NewManagedPortWizard3Container.Protocol"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesFirewall"};
	}

	public void countAndCreateChildren() throws WbemsmtException {
	
    			try
		{
			int count = adapter.count("interfacesListForPortSummary",org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortSummaryContainer.class, this);
	        if (count != interfacesListForPortSummaryCount)
	        {
	           interfacesListForPortSummaryCount = count;
	           clearInterfacesListForPortSummary();
			   for (int i=0; i < count ; i++) {
	    			addInterfacesListForPortSummary(new org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForPortSummaryContainer_AsInterfacesListForPortSummary_InNewManagedPortWizard3ContainerImpl((org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter)adapter,expressionPrefix, i));
			   }
	        }
			getInterfacesListForPortSummaryPanel().setList(getInterfacesListForPortSummary());				   
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
		
			   				      getInterfacesListForPortSummaryPanel().updateRows();				
			   		}

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    				fields.add(get_usr_StartPort());
    				fields.add(get_usr_EndPort());
    				fields.add(get_usr_Protocol());
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    		childs.addAll(getInterfacesListForPortSummary());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       NewManagedPortWizard3ContainerImpl source = (NewManagedPortWizard3ContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_StartPort().copyFrom(source.get_usr_StartPort());
		        		   get_usr_EndPort().copyFrom(source.get_usr_EndPort());
		        		   get_usr_Protocol().copyFrom(source.get_usr_Protocol());
		    		
    	    		   List<FInterfacesForPortSummaryContainer> targetListForInterfacesListForPortSummary = getInterfacesListForPortSummary();
    		   List<FInterfacesForPortSummaryContainer> sourceListForInterfacesListForPortSummary = source.getInterfacesListForPortSummary();
    		   if (sourceListForInterfacesListForPortSummary.size() != targetListForInterfacesListForPortSummary.size())
    		   {
    			      throw new WbemsmtException(WbemsmtException.ERR_FAILED,"The Lists are not from same size. Source is " + sourceListForInterfacesListForPortSummary.size() + " and target is " + targetListForInterfacesListForPortSummary.size() );
    		   }
			       for (int ii=0; ii < sourceListForInterfacesListForPortSummary.size(); ii++)
			       {
				          ((DataContainer) targetListForInterfacesListForPortSummary.get(ii)).copyFrom(((DataContainer) sourceListForInterfacesListForPortSummary.get(ii)));
			        }
			
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}