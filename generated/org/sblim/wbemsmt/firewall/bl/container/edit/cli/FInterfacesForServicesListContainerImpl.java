/** 
  * FInterfacesForServicesListContainerImpl.java
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
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainer;
import org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class FInterfacesForServicesListContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesListContainer
			, org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainerHeader		
	{
				
		
		private java.util.List<FInterfacesForServicesContainer> icInterfacesForServiceList = new java.util.ArrayList<FInterfacesForServicesContainer>();

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icInterfacesForServiceListHeader_DeviceID;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icInterfacesForServiceListHeader_usr_IsEnabled;
		
	
			private org.sblim.wbemsmt.firewall.bl.container.edit.FSupportedServicesContainer icServicesList = null;
		
	public FInterfacesForServicesListContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
		super();
		setAdapter(adapter);
    	    	icServicesList = new org.sblim.wbemsmt.firewall.bl.container.edit.cli.FSupportedServicesContainerImpl(adapter);
    			adapter.initContainer(this);
	}

		
			
		
		/**
		* 
		* linked container FInterfacesForServicesContainer
		*/
				public java.util.List<FInterfacesForServicesContainer> getInterfacesForServiceList()
				{
			return icInterfacesForServiceList;
		}

   	       /**
		* Header for:
		* 
		* linked container FInterfacesForServicesContainer
		*/
		public org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainerHeader getInterfacesForServiceListHeader()
		{
			return this;
		}

				/**
   		 * Header for field DeviceID
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getInterfacesForServiceListHeader_DeviceID() {
    		if (icInterfacesForServiceListHeader_DeviceID == null)
    		{
    			String label = getAdapter().getBundle().getString("FInterfacesForServicesContainer.DeviceID");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			icInterfacesForServiceListHeader_DeviceID = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icInterfacesForServiceListHeader_DeviceID;
    	    }
				/**
   		 * Header for field isEnabled
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getInterfacesForServiceListHeader_usr_IsEnabled() {
    		if (icInterfacesForServiceListHeader_usr_IsEnabled == null)
    		{
    			String label = getAdapter().getBundle().getString("FInterfacesForServicesContainer.isEnabled");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			icInterfacesForServiceListHeader_usr_IsEnabled = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icInterfacesForServiceListHeader_usr_IsEnabled;
    	    }
		

	
			
		/**
		* 
		* linked container FSupportedServicesContainer
		*/
		
		public org.sblim.wbemsmt.firewall.bl.container.edit.FSupportedServicesContainer getServicesList()
		{
			return icServicesList;
		}

		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("FInterfacesForServicesListContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
					}

		if (showChilds(listOptions))
		{
			traceChilds(printStream,listOptions,title);
		}
	}
	
	public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title)
	{
    		        		List<FInterfacesForServicesContainer> listinterfacesForServiceList = getInterfacesForServiceList();
        		printStream.println();
        		printStream.println(getAdapter().getBundle().getString("FInterfacesForServicesListContainer.role.interfacesForServiceList") + " " + getAdapter().getBundle().getString("items.found", new Object[]{new Integer(listinterfacesForServiceList.size())}));
        		for (int i = 0; i < listinterfacesForServiceList.size(); i++) {
        			BaseDataContainer child = (BaseDataContainer)listinterfacesForServiceList.get(i);
        			printStream.println();
        			printStream.println(getAdapter().getBundle().getString("item") + ": " + (i+1) + " " + getAdapter().getBundle().getString("of") + " " + listinterfacesForServiceList.size());
        			child.trace(printStream,listOptions,false);
        		}
    			
			        
        		org.sblim.wbemsmt.firewall.bl.container.edit.cli.FSupportedServicesContainerImpl childservicesList = (org.sblim.wbemsmt.firewall.bl.container.edit.cli.FSupportedServicesContainerImpl)getServicesList();
        		printStream.println();
        		printStream.println("servicesList");
            	childservicesList.trace(printStream,listOptions,false);
			
	}
	
	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    		childs.addAll(getInterfacesForServiceList());
    	    	    		childs.add(getServicesList());
				return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       FInterfacesForServicesListContainerImpl source = (FInterfacesForServicesListContainerImpl)sourceContainer;
		    		    
    			
    	    		   List<FInterfacesForServicesContainer> targetListForInterfacesForServiceList = getInterfacesForServiceList();
    		   List<FInterfacesForServicesContainer> sourceListForInterfacesForServiceList = source.getInterfacesForServiceList();
    		   if (sourceListForInterfacesForServiceList.size() != targetListForInterfacesForServiceList.size())
    		   {
    			      throw new WbemsmtException(WbemsmtException.ERR_FAILED,"The Lists are not from same size. Source is " + sourceListForInterfacesForServiceList.size() + " and target is " + targetListForInterfacesForServiceList.size() );
    		   }
			       for (int ii=0; ii < sourceListForInterfacesForServiceList.size(); ii++)
			       {
				          ((DataContainer) targetListForInterfacesForServiceList.get(ii)).copyFrom(((DataContainer) sourceListForInterfacesForServiceList.get(ii)));
			        }
			
    	    	    		   getServicesList().copyFrom(source.getServicesList());
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