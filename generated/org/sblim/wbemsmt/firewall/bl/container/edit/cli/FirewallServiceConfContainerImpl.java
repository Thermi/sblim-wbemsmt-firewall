/** 
  * FirewallServiceConfContainerImpl.java
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

public class FirewallServiceConfContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.firewall.bl.container.edit.FirewallServiceConfContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_ConfigurationFile;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_invoke_StartService;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_invoke_StopService;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_RestartService;
    	
		
	public FirewallServiceConfContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_ConfigurationFile() {
    		if (ic_ConfigurationFile == null)
    		{
				String label = getAdapter().getBundle().getString("FirewallServiceConfContainer.configurationFile");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_ConfigurationFile = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_ConfigurationFile;
    	}
			/**
		* 
		* DataType ACTION
		* UIType BUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_invoke_StartService() {
    		if (ic_invoke_StartService == null)
    		{
				String label = getAdapter().getBundle().getString("FirewallServiceConfContainer.StartService");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_invoke_StartService = new org.sblim.wbemsmt.tools.input.test.LabeledTestActionComponent(this,label,null,converter);
    		}
    		return ic_invoke_StartService;
    	}
			/**
		* 
		* DataType ACTION
		* UIType BUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_invoke_StopService() {
    		if (ic_invoke_StopService == null)
    		{
				String label = getAdapter().getBundle().getString("FirewallServiceConfContainer.StopService");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_invoke_StopService = new org.sblim.wbemsmt.tools.input.test.LabeledTestActionComponent(this,label,null,converter);
    		}
    		return ic_invoke_StopService;
    	}
			/**
		* 
		* DataType ACTION
		* UIType BUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_RestartService() {
    		if (ic_usr_RestartService == null)
    		{
				String label = getAdapter().getBundle().getString("FirewallServiceConfContainer.restartService");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_RestartService = new org.sblim.wbemsmt.tools.input.test.LabeledTestActionComponent(this,label,null,converter);
    		}
    		return ic_usr_RestartService;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("FirewallServiceConfContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_ConfigurationFile().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_ConfigurationFile()).getValue();
        				printStream.println(get_ConfigurationFile().getLabelText() + ": " + value);
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
    				fields.add(get_ConfigurationFile());
    				fields.add(get_invoke_StartService());
    				fields.add(get_invoke_StopService());
    				fields.add(get_usr_RestartService());
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
	    		       FirewallServiceConfContainerImpl source = (FirewallServiceConfContainerImpl)sourceContainer;
		    		    
    	    		   get_ConfigurationFile().copyFrom(source.get_ConfigurationFile());
		        		   get_invoke_StartService().copyFrom(source.get_invoke_StartService());
		        		   get_invoke_StopService().copyFrom(source.get_invoke_StopService());
		        		   get_usr_RestartService().copyFrom(source.get_usr_RestartService());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}