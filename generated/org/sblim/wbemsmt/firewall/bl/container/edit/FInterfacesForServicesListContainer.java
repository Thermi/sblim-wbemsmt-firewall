/** 
  * FInterfacesForServicesListContainer.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.firewall.bl.container.edit;

public interface FInterfacesForServicesListContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer
{
	/** 
	 * Constants for Fields and Roles
	 **/
				public static final String ROLE_INTERFACESFORSERVICELIST = "interfacesForServiceList";
			public static final String ROLE_SERVICESLIST = "servicesList";
	
	
	/** 
	 * Defined Fields
	 **/
	
	
	/** 
	 * Linked DataContainers
	 **/
			
				
		/**
		* 
		* linked container FInterfacesForServicesContainer
		*/

				
		public java.util.List<FInterfacesForServicesContainer> getInterfacesForServiceList();
		
		
	   		
	   /**
		* Header for:
		* 
		* linked container FInterfacesForServicesContainer
		*/
		public  org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainerHeader getInterfacesForServiceListHeader();
		
					
				
		/**
		* 
		* linked container FSupportedServicesContainer
		*/

				
		public org.sblim.wbemsmt.firewall.bl.container.edit.FSupportedServicesContainer getServicesList();
		
		
	   	
}