/**
 * FirewallCimAdapterUpdateModelIf.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER
 * THE TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF
 * THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of
 * the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceUpdateModel.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.firewall.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.*;

import org.sblim.wbemsmt.exception.WbemsmtException;

/*
 * * This is the interface containing only the updateModel-Methods for the delegate
 */

public interface FirewallCimAdapterUpdateModelIf extends UpdateModelDelegatee {

    public static final String[] RESOURCE_BUNDLE_NAMES = new String[] { "messages",
            "messagesFirewall" };

    /** 
     * UpdateModel-Methods
     **/
    public void updateModelImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FirewallServiceConfContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard1Container container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard2Container container)
            throws WbemsmtException;

}