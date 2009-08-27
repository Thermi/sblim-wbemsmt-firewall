/**
 * Linux_FirewallElementConformsToProfile.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS
 * PROVIDED UNDER THE TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR
 * DISTRIBUTION OF THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a
 * current copy of the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Association between the Firewall Registered
 *            Profile and the Firewall Service generated Class
 */

package org.sblim.wbemsmt.firewall.bl.fco;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

import org.sblim.wbemsmt.schema.cim221.*;

public class Linux_FirewallElementConformsToProfile extends CIM_ElementConformsToProfile {

    public final static String CIM_CLASS_NAME = "Linux_FirewallElementConformsToProfile";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ConformantStandard
     * 
     */
    public static class PROPERTY_CONFORMANTSTANDARD_LINUX_FIREWALLREGISTEREDPROFILE {
        /**
         * name of the property ConformantStandard
         */
        public final static String NAME = "ConformantStandard";

    }

    /**
     * Constants of property ManagedElement
     * 
     */
    public static class PROPERTY_MANAGEDELEMENT_LINUX_FIREWALLSERVICE {
        /**
         * name of the property ManagedElement
         */
        public final static String NAME = "ManagedElement";

    }

    static {
        addPackage("org.sblim.wbemsmt.firewall.bl.fco");
        String[] parentClassPackageList = CIM_ElementConformsToProfile.getPackages();

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
     *   Association between the Firewall Registered Profile and the Firewall Service
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public Linux_FirewallElementConformsToProfile(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Association between the Firewall Registered Profile and the Firewall Service
     *   @param cimInstance the instance that is used to create the Object
     */

    public Linux_FirewallElementConformsToProfile(CIMInstance cimInstance) throws WbemsmtException {

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
    protected Linux_FirewallElementConformsToProfile() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ConformantStandard", new CIMProperty("ConformantStandard",
                new CIMDataType(Linux_FirewallRegisteredProfile.CIM_CLASS_NAME), null));
        propertiesToCheck.put("ManagedElement", new CIMProperty("ManagedElement", new CIMDataType(
                Linux_FirewallService.CIM_CLASS_NAME), null));

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
     * Get the property ConformantStandard
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public Linux_FirewallRegisteredProfile get_ConformantStandard_Linux_FirewallRegisteredProfile(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_CONFORMANTSTANDARD_LINUX_FIREWALLREGISTEREDPROFILE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property "
                    + PROPERTY_CONFORMANTSTANDARD_LINUX_FIREWALLREGISTEREDPROFILE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return Linux_FirewallRegisteredProfileHelper.getInstance(client,
                (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property ConformantStandard
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ConformantStandard_Linux_FirewallRegisteredProfile(
            Linux_FirewallRegisteredProfile newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CONFORMANTSTANDARD_LINUX_FIREWALLREGISTEREDPROFILE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ConformantStandard_Linux_FirewallRegisteredProfile(
                    currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property "
                    + PROPERTY_CONFORMANTSTANDARD_LINUX_FIREWALLREGISTEREDPROFILE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ConformantStandard by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ConformantStandard_Linux_FirewallRegisteredProfile(
            WBEMClient client, String namespace, Linux_FirewallRegisteredProfile newValue)
            throws WbemsmtException {
        Linux_FirewallElementConformsToProfile fco = new Linux_FirewallElementConformsToProfile(
                client, namespace);
        CIMProperty property = fco
                .getProperty(PROPERTY_CONFORMANTSTANDARD_LINUX_FIREWALLREGISTEREDPROFILE.NAME);
        if (property != null) {
            property = setPropertyValue_ConformantStandard_Linux_FirewallRegisteredProfile(
                    property, newValue);
        }
        else {
            logger.warning("Property "
                    + PROPERTY_CONFORMANTSTANDARD_LINUX_FIREWALLREGISTEREDPROFILE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ConformantStandard
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_ConformantStandard_Linux_FirewallRegisteredProfile(
            CIMProperty currentProperty, Linux_FirewallRegisteredProfile newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ManagedElement
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public Linux_FirewallService get_ManagedElement_Linux_FirewallService(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_MANAGEDELEMENT_LINUX_FIREWALLSERVICE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_LINUX_FIREWALLSERVICE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return Linux_FirewallServiceHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property ManagedElement
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ManagedElement_Linux_FirewallService(Linux_FirewallService newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MANAGEDELEMENT_LINUX_FIREWALLSERVICE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ManagedElement_Linux_FirewallService(currentProperty,
                    newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_LINUX_FIREWALLSERVICE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ManagedElement by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ManagedElement_Linux_FirewallService(WBEMClient client,
            String namespace, Linux_FirewallService newValue) throws WbemsmtException {
        Linux_FirewallElementConformsToProfile fco = new Linux_FirewallElementConformsToProfile(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MANAGEDELEMENT_LINUX_FIREWALLSERVICE.NAME);
        if (property != null) {
            property = setPropertyValue_ManagedElement_Linux_FirewallService(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_LINUX_FIREWALLSERVICE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ManagedElement
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_ManagedElement_Linux_FirewallService(
            CIMProperty currentProperty, Linux_FirewallService newValue) {
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
        return Linux_FirewallElementConformsToProfile.CIM_CLASS_NAME;
    }

}