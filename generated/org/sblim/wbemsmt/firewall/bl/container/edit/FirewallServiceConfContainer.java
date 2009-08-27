/**
 * FirewallServiceConfContainer.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER
 * THE TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF
 * THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of
 * the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.firewall.bl.container.edit;

public interface FirewallServiceConfContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer {
    /** 
     * Constants for Fields and Roles
     **/
    public static final String FIELD_CONFIGURATIONFILE = "ConfigurationFile";
    public static final String FIELD_INVOKE_STARTSERVICE = "invoke_StartService";
    public static final String FIELD_INVOKE_STOPSERVICE = "invoke_StopService";
    public static final String FIELD_USR_RESTARTSERVICE = "usr_RestartService";

    /** 
     * Defined Fields
     **/

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_FirewallServiceConfiguration.configurationFile<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_ConfigurationFile();

    /**
     * <br>
     * DataType ACTION<br>
     * UIType BUTTON<br>
     * Relation to FCO: Linux_FirewallService.StartService<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_invoke_StartService();

    /**
     * <br>
     * DataType ACTION<br>
     * UIType BUTTON<br>
     * Relation to FCO: Linux_FirewallService.StopService<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_invoke_StopService();

    /**
     * <br>
     * DataType ACTION<br>
     * UIType BUTTON<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_RestartService();

    /** 
     * Linked DataContainers
     **/

}