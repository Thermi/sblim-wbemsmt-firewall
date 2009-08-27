/** 
  * FirewallServiceOptionsContainerImpl.java
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

public class FirewallServiceOptionsContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.firewall.bl.container.edit.FirewallServiceOptionsContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_IPTABLES_MODULES;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_IPTABLES_MODULES_UNLOAD;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_IPTABLES_SAVE_COUNTER;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_IPTABLES_SAVE_ON_RESTART;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_IPTABLES_SAVE_ON_STOP;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_IPTABLES_STATUS_LINENUMBERS;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_IPTABLES_STATUS_NUMERIC;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_IPTABLES_STATUS_VERBOSE;

    	
		
	
	public FirewallServiceOptionsContainerImpl(org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "FirewallServiceOptionsContainer.caption",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_IPTABLES_MODULES());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_IPTABLES_MODULES_UNLOAD());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_IPTABLES_SAVE_COUNTER());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_IPTABLES_SAVE_ON_RESTART());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_IPTABLES_SAVE_ON_STOP());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_IPTABLES_STATUS_LINENUMBERS());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_IPTABLES_STATUS_NUMERIC());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_IPTABLES_STATUS_VERBOSE());
        					
		setFooter(getPanelForCustomLayout(),"FirewallServiceOptionsContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_IPTABLES_MODULES() {
    		if (ic_IPTABLES_MODULES == null)
    		{
				String label = bundle.getString("FirewallServiceOptionsContainer.IPTABLES_MODULES");
				String binding = expressionPrefix + "_IPTABLES_MODULES.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_IPTABLES_MODULES = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_IPTABLES_MODULES;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_IPTABLES_MODULES_UNLOAD() {
    		if (ic_IPTABLES_MODULES_UNLOAD == null)
    		{
				String label = bundle.getString("FirewallServiceOptionsContainer.IPTABLES_MODULES_UNLOAD");
				String binding = expressionPrefix + "_IPTABLES_MODULES_UNLOAD.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_IPTABLES_MODULES_UNLOAD = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_IPTABLES_MODULES_UNLOAD;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_IPTABLES_SAVE_COUNTER() {
    		if (ic_IPTABLES_SAVE_COUNTER == null)
    		{
				String label = bundle.getString("FirewallServiceOptionsContainer.IPTABLES_SAVE_COUNTER");
				String binding = expressionPrefix + "_IPTABLES_SAVE_COUNTER.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_IPTABLES_SAVE_COUNTER = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_IPTABLES_SAVE_COUNTER;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_IPTABLES_SAVE_ON_RESTART() {
    		if (ic_IPTABLES_SAVE_ON_RESTART == null)
    		{
				String label = bundle.getString("FirewallServiceOptionsContainer.IPTABLES_SAVE_ON_RESTART");
				String binding = expressionPrefix + "_IPTABLES_SAVE_ON_RESTART.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_IPTABLES_SAVE_ON_RESTART = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_IPTABLES_SAVE_ON_RESTART;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_IPTABLES_SAVE_ON_STOP() {
    		if (ic_IPTABLES_SAVE_ON_STOP == null)
    		{
				String label = bundle.getString("FirewallServiceOptionsContainer.IPTABLES_SAVE_ON_STOP");
				String binding = expressionPrefix + "_IPTABLES_SAVE_ON_STOP.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_IPTABLES_SAVE_ON_STOP = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_IPTABLES_SAVE_ON_STOP;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_IPTABLES_STATUS_LINENUMBERS() {
    		if (ic_IPTABLES_STATUS_LINENUMBERS == null)
    		{
				String label = bundle.getString("FirewallServiceOptionsContainer.IPTABLES_STATUS_LINENUMBERS");
				String binding = expressionPrefix + "_IPTABLES_STATUS_LINENUMBERS.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_IPTABLES_STATUS_LINENUMBERS = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_IPTABLES_STATUS_LINENUMBERS;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_IPTABLES_STATUS_NUMERIC() {
    		if (ic_IPTABLES_STATUS_NUMERIC == null)
    		{
				String label = bundle.getString("FirewallServiceOptionsContainer.IPTABLES_STATUS_NUMERIC");
				String binding = expressionPrefix + "_IPTABLES_STATUS_NUMERIC.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_IPTABLES_STATUS_NUMERIC = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_IPTABLES_STATUS_NUMERIC;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_IPTABLES_STATUS_VERBOSE() {
    		if (ic_IPTABLES_STATUS_VERBOSE == null)
    		{
				String label = bundle.getString("FirewallServiceOptionsContainer.IPTABLES_STATUS_VERBOSE");
				String binding = expressionPrefix + "_IPTABLES_STATUS_VERBOSE.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_IPTABLES_STATUS_VERBOSE = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_IPTABLES_STATUS_VERBOSE;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_IPTABLES_MODULES != null)
    		{
				ic_IPTABLES_MODULES.setLabelText(bundle.getString("FirewallServiceOptionsContainer.IPTABLES_MODULES"));
    		}
	    		if (ic_IPTABLES_MODULES_UNLOAD != null)
    		{
				ic_IPTABLES_MODULES_UNLOAD.setLabelText(bundle.getString("FirewallServiceOptionsContainer.IPTABLES_MODULES_UNLOAD"));
    		}
	    		if (ic_IPTABLES_SAVE_COUNTER != null)
    		{
				ic_IPTABLES_SAVE_COUNTER.setLabelText(bundle.getString("FirewallServiceOptionsContainer.IPTABLES_SAVE_COUNTER"));
    		}
	    		if (ic_IPTABLES_SAVE_ON_RESTART != null)
    		{
				ic_IPTABLES_SAVE_ON_RESTART.setLabelText(bundle.getString("FirewallServiceOptionsContainer.IPTABLES_SAVE_ON_RESTART"));
    		}
	    		if (ic_IPTABLES_SAVE_ON_STOP != null)
    		{
				ic_IPTABLES_SAVE_ON_STOP.setLabelText(bundle.getString("FirewallServiceOptionsContainer.IPTABLES_SAVE_ON_STOP"));
    		}
	    		if (ic_IPTABLES_STATUS_LINENUMBERS != null)
    		{
				ic_IPTABLES_STATUS_LINENUMBERS.setLabelText(bundle.getString("FirewallServiceOptionsContainer.IPTABLES_STATUS_LINENUMBERS"));
    		}
	    		if (ic_IPTABLES_STATUS_NUMERIC != null)
    		{
				ic_IPTABLES_STATUS_NUMERIC.setLabelText(bundle.getString("FirewallServiceOptionsContainer.IPTABLES_STATUS_NUMERIC"));
    		}
	    		if (ic_IPTABLES_STATUS_VERBOSE != null)
    		{
				ic_IPTABLES_STATUS_VERBOSE.setLabelText(bundle.getString("FirewallServiceOptionsContainer.IPTABLES_STATUS_VERBOSE"));
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
    				fields.add(get_IPTABLES_MODULES());
    				fields.add(get_IPTABLES_MODULES_UNLOAD());
    				fields.add(get_IPTABLES_SAVE_COUNTER());
    				fields.add(get_IPTABLES_SAVE_ON_RESTART());
    				fields.add(get_IPTABLES_SAVE_ON_STOP());
    				fields.add(get_IPTABLES_STATUS_LINENUMBERS());
    				fields.add(get_IPTABLES_STATUS_NUMERIC());
    				fields.add(get_IPTABLES_STATUS_VERBOSE());
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
	    		       FirewallServiceOptionsContainerImpl source = (FirewallServiceOptionsContainerImpl)sourceContainer;
		    		    
    	    		   get_IPTABLES_MODULES().copyFrom(source.get_IPTABLES_MODULES());
		        		   get_IPTABLES_MODULES_UNLOAD().copyFrom(source.get_IPTABLES_MODULES_UNLOAD());
		        		   get_IPTABLES_SAVE_COUNTER().copyFrom(source.get_IPTABLES_SAVE_COUNTER());
		        		   get_IPTABLES_SAVE_ON_RESTART().copyFrom(source.get_IPTABLES_SAVE_ON_RESTART());
		        		   get_IPTABLES_SAVE_ON_STOP().copyFrom(source.get_IPTABLES_SAVE_ON_STOP());
		        		   get_IPTABLES_STATUS_LINENUMBERS().copyFrom(source.get_IPTABLES_STATUS_LINENUMBERS());
		        		   get_IPTABLES_STATUS_NUMERIC().copyFrom(source.get_IPTABLES_STATUS_NUMERIC());
		        		   get_IPTABLES_STATUS_VERBOSE().copyFrom(source.get_IPTABLES_STATUS_VERBOSE());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}