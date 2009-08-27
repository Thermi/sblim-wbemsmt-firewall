/** 
  * NewManagedPortWizard2ContainerImpl.java
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
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainer;
import org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;

public class NewManagedPortWizard2ContainerImpl extends org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel implements org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard2Container
			, org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainerHeader		
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_StartPort;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_EndPort;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Protocol;

    			
				private java.util.List<FInterfacesForServicesContainer> icInterfacesListForPort = new java.util.ArrayList<FInterfacesForServicesContainer>();
		
		private MultiLinePanel interfacesListForPortPanel;
		private int interfacesListForPortCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icInterfacesListForPortHeader_DeviceID;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icInterfacesListForPortHeader_usr_IsEnabled;
				
	
		
	
	public NewManagedPortWizard2ContainerImpl(org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "NewManagedPortWizard2Container.caption","NewManagedPortWizard2Container.subTitle",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_StartPort());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_EndPort());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Protocol());
        					
		setFooter(getPanelForCustomLayout(),"NewManagedPortWizard2Container.footerText");
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
				String label = bundle.getString("NewManagedPortWizard2Container.StartPort");
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
				String label = bundle.getString("NewManagedPortWizard2Container.EndPort");
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
				String label = bundle.getString("NewManagedPortWizard2Container.Protocol");
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
		* linked container FInterfacesForServicesContainer
		*/
				public java.util.List<FInterfacesForServicesContainer> getInterfacesListForPort()
				{
						return icInterfacesListForPort;
		}
		
		public MultiLinePanel getInterfacesListForPortPanel()
		{
			if (interfacesListForPortPanel == null)
			{
  			   interfacesListForPortPanel = new InterfacesListForPortPanel(adapter,expressionPrefix, // the prefix for binding values
							  "#{" +  expressionPrefix + "interfacesListForPortPanel", // binding for Title
							  "FInterfacesForServicesContainer_AsInterfacesListForPort_InNewManagedPortWizard2Container.caption", //Key for title
							  org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForServicesContainer_AsInterfacesListForPort_InNewManagedPortWizard2ContainerImpl.COLS);
			  addInterfacesListForPortHeader();							  
			}		
			
			return interfacesListForPortPanel;
		}

		static class InterfacesListForPortPanel extends MultiLinePanel
		{
			public InterfacesListForPortPanel(AbstractBaseCimAdapter adapter, String expressionPrefix, String bindigForTitle, String keyForTitle, int cols) {
				super(adapter, expressionPrefix, bindigForTitle, keyForTitle, "interfacesListForPort", cols);
			}
	
			protected String getOrientationOfColumnAsCss(int column) {
				return org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForServicesContainer_AsInterfacesListForPort_InNewManagedPortWizard2ContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	private void addInterfacesListForPort(org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForServicesContainer_AsInterfacesListForPort_InNewManagedPortWizard2ContainerImpl child) {

		getInterfacesListForPort().add(child);
		getInterfacesListForPortPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getInterfacesListForPort_DeviceIDHeader()).getDependentChildFields().add(child.get_DeviceID());
					//((LabeledJSFInputComponent)getInterfacesListForPort_usr_IsEnabledHeader()).getDependentChildFields().add(child.get_usr_IsEnabled());
			}
	
	private void clearInterfacesListForPort() {
		getInterfacesListForPort().clear();
	}

	/**
	* 
	* Get the InterfacesListForPort for the UI repesentation
	*/
	public java.util.List<FInterfacesForServicesContainer> getInterfacesListForPortForUI()
	{
				
		List<FInterfacesForServicesContainer> result = new ArrayList<FInterfacesForServicesContainer>();
		result.addAll(icInterfacesListForPort);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForServicesContainer_AsInterfacesListForPort_InNewManagedPortWizard2ContainerImpl item = new org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForServicesContainer_AsInterfacesListForPort_InNewManagedPortWizard2ContainerImpl((org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter)adapter,expressionPrefix, result.size());
				DataContainerUtil.setVisibilityOfFields(item,false);
				result.add(item);
			} catch (WbemsmtException e) {
				e.printStackTrace();
			}
		}
		
		interfacesListForPortPanel.setList(result);
		
		return result;
	}		
		
		
	/**
	 * manages the style for whole footer which is displayed if there are no entries in the table or if there is a custom panel in it
	 * @return
	 */
	public String getInterfacesListForPortFooterClass()
	{
		return "multiLineRowHeader center "  
		+ (icInterfacesListForPort.size() == 0 || getInterfacesListForPortPanel().isHavingCustomFooter() ?  "visible " : "hidden ");
	}
	
	/**
	 * manages the style for the label which is displayed if there are no entries in the table
	 * @return
	 */
	public String getInterfacesListForPortAvailableFooterClass()
	{
		return icInterfacesListForPort.size() > 0 ? " hidden " : " visible ";
	}
	
	private void addInterfacesListForPortHeader() {
		getInterfacesListForPortPanel().setHeader(getInterfacesListForPortHeaderComponents(),getInterfacesListForPortFieldNames());
	}
	
	private LabeledJSFInputComponent[] getInterfacesListForPortHeaderComponents() {
		return new LabeledJSFInputComponent[]{
							(LabeledJSFInputComponent)getInterfacesListForPortHeader_DeviceID(),
							(LabeledJSFInputComponent)getInterfacesListForPortHeader_usr_IsEnabled(),
						};
	}

	private String[] getInterfacesListForPortFieldNames() {
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
		public org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainerHeader getInterfacesListForPortHeader()
		{
			return this;
		}
		
				/**
   		 * Header for field DeviceID
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getInterfacesListForPortHeader_DeviceID() {
    		if (icInterfacesListForPortHeader_DeviceID == null)
    		{
				String label = bundle.getString("FInterfacesForServicesContainer.DeviceID");
				String binding = expressionPrefix + "interfacesListForPortHeader_DeviceID.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			icInterfacesListForPortHeader_DeviceID = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icInterfacesListForPortHeader_DeviceID).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icInterfacesListForPortHeader_DeviceID).setHeader(true);
			
    		return icInterfacesListForPortHeader_DeviceID;
    	}
				/**
   		 * Header for field isEnabled
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getInterfacesListForPortHeader_usr_IsEnabled() {
    		if (icInterfacesListForPortHeader_usr_IsEnabled == null)
    		{
				String label = bundle.getString("FInterfacesForServicesContainer.isEnabled");
				String binding = expressionPrefix + "interfacesListForPortHeader_usr_IsEnabled.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icInterfacesListForPortHeader_usr_IsEnabled = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icInterfacesListForPortHeader_usr_IsEnabled).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icInterfacesListForPortHeader_usr_IsEnabled).setHeader(true);
			
    		return icInterfacesListForPortHeader_usr_IsEnabled;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_StartPort != null)
    		{
				ic_usr_StartPort.setLabelText(bundle.getString("NewManagedPortWizard2Container.StartPort"));
    		}
	    		if (ic_usr_EndPort != null)
    		{
				ic_usr_EndPort.setLabelText(bundle.getString("NewManagedPortWizard2Container.EndPort"));
    		}
	    		if (ic_usr_Protocol != null)
    		{
				ic_usr_Protocol.setLabelText(bundle.getString("NewManagedPortWizard2Container.Protocol"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesFirewall"};
	}

	public void countAndCreateChildren() throws WbemsmtException {
	
    			try
		{
			int count = adapter.count("interfacesListForPort",org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainer.class, this);
	        if (count != interfacesListForPortCount)
	        {
	           interfacesListForPortCount = count;
	           clearInterfacesListForPort();
			   for (int i=0; i < count ; i++) {
	    			addInterfacesListForPort(new org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForServicesContainer_AsInterfacesListForPort_InNewManagedPortWizard2ContainerImpl((org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter)adapter,expressionPrefix, i));
			   }
	        }
			getInterfacesListForPortPanel().setList(getInterfacesListForPort());				   
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
		
			   				      getInterfacesListForPortPanel().updateRows();				
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
    	    		childs.addAll(getInterfacesListForPort());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       NewManagedPortWizard2ContainerImpl source = (NewManagedPortWizard2ContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_StartPort().copyFrom(source.get_usr_StartPort());
		        		   get_usr_EndPort().copyFrom(source.get_usr_EndPort());
		        		   get_usr_Protocol().copyFrom(source.get_usr_Protocol());
		    		
    	    		   List<FInterfacesForServicesContainer> targetListForInterfacesListForPort = getInterfacesListForPort();
    		   List<FInterfacesForServicesContainer> sourceListForInterfacesListForPort = source.getInterfacesListForPort();
    		   if (sourceListForInterfacesListForPort.size() != targetListForInterfacesListForPort.size())
    		   {
    			      throw new WbemsmtException(WbemsmtException.ERR_FAILED,"The Lists are not from same size. Source is " + sourceListForInterfacesListForPort.size() + " and target is " + targetListForInterfacesListForPort.size() );
    		   }
			       for (int ii=0; ii < sourceListForInterfacesListForPort.size(); ii++)
			       {
				          ((DataContainer) targetListForInterfacesListForPort.get(ii)).copyFrom(((DataContainer) sourceListForInterfacesListForPort.get(ii)));
			        }
			
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