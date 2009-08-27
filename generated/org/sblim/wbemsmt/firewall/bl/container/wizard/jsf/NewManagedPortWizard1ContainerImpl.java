/** 
  * NewManagedPortWizard1ContainerImpl.java
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

package org.sblim.wbemsmt.firewall.bl.container.wizard.jsf;

import org.sblim.wbemsmt.exception.*;
import java.util.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;




import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class NewManagedPortWizard1ContainerImpl extends org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel implements org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard1Container
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_StartPort;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_EndPort;

    		private org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf ic_usr_Protocol;

    	
		
			NewManagedPortWizard1ContainerImplLayouter layouter = null;
		
		public NewManagedPortWizard1ContainerImplLayouter getLayouter()
		{
			return layouter;
		}	
	
	public NewManagedPortWizard1ContainerImpl(org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "NewManagedPortWizard1Container.caption","NewManagedPortWizard1Container.subTitle",false);
				
				
		
				
    			
    				layouter = new NewManagedPortWizard1ContainerImplLayouter();
			//layout is done in the edit-method of the Editbean
			//layouter.layout(getPanelForCustomLayout(),this,bundle);
				
		setFooter(getPanelForCustomLayout(),"NewManagedPortWizard1Container.footerText");
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
				String label = bundle.getString("NewManagedPortWizard1Container.StartPort");
				String binding = expressionPrefix + "_usr_StartPort.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_StartPort = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
								ic_usr_StartPort.setRequired(true);
				;
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
				String label = bundle.getString("NewManagedPortWizard1Container.EndPort");
				String binding = expressionPrefix + "_usr_EndPort.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_EndPort = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
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
				String label = bundle.getString("NewManagedPortWizard1Container.Protocol");
				String binding = expressionPrefix + "_usr_Protocol.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.IntegerStringConverter();
				boolean readOnly = false;
    			ic_usr_Protocol = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFComboBoxComponent(parent,label,binding,converter, readOnly);
								ic_usr_Protocol.setRequired(true);
				;
    		}
			
						
    		return ic_usr_Protocol;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_StartPort != null)
    		{
				ic_usr_StartPort.setLabelText(bundle.getString("NewManagedPortWizard1Container.StartPort"));
    		}
	    		if (ic_usr_EndPort != null)
    		{
				ic_usr_EndPort.setLabelText(bundle.getString("NewManagedPortWizard1Container.EndPort"));
    		}
	    		if (ic_usr_Protocol != null)
    		{
				ic_usr_Protocol.setLabelText(bundle.getString("NewManagedPortWizard1Container.Protocol"));
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