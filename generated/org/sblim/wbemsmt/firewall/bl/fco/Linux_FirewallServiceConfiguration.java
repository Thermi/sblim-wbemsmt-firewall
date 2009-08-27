/** 
  * Linux_FirewallServiceConfiguration.java
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
  * Description: Entity which represents a configuration file for the service.
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
public class Linux_FirewallServiceConfiguration extends  CIM_Configuration {



   public final static String CIM_CLASS_NAME = "Linux_FirewallServiceConfiguration";
   public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    
    /**
     *  An Association between the Service and the Configuration data specified in the ServiceConfiguration class
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLSERVICECONFIGURATIONFORSERVICE = "Linux_FirewallServiceConfigurationForService";
    
    
    
	    /**
	     * Constants of property IPTABLES_MODULES
     * Load additional iptables modules (nat helpers) Default: -none- Space separated list of nat helpers (e.g. 'ip_nat_ftp ip_nat_irc'), which are loaded after the firewall rules are applied. Options for the helpers are stored in /etc/modprobe.conf.
     */
    public static class PROPERTY_IPTABLES_MODULES
    {
       /**
        * name of the property IPTABLES_MODULES
        */
       public final static String NAME = "IPTABLES_MODULES";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property IPTABLES_MODULES_UNLOAD
     * Unload modules on restart and stop Value: yes|no,  default: yes This option has to be 'yes' to get to a sane state for a firewall restart or stop. Only set to 'no' if there are problems unloading netfilter modules.
     */
    public static class PROPERTY_IPTABLES_MODULES_UNLOAD
    {
       /**
        * name of the property IPTABLES_MODULES_UNLOAD
        */
       public final static String NAME = "IPTABLES_MODULES_UNLOAD";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property IPTABLES_SAVE_COUNTER
     * Save (and restore) rule and chain counter. Value: yes|no,  default: no Save counters for rules and chains to /etc/sysconfig/iptables if 'service iptables save' is called or on stop or restart if SAVE_ON_STOP or SAVE_ON_RESTART is enabled.
     */
    public static class PROPERTY_IPTABLES_SAVE_COUNTER
    {
       /**
        * name of the property IPTABLES_SAVE_COUNTER
        */
       public final static String NAME = "IPTABLES_SAVE_COUNTER";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property IPTABLES_SAVE_ON_RESTART
     * Save current firewall rules on restart. Value: yes|no,default: no Saves all firewall rules to /etc/sysconfig/iptables if firewall gets restarted.
     */
    public static class PROPERTY_IPTABLES_SAVE_ON_RESTART
    {
       /**
        * name of the property IPTABLES_SAVE_ON_RESTART
        */
       public final static String NAME = "IPTABLES_SAVE_ON_RESTART";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property IPTABLES_SAVE_ON_STOP
     * Save current firewall rules on stop. Value: yes|no,  default: no Saves all firewall rules to /etc/sysconfig/iptables if firewall gets stopped (e.g. on system shutdown).
     */
    public static class PROPERTY_IPTABLES_SAVE_ON_STOP
    {
       /**
        * name of the property IPTABLES_SAVE_ON_STOP
        */
       public final static String NAME = "IPTABLES_SAVE_ON_STOP";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property IPTABLES_STATUS_LINENUMBERS
     * Status output with numbered lines Value: yes|no,  default: yes Print a counter/number for every rule in the status output.
     */
    public static class PROPERTY_IPTABLES_STATUS_LINENUMBERS
    {
       /**
        * name of the property IPTABLES_STATUS_LINENUMBERS
        */
       public final static String NAME = "IPTABLES_STATUS_LINENUMBERS";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property IPTABLES_STATUS_NUMERIC
     * Numeric status output Value: yes|no,  default: yes Print IP addresses and port numbers in numeric format in the status output.
     */
    public static class PROPERTY_IPTABLES_STATUS_NUMERIC
    {
       /**
        * name of the property IPTABLES_STATUS_NUMERIC
        */
       public final static String NAME = "IPTABLES_STATUS_NUMERIC";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property IPTABLES_STATUS_VERBOSE
     * Verbose status output Value: yes|no,  default: yes Print info about the number of packets and bytes plus the "input-" and "outputdevice" in the status output.
     */
    public static class PROPERTY_IPTABLES_STATUS_VERBOSE
    {
       /**
        * name of the property IPTABLES_STATUS_VERBOSE
        */
       public final static String NAME = "IPTABLES_STATUS_VERBOSE";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property configurationFile
     * Name of the Configuration file with absolute path.
     */
    public static class PROPERTY_CONFIGURATIONFILE
    {
       /**
        * name of the property configurationFile
        */
       public final static String NAME = "configurationFile";                  

	    	
    

    		    
	
	    
	    }
	    	    

   

    
    static {    
           addPackage("org.sblim.wbemsmt.firewall.bl.fco");
                         String[] parentClassPackageList = CIM_Configuration.getPackages();
        
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
    *   Entity which represents a configuration file for the service.
    *   @param client the CIM Client
    *   @param namespace the target namespace
    */  

      
   public Linux_FirewallServiceConfiguration(WBEMClient client, String namespace) throws WbemsmtException
   {
       CIMClass cls = getClass(client,namespace);
       setFromServer(false);
       init(cls.newInstance(),true);
   }
        
   /**
    *   Class constructor
    * 
    *       *   <br>
    *   Entity which represents a configuration file for the service.
    *   @param cimInstance the instance that is used to create the Object
    */  
   
   public Linux_FirewallServiceConfiguration(CIMInstance cimInstance)  throws WbemsmtException { 
        
       if (cimInstance == null) {
           throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, "The cimInstance parameter does not contain a valid reference.");
       }
       setFromServer(true);
       init(cimInstance,false);
   }
   
   /**
    * Default constructor
    */
   protected Linux_FirewallServiceConfiguration()
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
              propertiesToCheck.put("IPTABLES_MODULES",new CIMProperty("IPTABLES_MODULES",CIMDataType.STRING_T,null));
              propertiesToCheck.put("IPTABLES_MODULES_UNLOAD",new CIMProperty("IPTABLES_MODULES_UNLOAD",CIMDataType.BOOLEAN_T,null));
              propertiesToCheck.put("IPTABLES_SAVE_COUNTER",new CIMProperty("IPTABLES_SAVE_COUNTER",CIMDataType.BOOLEAN_T,null));
              propertiesToCheck.put("IPTABLES_SAVE_ON_RESTART",new CIMProperty("IPTABLES_SAVE_ON_RESTART",CIMDataType.BOOLEAN_T,null));
              propertiesToCheck.put("IPTABLES_SAVE_ON_STOP",new CIMProperty("IPTABLES_SAVE_ON_STOP",CIMDataType.BOOLEAN_T,null));
              propertiesToCheck.put("IPTABLES_STATUS_LINENUMBERS",new CIMProperty("IPTABLES_STATUS_LINENUMBERS",CIMDataType.BOOLEAN_T,null));
              propertiesToCheck.put("IPTABLES_STATUS_NUMERIC",new CIMProperty("IPTABLES_STATUS_NUMERIC",CIMDataType.BOOLEAN_T,null));
              propertiesToCheck.put("IPTABLES_STATUS_VERBOSE",new CIMProperty("IPTABLES_STATUS_VERBOSE",CIMDataType.BOOLEAN_T,null));
              propertiesToCheck.put("configurationFile",new CIMProperty("configurationFile",CIMDataType.STRING_T,null));
       	
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
    * Get the property IPTABLES_MODULES
    *     * <br>
    * Load additional iptables modules (nat helpers) Default: -none- Space separated list of nat helpers (e.g. 'ip_nat_ftp ip_nat_irc'), which are loaded after the firewall rules are applied. Options for the helpers are stored in /etc/modprobe.conf.
    *     */

      

               
   public String get_IPTABLES_MODULES()    {
       CIMProperty currentProperty = getProperty(PROPERTY_IPTABLES_MODULES.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_IPTABLES_MODULES.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property IPTABLES_MODULES
    * <br>
    * Load additional iptables modules (nat helpers) Default: -none- Space separated list of nat helpers (e.g. 'ip_nat_ftp ip_nat_irc'), which are loaded after the firewall rules are applied. Options for the helpers are stored in /etc/modprobe.conf.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_IPTABLES_MODULES(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_IPTABLES_MODULES.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_IPTABLES_MODULES(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_IPTABLES_MODULES.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property IPTABLES_MODULES by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IPTABLES_MODULES(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        Linux_FirewallServiceConfiguration fco = new Linux_FirewallServiceConfiguration(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_IPTABLES_MODULES.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_IPTABLES_MODULES(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_IPTABLES_MODULES.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property IPTABLES_MODULES
    * <br>
    * Load additional iptables modules (nat helpers) Default: -none- Space separated list of nat helpers (e.g. 'ip_nat_ftp ip_nat_irc'), which are loaded after the firewall rules are applied. Options for the helpers are stored in /etc/modprobe.conf.
    */
    
   private static CIMProperty setPropertyValue_IPTABLES_MODULES(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property IPTABLES_MODULES_UNLOAD
    *     * <br>
    * Unload modules on restart and stop Value: yes|no,  default: yes This option has to be 'yes' to get to a sane state for a firewall restart or stop. Only set to 'no' if there are problems unloading netfilter modules.
    *     */

      

               
   public Boolean get_IPTABLES_MODULES_UNLOAD()    {
       CIMProperty currentProperty = getProperty(PROPERTY_IPTABLES_MODULES_UNLOAD.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_IPTABLES_MODULES_UNLOAD.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (Boolean)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property IPTABLES_MODULES_UNLOAD
    * <br>
    * Unload modules on restart and stop Value: yes|no,  default: yes This option has to be 'yes' to get to a sane state for a firewall restart or stop. Only set to 'no' if there are problems unloading netfilter modules.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_IPTABLES_MODULES_UNLOAD(Boolean newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_IPTABLES_MODULES_UNLOAD.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_IPTABLES_MODULES_UNLOAD(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_IPTABLES_MODULES_UNLOAD.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property IPTABLES_MODULES_UNLOAD by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IPTABLES_MODULES_UNLOAD(WBEMClient client, String namespace, Boolean newValue) throws WbemsmtException {
        Linux_FirewallServiceConfiguration fco = new Linux_FirewallServiceConfiguration(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_IPTABLES_MODULES_UNLOAD.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_IPTABLES_MODULES_UNLOAD(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_IPTABLES_MODULES_UNLOAD.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property IPTABLES_MODULES_UNLOAD
    * <br>
    * Unload modules on restart and stop Value: yes|no,  default: yes This option has to be 'yes' to get to a sane state for a firewall restart or stop. Only set to 'no' if there are problems unloading netfilter modules.
    */
    
   private static CIMProperty setPropertyValue_IPTABLES_MODULES_UNLOAD(CIMProperty currentProperty, Boolean newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property IPTABLES_SAVE_COUNTER
    *     * <br>
    * Save (and restore) rule and chain counter. Value: yes|no,  default: no Save counters for rules and chains to /etc/sysconfig/iptables if 'service iptables save' is called or on stop or restart if SAVE_ON_STOP or SAVE_ON_RESTART is enabled.
    *     */

      

               
   public Boolean get_IPTABLES_SAVE_COUNTER()    {
       CIMProperty currentProperty = getProperty(PROPERTY_IPTABLES_SAVE_COUNTER.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_IPTABLES_SAVE_COUNTER.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (Boolean)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property IPTABLES_SAVE_COUNTER
    * <br>
    * Save (and restore) rule and chain counter. Value: yes|no,  default: no Save counters for rules and chains to /etc/sysconfig/iptables if 'service iptables save' is called or on stop or restart if SAVE_ON_STOP or SAVE_ON_RESTART is enabled.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_IPTABLES_SAVE_COUNTER(Boolean newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_IPTABLES_SAVE_COUNTER.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_IPTABLES_SAVE_COUNTER(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_IPTABLES_SAVE_COUNTER.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property IPTABLES_SAVE_COUNTER by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IPTABLES_SAVE_COUNTER(WBEMClient client, String namespace, Boolean newValue) throws WbemsmtException {
        Linux_FirewallServiceConfiguration fco = new Linux_FirewallServiceConfiguration(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_IPTABLES_SAVE_COUNTER.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_IPTABLES_SAVE_COUNTER(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_IPTABLES_SAVE_COUNTER.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property IPTABLES_SAVE_COUNTER
    * <br>
    * Save (and restore) rule and chain counter. Value: yes|no,  default: no Save counters for rules and chains to /etc/sysconfig/iptables if 'service iptables save' is called or on stop or restart if SAVE_ON_STOP or SAVE_ON_RESTART is enabled.
    */
    
   private static CIMProperty setPropertyValue_IPTABLES_SAVE_COUNTER(CIMProperty currentProperty, Boolean newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property IPTABLES_SAVE_ON_RESTART
    *     * <br>
    * Save current firewall rules on restart. Value: yes|no,default: no Saves all firewall rules to /etc/sysconfig/iptables if firewall gets restarted.
    *     */

      

               
   public Boolean get_IPTABLES_SAVE_ON_RESTART()    {
       CIMProperty currentProperty = getProperty(PROPERTY_IPTABLES_SAVE_ON_RESTART.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_IPTABLES_SAVE_ON_RESTART.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (Boolean)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property IPTABLES_SAVE_ON_RESTART
    * <br>
    * Save current firewall rules on restart. Value: yes|no,default: no Saves all firewall rules to /etc/sysconfig/iptables if firewall gets restarted.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_IPTABLES_SAVE_ON_RESTART(Boolean newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_IPTABLES_SAVE_ON_RESTART.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_IPTABLES_SAVE_ON_RESTART(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_IPTABLES_SAVE_ON_RESTART.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property IPTABLES_SAVE_ON_RESTART by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IPTABLES_SAVE_ON_RESTART(WBEMClient client, String namespace, Boolean newValue) throws WbemsmtException {
        Linux_FirewallServiceConfiguration fco = new Linux_FirewallServiceConfiguration(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_IPTABLES_SAVE_ON_RESTART.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_IPTABLES_SAVE_ON_RESTART(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_IPTABLES_SAVE_ON_RESTART.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property IPTABLES_SAVE_ON_RESTART
    * <br>
    * Save current firewall rules on restart. Value: yes|no,default: no Saves all firewall rules to /etc/sysconfig/iptables if firewall gets restarted.
    */
    
   private static CIMProperty setPropertyValue_IPTABLES_SAVE_ON_RESTART(CIMProperty currentProperty, Boolean newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property IPTABLES_SAVE_ON_STOP
    *     * <br>
    * Save current firewall rules on stop. Value: yes|no,  default: no Saves all firewall rules to /etc/sysconfig/iptables if firewall gets stopped (e.g. on system shutdown).
    *     */

      

               
   public Boolean get_IPTABLES_SAVE_ON_STOP()    {
       CIMProperty currentProperty = getProperty(PROPERTY_IPTABLES_SAVE_ON_STOP.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_IPTABLES_SAVE_ON_STOP.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (Boolean)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property IPTABLES_SAVE_ON_STOP
    * <br>
    * Save current firewall rules on stop. Value: yes|no,  default: no Saves all firewall rules to /etc/sysconfig/iptables if firewall gets stopped (e.g. on system shutdown).
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_IPTABLES_SAVE_ON_STOP(Boolean newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_IPTABLES_SAVE_ON_STOP.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_IPTABLES_SAVE_ON_STOP(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_IPTABLES_SAVE_ON_STOP.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property IPTABLES_SAVE_ON_STOP by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IPTABLES_SAVE_ON_STOP(WBEMClient client, String namespace, Boolean newValue) throws WbemsmtException {
        Linux_FirewallServiceConfiguration fco = new Linux_FirewallServiceConfiguration(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_IPTABLES_SAVE_ON_STOP.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_IPTABLES_SAVE_ON_STOP(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_IPTABLES_SAVE_ON_STOP.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property IPTABLES_SAVE_ON_STOP
    * <br>
    * Save current firewall rules on stop. Value: yes|no,  default: no Saves all firewall rules to /etc/sysconfig/iptables if firewall gets stopped (e.g. on system shutdown).
    */
    
   private static CIMProperty setPropertyValue_IPTABLES_SAVE_ON_STOP(CIMProperty currentProperty, Boolean newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property IPTABLES_STATUS_LINENUMBERS
    *     * <br>
    * Status output with numbered lines Value: yes|no,  default: yes Print a counter/number for every rule in the status output.
    *     */

      

               
   public Boolean get_IPTABLES_STATUS_LINENUMBERS()    {
       CIMProperty currentProperty = getProperty(PROPERTY_IPTABLES_STATUS_LINENUMBERS.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_IPTABLES_STATUS_LINENUMBERS.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (Boolean)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property IPTABLES_STATUS_LINENUMBERS
    * <br>
    * Status output with numbered lines Value: yes|no,  default: yes Print a counter/number for every rule in the status output.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_IPTABLES_STATUS_LINENUMBERS(Boolean newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_IPTABLES_STATUS_LINENUMBERS.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_IPTABLES_STATUS_LINENUMBERS(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_IPTABLES_STATUS_LINENUMBERS.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property IPTABLES_STATUS_LINENUMBERS by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IPTABLES_STATUS_LINENUMBERS(WBEMClient client, String namespace, Boolean newValue) throws WbemsmtException {
        Linux_FirewallServiceConfiguration fco = new Linux_FirewallServiceConfiguration(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_IPTABLES_STATUS_LINENUMBERS.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_IPTABLES_STATUS_LINENUMBERS(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_IPTABLES_STATUS_LINENUMBERS.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property IPTABLES_STATUS_LINENUMBERS
    * <br>
    * Status output with numbered lines Value: yes|no,  default: yes Print a counter/number for every rule in the status output.
    */
    
   private static CIMProperty setPropertyValue_IPTABLES_STATUS_LINENUMBERS(CIMProperty currentProperty, Boolean newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property IPTABLES_STATUS_NUMERIC
    *     * <br>
    * Numeric status output Value: yes|no,  default: yes Print IP addresses and port numbers in numeric format in the status output.
    *     */

      

               
   public Boolean get_IPTABLES_STATUS_NUMERIC()    {
       CIMProperty currentProperty = getProperty(PROPERTY_IPTABLES_STATUS_NUMERIC.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_IPTABLES_STATUS_NUMERIC.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (Boolean)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property IPTABLES_STATUS_NUMERIC
    * <br>
    * Numeric status output Value: yes|no,  default: yes Print IP addresses and port numbers in numeric format in the status output.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_IPTABLES_STATUS_NUMERIC(Boolean newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_IPTABLES_STATUS_NUMERIC.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_IPTABLES_STATUS_NUMERIC(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_IPTABLES_STATUS_NUMERIC.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property IPTABLES_STATUS_NUMERIC by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IPTABLES_STATUS_NUMERIC(WBEMClient client, String namespace, Boolean newValue) throws WbemsmtException {
        Linux_FirewallServiceConfiguration fco = new Linux_FirewallServiceConfiguration(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_IPTABLES_STATUS_NUMERIC.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_IPTABLES_STATUS_NUMERIC(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_IPTABLES_STATUS_NUMERIC.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property IPTABLES_STATUS_NUMERIC
    * <br>
    * Numeric status output Value: yes|no,  default: yes Print IP addresses and port numbers in numeric format in the status output.
    */
    
   private static CIMProperty setPropertyValue_IPTABLES_STATUS_NUMERIC(CIMProperty currentProperty, Boolean newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property IPTABLES_STATUS_VERBOSE
    *     * <br>
    * Verbose status output Value: yes|no,  default: yes Print info about the number of packets and bytes plus the "input-" and "outputdevice" in the status output.
    *     */

      

               
   public Boolean get_IPTABLES_STATUS_VERBOSE()    {
       CIMProperty currentProperty = getProperty(PROPERTY_IPTABLES_STATUS_VERBOSE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_IPTABLES_STATUS_VERBOSE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (Boolean)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property IPTABLES_STATUS_VERBOSE
    * <br>
    * Verbose status output Value: yes|no,  default: yes Print info about the number of packets and bytes plus the "input-" and "outputdevice" in the status output.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_IPTABLES_STATUS_VERBOSE(Boolean newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_IPTABLES_STATUS_VERBOSE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_IPTABLES_STATUS_VERBOSE(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_IPTABLES_STATUS_VERBOSE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property IPTABLES_STATUS_VERBOSE by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IPTABLES_STATUS_VERBOSE(WBEMClient client, String namespace, Boolean newValue) throws WbemsmtException {
        Linux_FirewallServiceConfiguration fco = new Linux_FirewallServiceConfiguration(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_IPTABLES_STATUS_VERBOSE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_IPTABLES_STATUS_VERBOSE(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_IPTABLES_STATUS_VERBOSE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property IPTABLES_STATUS_VERBOSE
    * <br>
    * Verbose status output Value: yes|no,  default: yes Print info about the number of packets and bytes plus the "input-" and "outputdevice" in the status output.
    */
    
   private static CIMProperty setPropertyValue_IPTABLES_STATUS_VERBOSE(CIMProperty currentProperty, Boolean newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property configurationFile
    *     * <br>
    * Name of the Configuration file with absolute path.
    *     */

      

               
   public String get_configurationFile()    {
       CIMProperty currentProperty = getProperty(PROPERTY_CONFIGURATIONFILE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_CONFIGURATIONFILE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property configurationFile
    * <br>
    * Name of the Configuration file with absolute path.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_configurationFile(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_CONFIGURATIONFILE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_configurationFile(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_CONFIGURATIONFILE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property configurationFile by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_configurationFile(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        Linux_FirewallServiceConfiguration fco = new Linux_FirewallServiceConfiguration(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CONFIGURATIONFILE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_configurationFile(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_CONFIGURATIONFILE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property configurationFile
    * <br>
    * Name of the Configuration file with absolute path.
    */
    
   private static CIMProperty setPropertyValue_configurationFile(CIMProperty currentProperty, String newValue)
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
     * Get the list with Linux_FirewallService objects associated by the association Linux_FirewallServiceConfigurationForService
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLSERVICECONFIGURATIONFORSERVICE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<Linux_FirewallService> getAssociated_Linux_FirewallService_Linux_FirewallServiceConfigurationForServices(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_Linux_FirewallService_Linux_FirewallServiceConfigurationForServices(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLSERVICECONFIGURATIONFORSERVICE,
     	                Linux_FirewallService.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with Linux_FirewallService objects associated by the association Linux_FirewallServiceConfigurationForService
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLSERVICECONFIGURATIONFORSERVICE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLSERVICECONFIGURATIONFORSERVICE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<Linux_FirewallService> getAssociated_Linux_FirewallService_Linux_FirewallServiceConfigurationForServices(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_Linux_FirewallService_Linux_FirewallServiceConfigurationForServices(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLSERVICECONFIGURATIONFORSERVICE,
     	                resultClass,
     	                role,
     	                resultRole,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with Linux_FirewallService objects associated by the association Linux_FirewallServiceConfigurationForService
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLSERVICECONFIGURATIONFORSERVICE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<Linux_FirewallService> getAssociated_Linux_FirewallService_Linux_FirewallServiceConfigurationForServices(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

         if (cimClient == null) {
             throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
         }

         java.util.List<Linux_FirewallService> result = new java.util.ArrayList<Linux_FirewallService>();
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
                 Linux_FirewallServiceConfigurationHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 Linux_FirewallServiceConfigurationHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = Linux_FirewallServiceConfigurationHelper.findClass(cimClient, cimInstance);
                    
                     if (clazz == null) {
                         System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                         result.add(new Linux_FirewallService(cimInstance));
                         continue;
                     }

                     Class<?>[] constParams = new Class[1];
                     constParams[0] = CIMInstance.class;
                     Constructor<?> cons = null;
                     try {
                         cons = clazz.getConstructor(constParams);
                     } catch(NoSuchMethodException e) {
                         System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                         result.add(new Linux_FirewallService(cimInstance));
                         continue;
                     }

                     try {
                         Object[] actargs = new Object[] {cimInstance};
                         Object dataObj = cons.newInstance(actargs);
                         result.add((Linux_FirewallService)dataObj);
                     } catch (Exception e) {
                         System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                         result.add(new Linux_FirewallService(cimInstance));
                         continue;
                     }
                 }
             }
             Linux_FirewallServiceConfigurationHelper.checkException(enumeration);
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
    * Get the list of CIMObjectPath items of the objects associated by the association Linux_FirewallServiceConfigurationForService
    * @param cimClient the WBEMClient for the communication
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLSERVICECONFIGURATIONFORSERVICE as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_Linux_FirewallService_Linux_FirewallServiceConfigurationForServiceNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_Linux_FirewallService_Linux_FirewallServiceConfigurationForServiceNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLSERVICECONFIGURATIONFORSERVICE,
    	                             Linux_FirewallService.CIM_CLASS_NAME,
    	                             null,
    	                             null);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association Linux_FirewallServiceConfigurationForService
    * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLSERVICECONFIGURATIONFORSERVICE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLSERVICECONFIGURATIONFORSERVICE as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_Linux_FirewallService_Linux_FirewallServiceConfigurationForServiceNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_Linux_FirewallService_Linux_FirewallServiceConfigurationForServiceNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLSERVICECONFIGURATIONFORSERVICE,
    	                             resultClass,
    	                             role,
    	                             resultRole);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association Linux_FirewallServiceConfigurationForService
    * @param cimClient the WBEMClient for the communication
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_Linux_FirewallService_Linux_FirewallServiceConfigurationForServiceNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

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
                CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLSERVICECONFIGURATIONFORSERVICE, 
                Linux_FirewallService.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                Linux_FirewallServiceConfigurationHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                Linux_FirewallServiceConfigurationHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_FirewallService.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            Linux_FirewallServiceConfigurationHelper.checkException(enumeration);
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
    * Get the list with Linux_FirewallServiceConfigurationForService associations
    *
    * @param cimClient the WBEMClient for the communication
    * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
    * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
    *
    * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
    **/
                        
                        
   public java.util.List<Linux_FirewallServiceConfigurationForService> getAssociations_Linux_FirewallServiceConfigurationForService(WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin, String role,java.lang.String[] propertyList) throws WbemsmtException {

       if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
       }

       java.util.List<Linux_FirewallServiceConfigurationForService> result = new java.util.ArrayList<Linux_FirewallServiceConfigurationForService>();
       CloseableIterator enumeration = null;

       try {
          enumeration = cimClient.references(
             this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLSERVICECONFIGURATIONFORSERVICE, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList);
        } catch (WBEMException e) {
         	  throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLSERVICECONFIGURATIONFORSERVICE, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList));	
        }
         
        try {
          while (enumeration.hasNext()) {
             Linux_FirewallServiceConfigurationHelper.checkException(enumeration);
             Object obj = enumeration.next();
             Linux_FirewallServiceConfigurationHelper.checkException(enumeration);

             if (obj instanceof CIMInstance) {
                CIMInstance cimInstance = (CIMInstance)obj;
                Class<?> clazz = Linux_FirewallServiceConfigurationForServiceHelper.findClass(cimClient, cimInstance);
                    
                if (clazz == null) {
                   System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                   result.add(new Linux_FirewallServiceConfigurationForService(cimInstance));
                   continue;
                }

                Class<?>[] constParams = new Class[1];
                constParams[0] = CIMInstance.class;
                Constructor<?> cons = null;
                try {
                   cons = clazz.getConstructor(constParams);
                } catch(NoSuchMethodException e) {
                   System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                   result.add(new Linux_FirewallServiceConfigurationForService(cimInstance));
                   continue;
                }

                try {
                   Object[] actargs = new Object[] {cimInstance};
                   Object dataObj = cons.newInstance(actargs);
                   result.add((Linux_FirewallServiceConfigurationForService)dataObj);
                } catch (Exception e) {
                   System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                   result.add(new Linux_FirewallServiceConfigurationForService(cimInstance));
                   continue;
                }
              }
           }
           Linux_FirewallServiceConfigurationHelper.checkException(enumeration);
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
    * Get a list of CIMObjectPath items of the associations Linux_FirewallServiceConfigurationForService
    *
    * @param cimClient the WBEMClient for the communication
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociationNames_Linux_FirewallServiceConfigurationForService(WBEMClient cimClient,String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(
                this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLSERVICECONFIGURATIONFORSERVICE, 
                role);
        } catch (WBEMException e) {
         	  throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_LINUX_FIREWALLSERVICECONFIGURATIONFORSERVICE, 
                role));	
        }
         
        try {
                while (enumeration.hasNext()) {
                   Linux_FirewallServiceConfigurationHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   Linux_FirewallServiceConfigurationHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(Linux_FirewallServiceConfigurationForService.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                Linux_FirewallServiceConfigurationHelper.checkException(enumeration);
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
    	    return Linux_FirewallServiceConfiguration.CIM_CLASS_NAME;
    }



}