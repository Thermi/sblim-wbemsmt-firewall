/** 
  * NewManagedPortWizard1ContainerImpl.java
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

package org.sblim.wbemsmt.firewall.bl.container.wizard.cli;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class NewManagedPortWizard1ContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard1Container
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_StartPort;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_EndPort;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_Protocol;
    	
		
	public NewManagedPortWizard1ContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_StartPort() {
    		if (ic_usr_StartPort == null)
    		{
				String label = getAdapter().getBundle().getString("NewManagedPortWizard1Container.StartPort");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_StartPort = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_StartPort;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_EndPort() {
    		if (ic_usr_EndPort == null)
    		{
				String label = getAdapter().getBundle().getString("NewManagedPortWizard1Container.EndPort");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_EndPort = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_EndPort;
    	}
			/**
		* 
		* DataType INTEGER
		* UIType COMBOBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_Protocol() {
    		if (ic_usr_Protocol == null)
    		{
				String label = getAdapter().getBundle().getString("NewManagedPortWizard1Container.Protocol");
				org.sblim.wbemsmt.tools.converter.IntegerStringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.IntegerStringArrayConverter();
    			ic_usr_Protocol = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(this,label,null,converter);
    		}
    		return ic_usr_Protocol;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("NewManagedPortWizard1Container.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_usr_StartPort().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_StartPort()).getValue();
        				printStream.println(get_usr_StartPort().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_EndPort().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_EndPort()).getValue();
        				printStream.println(get_usr_EndPort().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Protocol().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Protocol()).getValue();
        				printStream.println(get_usr_Protocol().getLabelText() + ": " + value);
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
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       NewManagedPortWizard1ContainerImpl source = (NewManagedPortWizard1ContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_StartPort().copyFrom(source.get_usr_StartPort());
		        		   get_usr_EndPort().copyFrom(source.get_usr_EndPort());
		        		   get_usr_Protocol().copyFrom(source.get_usr_Protocol());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}