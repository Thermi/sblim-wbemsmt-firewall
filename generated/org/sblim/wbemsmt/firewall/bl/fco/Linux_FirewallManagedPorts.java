/** 
  * Linux_FirewallManagedPorts.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm
  *
  * Contributors:
  *    Prashanth Karnam<prkarnam@in.ibm.com> 
  * 
  * Description: This class defines the ports that are chosen to be Managed by the client of WBEM-SMTFIREWALL task
  * 
  * generated Class
  */

package org.sblim.wbemsmt.firewall.bl.fco;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
   import org.sblim.wbemsmt.exception.impl.*;
	   import org.sblim.wbemsmt.exception.impl.userobject.*;


import org.sblim.wbemsmt.schema.cim221.*;



import java.lang.reflect.*;
import javax.wbem.*;
public class Linux_FirewallManagedPorts extends  CIM_SettingData {



   public final static String CIM_CLASS_NAME = "Linux_FirewallManagedPorts";
   public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    
    /**
     * Any Interface can have more than one Unreserved Port enabled on it.  This association is represented by this mof.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLMANAGEDPORTSFORINTERFACE = "Linux_FirewallManagedPortsForInterface";
    
    
    
	    /**
	     * Constants of property EndPort
     * The End Port number-in case a range of ports are defined, else NULL
     */
    public static class PROPERTY_ENDPORT
    {
       /**
        * name of the property EndPort
        */
       public final static String NAME = "EndPort";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property Protocol
     * Name of the Protocol the said port supports
     */
    public static class PROPERTY_PROTOCOL
    {
       /**
        * name of the property Protocol
        */
       public final static String NAME = "Protocol";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property StartPort
     * The starting Port-in case a range of ports are defined, in case of individual port-the port number
     */
    public static class PROPERTY_STARTPORT
    {
       /**
        * name of the property StartPort
        */
       public final static String NAME = "StartPort";                  

	    	
    

    		    
	
	    
	    }
	    	    

   

    
    static {    
           addPackage("org.sblim.wbemsmt.firewall.bl.fco");
                         String[] parentClassPackageList = CIM_SettingData.getPackages();
        
              for (int i = 0; i < parentClassPackageList.length; i++) {
                      addPackage(parentClassPackageList[i]);
              }
           
    };

//**********************************************************************
// Constructors     
//**********************************************************************


   /**
    *   Class constructor
    * 
    *       *   <br>
    *   This class defines the ports that are chosen to be Managed by the client of WBEM-SMTFIREWALL task
    *   @param client the CIM Client
    *   @param namespace the target namespace
    */  

      
   public Linux_FirewallManagedPorts(WBEMClient client, String namespace) throws WbemsmtException
   {
       CIMClass cls = getClass(client,namespace);
       setFromServer(false);
       init(cls.newInstance(),true);
   }
        
   /**
    *   Class constructor
    * 
    *       *   <br>
    *   This class defines the ports that are chosen to be Managed by the client of WBEM-SMTFIREWALL task
    *   @param cimInstance the instance that is used to create the Object
    */  
   
   public Linux_FirewallManagedPorts(CIMInstance cimInstance)  throws WbemsmtException { 
        
       if (cimInstance == null) {
           throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, "The cimInstance parameter does not contain a valid reference.");
       }
       setFromServer(true);
       init(cimInstance,false);
   }
   
   /**
    * Default constructor
    */
   protected Linux_FirewallManagedPorts()
   {	
   }
   
   /**
    * initializes the FCO
    *
    *   @param cimInstance the instance that is used to create the Object
    *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
    */
   protected void init(CIMInstance cimInstance,boolean overwrite) throws WbemsmtException
   {
              propertiesToCheck.put("EndPort",new CIMProperty("EndPort",CIMDataType.STRING_T,null));
              propertiesToCheck.put("Protocol",new CIMProperty("Protocol",CIMDataType.STRING_T,null));
              propertiesToCheck.put("StartPort",new CIMProperty("StartPort",CIMDataType.STRING_T,null));
       	
	       super.init(cimInstance,overwrite);
	       
	       
	       //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
	       //we overwrite the dataType by setting null for every embeddedObject/Instance property
	       if (overwrite)
	       {
			                                                                      
       }
   }

//**********************************************************************
// Properties get/set     
//**********************************************************************


   
   
   /**
    * Get the property EndPort
    *     * <br>
    * The End Port number-in case a range of ports are defined, else NULL
    *     */

      

               
   public String get_EndPort()    {
       CIMProperty currentProperty = getProperty(PROPERTY_ENDPORT.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_ENDPORT.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property EndPort
    * <br>
    * The End Port number-in case a range of ports are defined, else NULL
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_EndPort(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_ENDPORT.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_EndPort(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_ENDPORT.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property EndPort by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_EndPort(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        Linux_FirewallManagedPorts fco = new Linux_FirewallManagedPorts(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ENDPORT.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_EndPort(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_ENDPORT.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property EndPort
    * <br>
    * The End Port number-in case a range of ports are defined, else NULL
    */
    
   private static CIMProperty setPropertyValue_EndPort(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Protocol
    *     * <br>
    * Name of the Protocol the said port supports
    *     */

      

               
   public String get_Protocol()    {
       CIMProperty currentProperty = getProperty(PROPERTY_PROTOCOL.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_PROTOCOL.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Protocol
    * <br>
    * Name of the Protocol the said port supports
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_Protocol(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_PROTOCOL.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_Protocol(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_PROTOCOL.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property Protocol by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Protocol(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        Linux_FirewallManagedPorts fco = new Linux_FirewallManagedPorts(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PROTOCOL.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_Protocol(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_PROTOCOL.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Protocol
    * <br>
    * Name of the Protocol the said port supports
    */
    
   private static CIMProperty setPropertyValue_Protocol(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property StartPort
    *     * <br>
    * The starting Port-in case a range of ports are defined, in case of individual port-the port number
    *     */

      

               
   public String get_StartPort()    {
       CIMProperty currentProperty = getProperty(PROPERTY_STARTPORT.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_STARTPORT.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property StartPort
    * <br>
    * The starting Port-in case a range of ports are defined, in case of individual port-the port number
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_StartPort(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_STARTPORT.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_StartPort(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_STARTPORT.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property StartPort by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_StartPort(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        Linux_FirewallManagedPorts fco = new Linux_FirewallManagedPorts(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_STARTPORT.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_StartPort(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_STARTPORT.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property StartPort
    * <br>
    * The starting Port-in case a range of ports are defined, in case of individual port-the port number
    */
    
   private static CIMProperty setPropertyValue_StartPort(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
    
//**********************************************************************
// Associators methods     
//**********************************************************************



    
                    
                                        
        
    /**
     * Get the list with Linux_FirewallInterface objects associated by the association Linux_FirewallManagedPortsForInterface
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLMANAGEDPORTSFORINTERFACE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<Linux_FirewallInterface> getAssociated_Linux_FirewallInterface_Linux_FirewallManagedPortsForInterfaces(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_Linux_FirewallInterface_Linux_FirewallManagedPortsForInterfaces(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLMANAGEDPORTSFORINTERFACE,
     	                Linux_FirewallInterface.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with Linux_FirewallInterface objects associated by the association Linux_FirewallManagedPortsForInterface
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLMANAGEDPORTSFORINTERFACE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLMANAGEDPORTSFORINTERFACE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<Linux_FirewallInterface> getAssociated_Linux_FirewallInterface_Linux_FirewallManagedPortsForInterfaces(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_Linux_FirewallInterface_Linux_FirewallManagedPortsForInterfaces(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLMANAGEDPORTSFORINTERFACE,
     	                resultClass,
     	                role,
     	                resultRole,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with Linux_FirewallInterface objects associated by the association Linux_FirewallManagedPortsForInterface
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLMANAGEDPORTSFORINTERFACE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<Linux_FirewallInterface> getAssociated_Linux_FirewallInterface_Linux_FirewallManagedPortsForInterfaces(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

         if (cimClient == null) {
             throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
         }

         java.util.List<Linux_FirewallInterface> result = new java.util.ArrayList<Linux_FirewallInterface>();
         CloseableIterator enumeration = null;

         try {
             enumeration = cimClient.associators(
                 this.getCimObjectPath(),
                 associationClass, 
                 resultClass,
                 role,resultRole, 
                 includeQualifiers,
                 includeClassOrigin,
                 propertyList);
         } catch (WBEMException e) {
         	  throw new AssociatorException(e, new AssociatorUserObject(
                 this.getCimObjectPath(),
                 associationClass, 
                 resultClass,
                 role,resultRole, 
                 includeQualifiers,
                 includeClassOrigin,
                 propertyList));	
         }
         
         try {
	             while (enumeration.hasNext()) {
                 Linux_FirewallManagedPortsHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 Linux_FirewallManagedPortsHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = Linux_FirewallManagedPortsHelper.findClass(cimClient, cimInstance);
                    
                     if (clazz == null) {
                         System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                         result.add(new Linux_FirewallInterface(cimInstance));
                         continue;
                     }

                     Class<?>[] constParams = new Class[1];
                     constParams[0] = CIMInstance.class;
                     Constructor<?> cons = null;
                     try {
                         cons = clazz.getConstructor(constParams);
                     } catch(NoSuchMethodException e) {
                         System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                         result.add(new Linux_FirewallInterface(cimInstance));
                         continue;
                     }

                     try {
                         Object[] actargs = new Object[] {cimInstance};
                         Object dataObj = cons.newInstance(actargs);
                         result.add((Linux_FirewallInterface)dataObj);
                     } catch (Exception e) {
                         System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                         result.add(new Linux_FirewallInterface(cimInstance));
                         continue;
                     }
                 }
             }
             Linux_FirewallManagedPortsHelper.checkException(enumeration);
         } finally {
         try {
             if (enumeration != null) {
                 enumeration.close();
             }
         } catch(Exception e) {
             throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
         }
     }

     return result;
   }
    
   /**
    * Get the list of CIMObjectPath items of the objects associated by the association Linux_FirewallManagedPortsForInterface
    * @param cimClient the WBEMClient for the communication
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLMANAGEDPORTSFORINTERFACE as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_Linux_FirewallInterface_Linux_FirewallManagedPortsForInterfaceNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_Linux_FirewallInterface_Linux_FirewallManagedPortsForInterfaceNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLMANAGEDPORTSFORINTERFACE,
    	                             Linux_FirewallInterface.CIM_CLASS_NAME,
    	                             null,
    	                             null);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association Linux_FirewallManagedPortsForInterface
    * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLMANAGEDPORTSFORINTERFACE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLMANAGEDPORTSFORINTERFACE as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_Linux_FirewallInterface_Linux_FirewallManagedPortsForInterfaceNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_Linux_FirewallInterface_Linux_FirewallManagedPortsForInterfaceNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLMANAGEDPORTSFORINTERFACE,
    	                             resultClass,
    	                             role,
    	                             resultRole);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association Linux_FirewallManagedPortsForInterface
    * @param cimClient the WBEMClient for the communication
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_Linux_FirewallInterface_Linux_FirewallManagedPortsForInterfaceNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associatorNames(
                this.getCimObjectPath(),
                associationClass, 
                resultClass,
                role,resultRole);
		        
         } catch (WBEMException e) {
         	  throw new AssociatorNamesException(e, new AssociatorNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLMANAGEDPORTSFORINTERFACE, 
                Linux_FirewallInterface.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                Linux_FirewallManagedPortsHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                Linux_FirewallManagedPortsHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_FirewallInterface.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            Linux_FirewallManagedPortsHelper.checkException(enumeration);
        } finally {
        try {
            if (enumeration != null) {
                    enumeration.close();
            }
        } catch(Exception e) {
               throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
        }
      }
      return result;
   }
    
   /**
    * Get the list with Linux_FirewallManagedPortsForInterface associations
    *
    * @param cimClient the WBEMClient for the communication
    * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
    * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
    *
    * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
    **/
                        
                        
   public java.util.List<Linux_FirewallManagedPortsForInterface> getAssociations_Linux_FirewallManagedPortsForInterface(WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin, String role,java.lang.String[] propertyList) throws WbemsmtException {

       if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
       }

       java.util.List<Linux_FirewallManagedPortsForInterface> result = new java.util.ArrayList<Linux_FirewallManagedPortsForInterface>();
       CloseableIterator enumeration = null;

       try {
          enumeration = cimClient.references(
             this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLMANAGEDPORTSFORINTERFACE, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList);
        } catch (WBEMException e) {
         	  throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLMANAGEDPORTSFORINTERFACE, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList));	
        }
         
        try {
          while (enumeration.hasNext()) {
             Linux_FirewallManagedPortsHelper.checkException(enumeration);
             Object obj = enumeration.next();
             Linux_FirewallManagedPortsHelper.checkException(enumeration);

             if (obj instanceof CIMInstance) {
                CIMInstance cimInstance = (CIMInstance)obj;
                Class<?> clazz = Linux_FirewallManagedPortsForInterfaceHelper.findClass(cimClient, cimInstance);
                    
                if (clazz == null) {
                   System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                   result.add(new Linux_FirewallManagedPortsForInterface(cimInstance));
                   continue;
                }

                Class<?>[] constParams = new Class[1];
                constParams[0] = CIMInstance.class;
                Constructor<?> cons = null;
                try {
                   cons = clazz.getConstructor(constParams);
                } catch(NoSuchMethodException e) {
                   System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                   result.add(new Linux_FirewallManagedPortsForInterface(cimInstance));
                   continue;
                }

                try {
                   Object[] actargs = new Object[] {cimInstance};
                   Object dataObj = cons.newInstance(actargs);
                   result.add((Linux_FirewallManagedPortsForInterface)dataObj);
                } catch (Exception e) {
                   System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                   result.add(new Linux_FirewallManagedPortsForInterface(cimInstance));
                   continue;
                }
              }
           }
           Linux_FirewallManagedPortsHelper.checkException(enumeration);
        } finally {
           try {
              if (enumeration != null) {
                 enumeration.close();
              }
           } catch(Exception e) {
              throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
           }
       }

       return result;
   }
    
   /**
    * Get a list of CIMObjectPath items of the associations Linux_FirewallManagedPortsForInterface
    *
    * @param cimClient the WBEMClient for the communication
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociationNames_Linux_FirewallManagedPortsForInterface(WBEMClient cimClient,String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(
                this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLMANAGEDPORTSFORINTERFACE, 
                role);
        } catch (WBEMException e) {
         	  throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLMANAGEDPORTSFORINTERFACE, 
                role));	
        }
         
        try {
                while (enumeration.hasNext()) {
                   Linux_FirewallManagedPortsHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   Linux_FirewallManagedPortsHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_FirewallManagedPortsForInterface.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                Linux_FirewallManagedPortsHelper.checkException(enumeration);
        } finally {
        try {
            if (enumeration != null) {
                    enumeration.close();
            }
        } catch(Exception e) {
               throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
        }
     }
     return result;
   }
    
                           
                                        
                
//**********************************************************************
// Extrinsic Method invocations     
//**********************************************************************                         
                         

 

//**********************************************************************
// utility methods     
//**********************************************************************                         
    


    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName()
    {
    	    return Linux_FirewallManagedPorts.CIM_CLASS_NAME;
    }



}