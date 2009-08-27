/**
 * FirewallServiceOptionsContainer.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER
 * THE TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF
 * THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of
 * the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.firewall.bl.container.edit;

public interface FirewallServiceOptionsContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer {
    /** 
     * Constants for Fields and Roles
     **/
    public static final String FIELD_IPTABLES_MODULES = "IPTABLES_MODULES";
    public static final String FIELD_IPTABLES_MODULES_UNLOAD = "IPTABLES_MODULES_UNLOAD";
    public static final String FIELD_IPTABLES_SAVE_COUNTER = "IPTABLES_SAVE_COUNTER";
    public static final String FIELD_IPTABLES_SAVE_ON_RESTART = "IPTABLES_SAVE_ON_RESTART";
    public static final String FIELD_IPTABLES_SAVE_ON_STOP = "IPTABLES_SAVE_ON_STOP";
    public static final String FIELD_IPTABLES_STATUS_LINENUMBERS = "IPTABLES_STATUS_LINENUMBERS";
    public static final String FIELD_IPTABLES_STATUS_NUMERIC = "IPTABLES_STATUS_NUMERIC";
    public static final String FIELD_IPTABLES_STATUS_VERBOSE = "IPTABLES_STATUS_VERBOSE";

    /** 
     * Defined Fields
     **/

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_FirewallServiceConfiguration.IPTABLES_MODULES<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_IPTABLES_MODULES();

    /**
     * <br>
     * DataType BOOLEAN<br>
     * UIType CHECKBOX<br>
     * Relation to FCO: Linux_FirewallServiceConfiguration.IPTABLES_MODULES_UNLOAD<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_IPTABLES_MODULES_UNLOAD();

    /**
     * <br>
     * DataType BOOLEAN<br>
     * UIType CHECKBOX<br>
     * Relation to FCO: Linux_FirewallServiceConfiguration.IPTABLES_SAVE_COUNTER<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_IPTABLES_SAVE_COUNTER();

    /**
     * <br>
     * DataType BOOLEAN<br>
     * UIType CHECKBOX<br>
     * Relation to FCO: Linux_FirewallServiceConfiguration.IPTABLES_SAVE_ON_RESTART<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_IPTABLES_SAVE_ON_RESTART();

    /**
     * <br>
     * DataType BOOLEAN<br>
     * UIType CHECKBOX<br>
     * Relation to FCO: Linux_FirewallServiceConfiguration.IPTABLES_SAVE_ON_STOP<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_IPTABLES_SAVE_ON_STOP();

    /**
     * <br>
     * DataType BOOLEAN<br>
     * UIType CHECKBOX<br>
     * Relation to FCO: Linux_FirewallServiceConfiguration.IPTABLES_STATUS_LINENUMBERS<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_IPTABLES_STATUS_LINENUMBERS();

    /**
     * <br>
     * DataType BOOLEAN<br>
     * UIType CHECKBOX<br>
     * Relation to FCO: Linux_FirewallServiceConfiguration.IPTABLES_STATUS_NUMERIC<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_IPTABLES_STATUS_NUMERIC();

    /**
     * <br>
     * DataType BOOLEAN<br>
     * UIType CHECKBOX<br>
     * Relation to FCO: Linux_FirewallServiceConfiguration.IPTABLES_STATUS_VERBOSE<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_IPTABLES_STATUS_VERBOSE();

    /** 
     * Linked DataContainers
     **/

}