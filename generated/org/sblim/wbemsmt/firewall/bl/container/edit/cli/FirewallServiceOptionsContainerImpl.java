/** 
  * FirewallServiceOptionsContainerImpl.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/cmd/containerImpl.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.firewall.bl.container.edit.cli;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class FirewallServiceOptionsContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.firewall.bl.container.edit.FirewallServiceOptionsContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_IPTABLES_MODULES;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_IPTABLES_MODULES_UNLOAD;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_IPTABLES_SAVE_COUNTER;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_IPTABLES_SAVE_ON_RESTART;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_IPTABLES_SAVE_ON_STOP;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_IPTABLES_STATUS_LINENUMBERS;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_IPTABLES_STATUS_NUMERIC;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_IPTABLES_STATUS_VERBOSE;
    	
		
	public FirewallServiceOptionsContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
		super();
		setAdapter(adapter);
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
				String label = getAdapter().getBundle().getString("FirewallServiceOptionsContainer.IPTABLES_MODULES");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_IPTABLES_MODULES = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("FirewallServiceOptionsContainer.IPTABLES_MODULES_UNLOAD");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_IPTABLES_MODULES_UNLOAD = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("FirewallServiceOptionsContainer.IPTABLES_SAVE_COUNTER");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_IPTABLES_SAVE_COUNTER = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("FirewallServiceOptionsContainer.IPTABLES_SAVE_ON_RESTART");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_IPTABLES_SAVE_ON_RESTART = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("FirewallServiceOptionsContainer.IPTABLES_SAVE_ON_STOP");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_IPTABLES_SAVE_ON_STOP = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("FirewallServiceOptionsContainer.IPTABLES_STATUS_LINENUMBERS");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_IPTABLES_STATUS_LINENUMBERS = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("FirewallServiceOptionsContainer.IPTABLES_STATUS_NUMERIC");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_IPTABLES_STATUS_NUMERIC = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("FirewallServiceOptionsContainer.IPTABLES_STATUS_VERBOSE");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_IPTABLES_STATUS_VERBOSE = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_IPTABLES_STATUS_VERBOSE;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("FirewallServiceOptionsContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_IPTABLES_MODULES().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_IPTABLES_MODULES()).getValue();
        				printStream.println(get_IPTABLES_MODULES().getLabelText() + ": " + value);
   			}
   			   			   			if (get_IPTABLES_MODULES_UNLOAD().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_IPTABLES_MODULES_UNLOAD()).getValue();
        				printStream.println(get_IPTABLES_MODULES_UNLOAD().getLabelText() + ": " + value);
   			}
   			   			   			if (get_IPTABLES_SAVE_COUNTER().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_IPTABLES_SAVE_COUNTER()).getValue();
        				printStream.println(get_IPTABLES_SAVE_COUNTER().getLabelText() + ": " + value);
   			}
   			   			   			if (get_IPTABLES_SAVE_ON_RESTART().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_IPTABLES_SAVE_ON_RESTART()).getValue();
        				printStream.println(get_IPTABLES_SAVE_ON_RESTART().getLabelText() + ": " + value);
   			}
   			   			   			if (get_IPTABLES_SAVE_ON_STOP().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_IPTABLES_SAVE_ON_STOP()).getValue();
        				printStream.println(get_IPTABLES_SAVE_ON_STOP().getLabelText() + ": " + value);
   			}
   			   			   			if (get_IPTABLES_STATUS_LINENUMBERS().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_IPTABLES_STATUS_LINENUMBERS()).getValue();
        				printStream.println(get_IPTABLES_STATUS_LINENUMBERS().getLabelText() + ": " + value);
   			}
   			   			   			if (get_IPTABLES_STATUS_NUMERIC().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_IPTABLES_STATUS_NUMERIC()).getValue();
        				printStream.println(get_IPTABLES_STATUS_NUMERIC().getLabelText() + ": " + value);
   			}
   			   			   			if (get_IPTABLES_STATUS_VERBOSE().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_IPTABLES_STATUS_VERBOSE()).getValue();
        				printStream.println(get_IPTABLES_STATUS_VERBOSE().getLabelText() + ": " + value);
   			}
   					}

		if (showChilds(listOptions))
		{
			traceChilds(printStream,listOptions,title);
		}
	}
	
	public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title)
	{
    			
			
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