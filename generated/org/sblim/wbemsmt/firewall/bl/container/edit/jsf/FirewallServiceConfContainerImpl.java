/** 
  * FirewallServiceConfContainerImpl.java
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

public class FirewallServiceConfContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.firewall.bl.container.edit.FirewallServiceConfContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_ConfigurationFile;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_invoke_StartService;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_invoke_StopService;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_RestartService;

    	
		
	
	public FirewallServiceConfContainerImpl(org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "FirewallServiceConfContainer.caption",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_ConfigurationFile());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_invoke_StartService());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_invoke_StopService());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_RestartService());
        					
		setFooter(getPanelForCustomLayout(),"FirewallServiceConfContainer.footerText");
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
				String label = bundle.getString("FirewallServiceConfContainer.configurationFile");
				String binding = expressionPrefix + "_ConfigurationFile.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_ConfigurationFile = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
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
				String label = bundle.getString("FirewallServiceConfContainer.StartService");
				String binding = expressionPrefix + "_invoke_StartService.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_invoke_StartService = new org.sblim.wbemsmt.tools.input.jsf.JSFButtonComponent(parent,label,binding,converter, readOnly);
				;
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
				String label = bundle.getString("FirewallServiceConfContainer.StopService");
				String binding = expressionPrefix + "_invoke_StopService.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_invoke_StopService = new org.sblim.wbemsmt.tools.input.jsf.JSFButtonComponent(parent,label,binding,converter, readOnly);
				;
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
				String label = bundle.getString("FirewallServiceConfContainer.restartService");
				String binding = expressionPrefix + "_usr_RestartService.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_RestartService = new org.sblim.wbemsmt.tools.input.jsf.JSFButtonComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_RestartService;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_ConfigurationFile != null)
    		{
				ic_ConfigurationFile.setLabelText(bundle.getString("FirewallServiceConfContainer.configurationFile"));
    		}
	    		if (ic_invoke_StartService != null)
    		{
				ic_invoke_StartService.setLabelText(bundle.getString("FirewallServiceConfContainer.StartService"));
    		}
	    		if (ic_invoke_StopService != null)
    		{
				ic_invoke_StopService.setLabelText(bundle.getString("FirewallServiceConfContainer.StopService"));
    		}
	    		if (ic_usr_RestartService != null)
    		{
				ic_usr_RestartService.setLabelText(bundle.getString("FirewallServiceConfContainer.restartService"));
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