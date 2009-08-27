/** 
  * FirewallManagedPortContainerImpl.java
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

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.BaseDataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortContainer;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class FirewallManagedPortContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.firewall.bl.container.edit.FirewallManagedPortContainer
			, org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortContainerHeader		
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_StartPort;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_EndPort;
    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_Protocol;
    			
		
		private java.util.List<FInterfacesForPortContainer> icInterfacesForPort = new java.util.ArrayList<FInterfacesForPortContainer>();

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icInterfacesForPortHeader_DeviceID;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icInterfacesForPortHeader_usr_IsEnabled;
		
	
		
	public FirewallManagedPortContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_StartPort() {
    		if (ic_StartPort == null)
    		{
				String label = getAdapter().getBundle().getString("FirewallManagedPortContainer.StartPort");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_StartPort = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("FirewallManagedPortContainer.EndPort");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_EndPort = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("FirewallManagedPortContainer.Protocol");
				org.sblim.wbemsmt.tools.converter.IntegerStringArrayConverter converter = new org.sblim.wbemsmt.tools.converter.IntegerStringArrayConverter();
    			ic_Protocol = new org.sblim.wbemsmt.tools.input.test.LabeledTestStringArrayComponent(this,label,null,converter);
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
    			String label = getAdapter().getBundle().getString("FInterfacesForPortContainer.DeviceID");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			icInterfacesForPortHeader_DeviceID = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icInterfacesForPortHeader_DeviceID;
    	    }
				/**
   		 * Header for field isEnabled
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getInterfacesForPortHeader_usr_IsEnabled() {
    		if (icInterfacesForPortHeader_usr_IsEnabled == null)
    		{
    			String label = getAdapter().getBundle().getString("FInterfacesForPortContainer.isEnabled");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			icInterfacesForPortHeader_usr_IsEnabled = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icInterfacesForPortHeader_usr_IsEnabled;
    	    }
		

	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("FirewallManagedPortContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_StartPort().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_StartPort()).getValue();
        				printStream.println(get_StartPort().getLabelText() + ": " + value);
   			}
   			   			   			if (get_EndPort().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_EndPort()).getValue();
        				printStream.println(get_EndPort().getLabelText() + ": " + value);
   			}
   			   			   			if (get_Protocol().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_Protocol()).getValue();
        				printStream.println(get_Protocol().getLabelText() + ": " + value);
   			}
   					}

		if (showChilds(listOptions))
		{
			traceChilds(printStream,listOptions,title);
		}
	}
	
	public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title)
	{
    		        		List<FInterfacesForPortContainer> listinterfacesForPort = getInterfacesForPort();
        		printStream.println();
        		printStream.println(getAdapter().getBundle().getString("FirewallManagedPortContainer.role.interfacesForPort") + " " + getAdapter().getBundle().getString("items.found", new Object[]{new Integer(listinterfacesForPort.size())}));
        		for (int i = 0; i < listinterfacesForPort.size(); i++) {
        			BaseDataContainer child = (BaseDataContainer)listinterfacesForPort.get(i);
        			printStream.println();
        			printStream.println(getAdapter().getBundle().getString("item") + ": " + (i+1) + " " + getAdapter().getBundle().getString("of") + " " + listinterfacesForPort.size());
        			child.trace(printStream,listOptions,false);
        		}
    			
			
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