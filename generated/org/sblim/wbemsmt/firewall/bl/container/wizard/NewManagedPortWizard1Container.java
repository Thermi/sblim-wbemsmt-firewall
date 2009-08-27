/**
 * NewManagedPortWizard1Container.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER
 * THE TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF
 * THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of
 * the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.firewall.bl.container.wizard;

public interface NewManagedPortWizard1Container extends org.sblim.wbemsmt.bl.adapter.DataContainer {
    /** 
     * Constants for Fields and Roles
     **/
    public static final String FIELD_USR_STARTPORT = "usr_StartPort";
    public static final String FIELD_USR_ENDPORT = "usr_EndPort";
    public static final String FIELD_USR_PROTOCOL = "usr_Protocol";

    /** 
     * Defined Fields
     **/

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_StartPort();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_EndPort();

    /**
     * <br>
     * DataType INTEGER<br>
     * UIType COMBOBOX<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf get_usr_Protocol();

    /** 
     * Linked DataContainers
     **/

}