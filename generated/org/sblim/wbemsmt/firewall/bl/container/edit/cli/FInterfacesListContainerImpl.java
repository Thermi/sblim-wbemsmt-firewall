/** 
  * FInterfacesListContainerImpl.java
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
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfaceContainer;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class FInterfacesListContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesListContainer
			, org.sblim.wbemsmt.firewall.bl.container.edit.FInterfaceContainerHeader		
	{
				
		
		private java.util.List<FInterfaceContainer> icInterfacesList = new java.util.ArrayList<FInterfaceContainer>();

				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icInterfacesListHeader_DeviceID;
				private org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf icInterfacesListHeader_IsTrusted;
		
	
		
	public FInterfacesListContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
		super();
		setAdapter(adapter);
    			adapter.initContainer(this);
	}

		
			
		
		/**
		* 
		* linked container FInterfaceContainer
		*/
				public java.util.List<FInterfaceContainer> getInterfacesList()
				{
			return icInterfacesList;
		}

   	       /**
		* Header for:
		* 
		* linked container FInterfaceContainer
		*/
		public org.sblim.wbemsmt.firewall.bl.container.edit.FInterfaceContainerHeader getInterfacesListHeader()
		{
			return this;
		}

				/**
   		 * Header for field DeviceID
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getInterfacesListHeader_DeviceID() {
    		if (icInterfacesListHeader_DeviceID == null)
    		{
    			String label = getAdapter().getBundle().getString("FInterfaceContainer.DeviceID");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			icInterfacesListHeader_DeviceID = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icInterfacesListHeader_DeviceID;
    	    }
				/**
   		 * Header for field isTrusted
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getInterfacesListHeader_IsTrusted() {
    		if (icInterfacesListHeader_IsTrusted == null)
    		{
    			String label = getAdapter().getBundle().getString("FInterfaceContainer.isTrusted");
			    org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			icInterfacesListHeader_IsTrusted = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
			}
    		return icInterfacesListHeader_IsTrusted;
    	    }
		

	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("FInterfacesListContainer.caption"));
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
    		        		List<FInterfaceContainer> listinterfacesList = getInterfacesList();
        		printStream.println();
        		printStream.println(getAdapter().getBundle().getString("FInterfacesListContainer.role.interfacesList") + " " + getAdapter().getBundle().getString("items.found", new Object[]{new Integer(listinterfacesList.size())}));
        		for (int i = 0; i < listinterfacesList.size(); i++) {
        			BaseDataContainer child = (BaseDataContainer)listinterfacesList.get(i);
        			printStream.println();
        			printStream.println(getAdapter().getBundle().getString("item") + ": " + (i+1) + " " + getAdapter().getBundle().getString("of") + " " + listinterfacesList.size());
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
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    		childs.addAll(getInterfacesList());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       FInterfacesListContainerImpl source = (FInterfacesListContainerImpl)sourceContainer;
		    		    
    			
    	    		   List<FInterfaceContainer> targetListForInterfacesList = getInterfacesList();
    		   List<FInterfaceContainer> sourceListForInterfacesList = source.getInterfacesList();
    		   if (sourceListForInterfacesList.size() != targetListForInterfacesList.size())
    		   {
    			      throw new WbemsmtException(WbemsmtException.ERR_FAILED,"The Lists are not from same size. Source is " + sourceListForInterfacesList.size() + " and target is " + targetListForInterfacesList.size() );
    		   }
			       for (int ii=0; ii < sourceListForInterfacesList.size(); ii++)
			       {
				          ((DataContainer) targetListForInterfacesList.get(ii)).copyFrom(((DataContainer) sourceListForInterfacesList.get(ii)));
			        }
			
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}