/** 
  * FInterfacesForPortContainer_AsInterfacesForPort_InFirewallManagedPortContainerImpl.java
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
  * @template: org/sblim/wbemsmt/dcg/templates/jsf/containerImplMultiLine.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.firewall.bl.container.edit.jsf;

import java.util.*;
import org.sblim.wbemsmt.tools.input.jsf.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;


	
public class FInterfacesForPortContainer_AsInterfacesForPort_InFirewallManagedPortContainerImpl extends org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel2 implements org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortContainer {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DeviceID;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_IsEnabled;
		
	public static final int COLS = 2;
	
	public static String[] orientationOfColumnAsCss = new String[]{
    				"left",
    				"left",
    		
	};
	
	
	
	public FInterfacesForPortContainer_AsInterfacesForPort_InFirewallManagedPortContainerImpl(org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter adapter,String expressionPrefix,int index) throws WbemsmtException {
	    super(adapter,expressionPrefix,index);
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly true
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_DeviceID() {
    		if (ic_DeviceID == null)
    		{
				String label = bundle.getString("FInterfacesForPortContainer.DeviceID");
				String binding = expressionPrefix + "interfacesForPort["+ index +"]._DeviceID.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = true;
    			ic_DeviceID = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)ic_DeviceID).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_DeviceID;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_IsEnabled() {
    		if (ic_usr_IsEnabled == null)
    		{
				String label = bundle.getString("FInterfacesForPortContainer.isEnabled");
				String binding = expressionPrefix + "interfacesForPort["+ index +"]._usr_IsEnabled.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_IsEnabled = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)ic_usr_IsEnabled).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_usr_IsEnabled;
    	}
		

	/**
	 * @return all the Components
	 */
	public LabeledJSFInputComponent[] getComponents() {
		return new LabeledJSFInputComponent[]{
						(LabeledJSFInputComponent)get_DeviceID(),
						(LabeledJSFInputComponent)get_usr_IsEnabled(),
					};
	}
	
	
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_DeviceID != null)
    		{
				ic_DeviceID.setLabelText(bundle.getString("FInterfacesForPortContainer.DeviceID"));
    		}
	    		if (ic_usr_IsEnabled != null)
    		{
				ic_usr_IsEnabled.setLabelText(bundle.getString("FInterfacesForPortContainer.isEnabled"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesFirewall"};
	}
	
	protected String getOrientationOfColumnAsCss(int column) {
		return orientationOfColumnAsCss[column];
	}
	

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    				fields.add(get_DeviceID());
    				fields.add(get_usr_IsEnabled());
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
	    		       FInterfacesForPortContainer_AsInterfacesForPort_InFirewallManagedPortContainerImpl source = (FInterfacesForPortContainer_AsInterfacesForPort_InFirewallManagedPortContainerImpl)sourceContainer;
		    		    
    	    		   get_DeviceID().copyFrom(source.get_DeviceID());
		        		   get_usr_IsEnabled().copyFrom(source.get_usr_IsEnabled());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
	
	
	
}