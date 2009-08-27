/** 
  * FInterfaceContainer_AsInterfacesList_InFInterfacesListContainerImpl.java
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


	
public class FInterfaceContainer_AsInterfacesList_InFInterfacesListContainerImpl extends org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel2 implements org.sblim.wbemsmt.firewall.bl.container.edit.FInterfaceContainer {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_DeviceID;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_IsTrusted;
		
	public static final int COLS = 2;
	
	public static String[] orientationOfColumnAsCss = new String[]{
    				"left",
    				"left",
    		
	};
	
	
	
	public FInterfaceContainer_AsInterfacesList_InFInterfacesListContainerImpl(org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter adapter,String expressionPrefix,int index) throws WbemsmtException {
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
				String label = bundle.getString("FInterfaceContainer.DeviceID");
				String binding = expressionPrefix + "interfacesList["+ index +"]._DeviceID.item";
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_IsTrusted() {
    		if (ic_IsTrusted == null)
    		{
				String label = bundle.getString("FInterfaceContainer.isTrusted");
				String binding = expressionPrefix + "interfacesList["+ index +"]._IsTrusted.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_IsTrusted = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent)ic_IsTrusted).setOrientation( org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_IsTrusted;
    	}
		

	/**
	 * @return all the Components
	 */
	public LabeledJSFInputComponent[] getComponents() {
		return new LabeledJSFInputComponent[]{
						(LabeledJSFInputComponent)get_DeviceID(),
						(LabeledJSFInputComponent)get_IsTrusted(),
					};
	}
	
	
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_DeviceID != null)
    		{
				ic_DeviceID.setLabelText(bundle.getString("FInterfaceContainer.DeviceID"));
    		}
	    		if (ic_IsTrusted != null)
    		{
				ic_IsTrusted.setLabelText(bundle.getString("FInterfaceContainer.isTrusted"));
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
    				fields.add(get_IsTrusted());
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
	    		       FInterfaceContainer_AsInterfacesList_InFInterfacesListContainerImpl source = (FInterfaceContainer_AsInterfacesList_InFInterfacesListContainerImpl)sourceContainer;
		    		    
    	    		   get_DeviceID().copyFrom(source.get_DeviceID());
		        		   get_IsTrusted().copyFrom(source.get_IsTrusted());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
	
	
	
}