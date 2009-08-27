/** 
  * FirewallManagedPortContainerImpl.java
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
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortContainer;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;

public class FirewallManagedPortContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.firewall.bl.container.edit.FirewallManagedPortContainer
			, org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortContainerHeader		
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_StartPort;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_EndPort;

    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_Protocol;

    			
				private java.util.List<FInterfacesForPortContainer> icInterfacesForPort = new java.util.ArrayList<FInterfacesForPortContainer>();
		
		private MultiLinePanel interfacesForPortPanel;
		private int interfacesForPortCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icInterfacesForPortHeader_DeviceID;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icInterfacesForPortHeader_usr_IsEnabled;
				
	
		
			FirewallManagedPortContainerImplLayouter layouter = null;
		
		public FirewallManagedPortContainerImplLayouter getLayouter()
		{
			return layouter;
		}	
	
	public FirewallManagedPortContainerImpl(org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "FirewallManagedPortContainer.caption",false);
				
				
		
				
    			
    				layouter = new FirewallManagedPortContainerImplLayouter();
			//layout is done in the edit-method of the Editbean
			//layouter.layout(getPanelForCustomLayout(),this,bundle);
				
		setFooter(getPanelForCustomLayout(),"FirewallManagedPortContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_StartPort() {
    		if (ic_StartPort == null)
    		{
				String label = bundle.getString("FirewallManagedPortContainer.StartPort");
				String binding = expressionPrefix + "_StartPort.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_StartPort = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_StartPort;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_EndPort() {
    		if (ic_EndPort == null)
    		{
				String label = bundle.getString("FirewallManagedPortContainer.EndPort");
				String binding = expressionPrefix + "_EndPort.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_EndPort = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_EndPort;
    	}
			/**
		* 
		* DataType INTEGER
		* UIType COMBOBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_Protocol() {
    		if (ic_Protocol == null)
    		{
				String label = bundle.getString("FirewallManagedPortContainer.Protocol");
				String binding = expressionPrefix + "_Protocol.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.IntegerStringConverter();
				boolean readOnly = false;
    			ic_Protocol = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFComboBoxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_Protocol;
    	}
		
			
				
		/**
		* 
		* linked container FInterfacesForPortContainer
		*/
				public java.util.List<FInterfacesForPortContainer> getInterfacesForPort()
				{
						return icInterfacesForPort;
		}
		
		public MultiLinePanel getInterfacesForPortPanel()
		{
			if (interfacesForPortPanel == null)
			{
  			   interfacesForPortPanel = new InterfacesForPortPanel(adapter,expressionPrefix, // the prefix for binding values
							  "#{" +  expressionPrefix + "interfacesForPortPanel", // binding for Title
							  "FInterfacesForPortContainer_AsInterfacesForPort_InFirewallManagedPortContainer.caption", //Key for title
							  org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForPortContainer_AsInterfacesForPort_InFirewallManagedPortContainerImpl.COLS);
			  addInterfacesForPortHeader();							  
			}		
			
			return interfacesForPortPanel;
		}

		static class InterfacesForPortPanel extends MultiLinePanel
		{
			public InterfacesForPortPanel(AbstractBaseCimAdapter adapter, String expressionPrefix, String bindigForTitle, String keyForTitle, int cols) {
				super(adapter, expressionPrefix, bindigForTitle, keyForTitle, "interfacesForPort", cols);
			}
	
			protected String getOrientationOfColumnAsCss(int column) {
				return org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForPortContainer_AsInterfacesForPort_InFirewallManagedPortContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	private void addInterfacesForPort(org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForPortContainer_AsInterfacesForPort_InFirewallManagedPortContainerImpl child) {

		getInterfacesForPort().add(child);
		getInterfacesForPortPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getInterfacesForPort_DeviceIDHeader()).getDependentChildFields().add(child.get_DeviceID());
					//((LabeledJSFInputComponent)getInterfacesForPort_usr_IsEnabledHeader()).getDependentChildFields().add(child.get_usr_IsEnabled());
			}
	
	private void clearInterfacesForPort() {
		getInterfacesForPort().clear();
	}

	/**
	* 
	* Get the InterfacesForPort for the UI repesentation
	*/
	public java.util.List<FInterfacesForPortContainer> getInterfacesForPortForUI()
	{
				
		List<FInterfacesForPortContainer> result = new ArrayList<FInterfacesForPortContainer>();
		result.addAll(icInterfacesForPort);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForPortContainer_AsInterfacesForPort_InFirewallManagedPortContainerImpl item = new org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForPortContainer_AsInterfacesForPort_InFirewallManagedPortContainerImpl((org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter)adapter,expressionPrefix, result.size());
				DataContainerUtil.setVisibilityOfFields(item,false);
				result.add(item);
			} catch (WbemsmtException e) {
				e.printStackTrace();
			}
		}
		
		interfacesForPortPanel.setList(result);
		
		return result;
	}		
		
		
	/**
	 * manages the style for whole footer which is displayed if there are no entries in the table or if there is a custom panel in it
	 * @return
	 */
	public String getInterfacesForPortFooterClass()
	{
		return "multiLineRowHeader center "  
		+ (icInterfacesForPort.size() == 0 || getInterfacesForPortPanel().isHavingCustomFooter() ?  "visible " : "hidden ");
	}
	
	/**
	 * manages the style for the label which is displayed if there are no entries in the table
	 * @return
	 */
	public String getInterfacesForPortAvailableFooterClass()
	{
		return icInterfacesForPort.size() > 0 ? " hidden " : " visible ";
	}
	
	private void addInterfacesForPortHeader() {
		getInterfacesForPortPanel().setHeader(getInterfacesForPortHeaderComponents(),getInterfacesForPortFieldNames());
	}
	
	private LabeledJSFInputComponent[] getInterfacesForPortHeaderComponents() {
		return new LabeledJSFInputComponent[]{
							(LabeledJSFInputComponent)getInterfacesForPortHeader_DeviceID(),
							(LabeledJSFInputComponent)getInterfacesForPortHeader_usr_IsEnabled(),
						};
	}

	private String[] getInterfacesForPortFieldNames() {
		return new String[]{
							"_DeviceID",
							"_usr_IsEnabled",
						};
	}

	   /**
		* Header for:
		* 
		* linked container FInterfacesForPortContainer
		*/
		public org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortContainerHeader getInterfacesForPortHeader()
		{
			return this;
		}
		
				/**
   		 * Header for field DeviceID
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getInterfacesForPortHeader_DeviceID() {
    		if (icInterfacesForPortHeader_DeviceID == null)
    		{
				String label = bundle.getString("FInterfacesForPortContainer.DeviceID");
				String binding = expressionPrefix + "interfacesForPortHeader_DeviceID.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			icInterfacesForPortHeader_DeviceID = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icInterfacesForPortHeader_DeviceID).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icInterfacesForPortHeader_DeviceID).setHeader(true);
			
    		return icInterfacesForPortHeader_DeviceID;
    	}
				/**
   		 * Header for field isEnabled
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getInterfacesForPortHeader_usr_IsEnabled() {
    		if (icInterfacesForPortHeader_usr_IsEnabled == null)
    		{
				String label = bundle.getString("FInterfacesForPortContainer.isEnabled");
				String binding = expressionPrefix + "interfacesForPortHeader_usr_IsEnabled.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icInterfacesForPortHeader_usr_IsEnabled = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icInterfacesForPortHeader_usr_IsEnabled).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)icInterfacesForPortHeader_usr_IsEnabled).setHeader(true);
			
    		return icInterfacesForPortHeader_usr_IsEnabled;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_StartPort != null)
    		{
				ic_StartPort.setLabelText(bundle.getString("FirewallManagedPortContainer.StartPort"));
    		}
	    		if (ic_EndPort != null)
    		{
				ic_EndPort.setLabelText(bundle.getString("FirewallManagedPortContainer.EndPort"));
    		}
	    		if (ic_Protocol != null)
    		{
				ic_Protocol.setLabelText(bundle.getString("FirewallManagedPortContainer.Protocol"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesFirewall"};
	}

	public void countAndCreateChildren() throws WbemsmtException {
	
    			try
		{
			int count = adapter.count("interfacesForPort",org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortContainer.class, this);
	        if (count != interfacesForPortCount)
	        {
	           interfacesForPortCount = count;
	           clearInterfacesForPort();
			   for (int i=0; i < count ; i++) {
	    			addInterfacesForPort(new org.sblim.wbemsmt.firewall.bl.container.edit.jsf.FInterfacesForPortContainer_AsInterfacesForPort_InFirewallManagedPortContainerImpl((org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter)adapter,expressionPrefix, i));
			   }
	        }
			getInterfacesForPortPanel().setList(getInterfacesForPort());				   
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
		
			   				      getInterfacesForPortPanel().updateRows();				
			   		}

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    				fields.add(get_StartPort());
    				fields.add(get_EndPort());
    				fields.add(get_Protocol());
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    		childs.addAll(getInterfacesForPort());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       FirewallManagedPortContainerImpl source = (FirewallManagedPortContainerImpl)sourceContainer;
		    		    
    	    		   get_StartPort().copyFrom(source.get_StartPort());
		        		   get_EndPort().copyFrom(source.get_EndPort());
		        		   get_Protocol().copyFrom(source.get_Protocol());
		    		
    	    		   List<FInterfacesForPortContainer> targetListForInterfacesForPort = getInterfacesForPort();
    		   List<FInterfacesForPortContainer> sourceListForInterfacesForPort = source.getInterfacesForPort();
    		   if (sourceListForInterfacesForPort.size() != targetListForInterfacesForPort.size())
    		   {
    			      throw new WbemsmtException(WbemsmtException.ERR_FAILED,"The Lists are not from same size. Source is " + sourceListForInterfacesForPort.size() + " and target is " + targetListForInterfacesForPort.size() );
    		   }
			       for (int ii=0; ii < sourceListForInterfacesForPort.size(); ii++)
			       {
				          ((DataContainer) targetListForInterfacesForPort.get(ii)).copyFrom(((DataContainer) sourceListForInterfacesForPort.get(ii)));
			        }
			
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}