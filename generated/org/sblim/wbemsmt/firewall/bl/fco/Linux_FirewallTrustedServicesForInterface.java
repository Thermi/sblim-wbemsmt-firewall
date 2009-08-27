/**
 * Linux_FirewallTrustedServicesForInterface.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS
 * PROVIDED UNDER THE TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR
 * DISTRIBUTION OF THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a
 * current copy of the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Any Interface can have more than one Trusted
 *            Service supported on it. This association is represented by this mof. generated Class
 */

package org.sblim.wbemsmt.firewall.bl.fco;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

import org.sblim.wbemsmt.schema.cim221.*;

public class Linux_FirewallTrustedServicesForInterface extends CIM_Component {

    public final static String CIM_CLASS_NAME = "Linux_FirewallTrustedServicesForInterface";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property GroupComponent
     * 
     */
    public static class PROPERTY_GROUPCOMPONENT_LINUX_FIREWALLINTERFACE {
        /**
         * name of the property GroupComponent
         */
        public final static String NAME = "GroupComponent";

    }

    /**
     * Constants of property PartComponent
     * 
     */
    public static class PROPERTY_PARTCOMPONENT_LINUX_FIREWALLTRUSTEDSERVICES {
        /**
         * name of the property PartComponent
         */
        public final static String NAME = "PartComponent";

    }

    static {
        addPackage("org.sblim.wbemsmt.firewall.bl.fco");
        String[] parentClassPackageList = CIM_Component.getPackages();

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
     *   Any Interface can have more than one Trusted Service supported on it.  This association is represented by this mof.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public Linux_FirewallTrustedServicesForInterface(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Any Interface can have more than one Trusted Service supported on it.  This association is represented by this mof.
     *   @param cimInstance the instance that is used to create the Object
     */

    public Linux_FirewallTrustedServicesForInterface(CIMInstance cimInstance)
            throws WbemsmtException {

        if (cimInstance == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimInstance parameter does not contain a valid reference.");
        }
        setFromServer(true);
        init(cimInstance, false);
    }

    /**
     * Default constructor
     */
    protected Linux_FirewallTrustedServicesForInterface() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("GroupComponent", new CIMProperty("GroupComponent", new CIMDataType(
                Linux_FirewallInterface.CIM_CLASS_NAME), null));
        propertiesToCheck.put("PartComponent", new CIMProperty("PartComponent", new CIMDataType(
                Linux_FirewallTrustedServices.CIM_CLASS_NAME), null));

        super.init(cimInstance, overwrite);

        //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
        //we overwrite the dataType by setting null for every embeddedObject/Instance property
        if (overwrite) {

        }
    }

    //**********************************************************************
    // Properties get/set     
    //**********************************************************************

    /**
     * Get the property GroupComponent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public Linux_FirewallInterface get_GroupComponent_Linux_FirewallInterface(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_GROUPCOMPONENT_LINUX_FIREWALLINTERFACE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_LINUX_FIREWALLINTERFACE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return Linux_FirewallInterfaceHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property GroupComponent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_GroupComponent_Linux_FirewallInterface(Linux_FirewallInterface newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_GROUPCOMPONENT_LINUX_FIREWALLINTERFACE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_GroupComponent_Linux_FirewallInterface(currentProperty,
                    newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_LINUX_FIREWALLINTERFACE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property GroupComponent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_GroupComponent_Linux_FirewallInterface(WBEMClient client,
            String namespace, Linux_FirewallInterface newValue) throws WbemsmtException {
        Linux_FirewallTrustedServicesForInterface fco = new Linux_FirewallTrustedServicesForInterface(
                client, namespace);
        CIMProperty property = fco
                .getProperty(PROPERTY_GROUPCOMPONENT_LINUX_FIREWALLINTERFACE.NAME);
        if (property != null) {
            property = setPropertyValue_GroupComponent_Linux_FirewallInterface(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_LINUX_FIREWALLINTERFACE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property GroupComponent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_GroupComponent_Linux_FirewallInterface(
            CIMProperty currentProperty, Linux_FirewallInterface newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PartComponent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public Linux_FirewallTrustedServices get_PartComponent_Linux_FirewallTrustedServices(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_PARTCOMPONENT_LINUX_FIREWALLTRUSTEDSERVICES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PARTCOMPONENT_LINUX_FIREWALLTRUSTEDSERVICES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return Linux_FirewallTrustedServicesHelper.getInstance(client,
                (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property PartComponent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PartComponent_Linux_FirewallTrustedServices(
            Linux_FirewallTrustedServices newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PARTCOMPONENT_LINUX_FIREWALLTRUSTEDSERVICES.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PartComponent_Linux_FirewallTrustedServices(
                    currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PARTCOMPONENT_LINUX_FIREWALLTRUSTEDSERVICES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PartComponent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PartComponent_Linux_FirewallTrustedServices(WBEMClient client,
            String namespace, Linux_FirewallTrustedServices newValue) throws WbemsmtException {
        Linux_FirewallTrustedServicesForInterface fco = new Linux_FirewallTrustedServicesForInterface(
                client, namespace);
        CIMProperty property = fco
                .getProperty(PROPERTY_PARTCOMPONENT_LINUX_FIREWALLTRUSTEDSERVICES.NAME);
        if (property != null) {
            property = setPropertyValue_PartComponent_Linux_FirewallTrustedServices(property,
                    newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PARTCOMPONENT_LINUX_FIREWALLTRUSTEDSERVICES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PartComponent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_PartComponent_Linux_FirewallTrustedServices(
            CIMProperty currentProperty, Linux_FirewallTrustedServices newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    //**********************************************************************
    // Associators methods     
    //**********************************************************************

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
    public String getObjectName() {
        return Linux_FirewallTrustedServicesForInterface.CIM_CLASS_NAME;
    }

}