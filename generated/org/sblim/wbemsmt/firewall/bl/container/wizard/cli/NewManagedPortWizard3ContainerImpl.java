/** 
  * NewManagedPortWizard3ContainerImpl.java
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
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortSummaryContainer;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class NewManagedPortWizard3ContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard3Container
			, org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortSummaryContainerHeader		
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_StartPort;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_EndPort;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Protocol;
    			
		
		private java.util.List<FInterfacesForPortSummaryContainer> icInterfacesListForPortSummary = new java.util.ArrayList<FInterfacesForPortSummaryContainer>();

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icInterfacesListForPortSummaryHeader_DeviceID;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icInterfacesListForPortSummaryHeader_usr_IsEnabled;
		
	
		
	public NewManagedPortWizard3ContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
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
				String label = getAdapter().getBundle().getString("NewManagedPortWizard3Container.StartPort");
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
				String label = getAdapter().getBundle().getString("NewManagedPortWizard3Container.EndPort");
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
				String label = getAdapter().getBundle().getString("NewManagedPortWizard3Container.Protocol");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Protocol = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_Protocol;
    	}
		
			
		
		/**
		* 
		* linked container FInterfacesForPortSummaryContainer
		*/
				public java.util.List<FInterfacesForPortSummaryContainer> getInterfacesListForPortSummary()
				{
			return icInterfacesListForPortSummary;
		}

   	       /**
		* Header for:
		* 
		* linked container FInterfacesForPortSummaryContainer
		*/
		public org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortSummaryContainerHeader getInterfacesListForPortSummaryHeader()
		{
			return this;
		}

				/**
   		 * Header for field DeviceID
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getInterfacesListForPortSummaryHeader_DeviceID() {
    		if (icInterfacesListForPortSummaryHeader_DeviceID == null)
    		{
    			String label = getAdapter().getBundle().getString("FInterfacesForPortSummaryContainer.DeviceID");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			icInterfacesListForPortSummaryHeader_DeviceID = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icInterfacesListForPortSummaryHeader_DeviceID;
    	    }
				/**
   		 * Header for field isEnabled
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getInterfacesListForPortSummaryHeader_usr_IsEnabled() {
    		if (icInterfacesListForPortSummaryHeader_usr_IsEnabled == null)
    		{
    			String label = getAdapter().getBundle().getString("FInterfacesForPortSummaryContainer.isEnabled");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			icInterfacesListForPortSummaryHeader_usr_IsEnabled = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icInterfacesListForPortSummaryHeader_usr_IsEnabled;
    	    }
		

	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("NewManagedPortWizard3Container.caption"));
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
    		        		List<FInterfacesForPortSummaryContainer> listinterfacesListForPortSummary = getInterfacesListForPortSummary();
        		printStream.println();
        		printStream.println(getAdapter().getBundle().getString("NewManagedPortWizard3Container.role.interfacesListForPortSummary") + " " + getAdapter().getBundle().getString("items.found", new Object[]{new Integer(listinterfacesListForPortSummary.size())}));
        		for (int i = 0; i < listinterfacesListForPortSummary.size(); i++) {
        			BaseDataContainer child = (BaseDataContainer)listinterfacesListForPortSummary.get(i);
        			printStream.println();
        			printStream.println(getAdapter().getBundle().getString("item") + ": " + (i+1) + " " + getAdapter().getBundle().getString("of") + " " + listinterfacesListForPortSummary.size());
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
    	    		childs.addAll(getInterfacesListForPortSummary());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       NewManagedPortWizard3ContainerImpl source = (NewManagedPortWizard3ContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_StartPort().copyFrom(source.get_usr_StartPort());
		        		   get_usr_EndPort().copyFrom(source.get_usr_EndPort());
		        		   get_usr_Protocol().copyFrom(source.get_usr_Protocol());
		    		
    	    		   List<FInterfacesForPortSummaryContainer> targetListForInterfacesListForPortSummary = getInterfacesListForPortSummary();
    		   List<FInterfacesForPortSummaryContainer> sourceListForInterfacesListForPortSummary = source.getInterfacesListForPortSummary();
    		   if (sourceListForInterfacesListForPortSummary.size() != targetListForInterfacesListForPortSummary.size())
    		   {
    			      throw new WbemsmtException(WbemsmtException.ERR_FAILED,"The Lists are not from same size. Source is " + sourceListForInterfacesListForPortSummary.size() + " and target is " + targetListForInterfacesListForPortSummary.size() );
    		   }
			       for (int ii=0; ii < sourceListForInterfacesListForPortSummary.size(); ii++)
			       {
				          ((DataContainer) targetListForInterfacesListForPortSummary.get(ii)).copyFrom(((DataContainer) sourceListForInterfacesListForPortSummary.get(ii)));
			        }
			
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}