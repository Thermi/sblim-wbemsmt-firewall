/** 
  * NewManagedPortWizard2ContainerImpl.java
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

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.BaseDataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainer;
import org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class NewManagedPortWizard2ContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard2Container
			, org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainerHeader		
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_StartPort;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_EndPort;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Protocol;
    			
		
		private java.util.List<FInterfacesForServicesContainer> icInterfacesListForPort = new java.util.ArrayList<FInterfacesForServicesContainer>();

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icInterfacesListForPortHeader_DeviceID;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icInterfacesListForPortHeader_usr_IsEnabled;
		
	
		
	public NewManagedPortWizard2ContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
		super();
		setAdapter(adapter);
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
				String label = getAdapter().getBundle().getString("NewManagedPortWizard2Container.StartPort");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_StartPort = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("NewManagedPortWizard2Container.EndPort");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_EndPort = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
				String label = getAdapter().getBundle().getString("NewManagedPortWizard2Container.Protocol");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Protocol = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
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
    			String label = getAdapter().getBundle().getString("FInterfacesForServicesContainer.DeviceID");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			icInterfacesListForPortHeader_DeviceID = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icInterfacesListForPortHeader_DeviceID;
    	    }
				/**
   		 * Header for field isEnabled
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getInterfacesListForPortHeader_usr_IsEnabled() {
    		if (icInterfacesListForPortHeader_usr_IsEnabled == null)
    		{
    			String label = getAdapter().getBundle().getString("FInterfacesForServicesContainer.isEnabled");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			icInterfacesListForPortHeader_usr_IsEnabled = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icInterfacesListForPortHeader_usr_IsEnabled;
    	    }
		

	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("NewManagedPortWizard2Container.caption"));
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
    		        		List<FInterfacesForServicesContainer> listinterfacesListForPort = getInterfacesListForPort();
        		printStream.println();
        		printStream.println(getAdapter().getBundle().getString("NewManagedPortWizard2Container.role.interfacesListForPort") + " " + getAdapter().getBundle().getString("items.found", new Object[]{new Integer(listinterfacesListForPort.size())}));
        		for (int i = 0; i < listinterfacesListForPort.size(); i++) {
        			BaseDataContainer child = (BaseDataContainer)listinterfacesListForPort.get(i);
        			printStream.println();
        			printStream.println(getAdapter().getBundle().getString("item") + ": " + (i+1) + " " + getAdapter().getBundle().getString("of") + " " + listinterfacesListForPort.size());
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