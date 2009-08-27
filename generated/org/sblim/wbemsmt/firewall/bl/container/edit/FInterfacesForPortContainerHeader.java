/**
 * FirewallManagedPortContainer.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER
 * THE TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF
 * THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of
 * the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/headerClass.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Header for: linked container
 *            FInterfacesForPortContainer
 */

package org.sblim.wbemsmt.firewall.bl.container.edit;

public interface FInterfacesForPortContainerHeader {
    /**
     * Header for
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_FirewallInterface.DeviceID<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getInterfacesForPortHeader_DeviceID();

    /**
     * Header for
     * <br>
     * DataType BOOLEAN<br>
     * UIType CHECKBOX<br>
     * Relation to FCO: userdefined<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf getInterfacesForPortHeader_usr_IsEnabled();
}