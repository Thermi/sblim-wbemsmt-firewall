/**
 * FirewallCimAdapterInitWizardIf.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER
 * THE TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF
 * THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of
 * the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceInitWizard.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.firewall.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.*;

import org.sblim.wbemsmt.exception.WbemsmtException;

/*
 * * This is the interface containing only the initWizard-Methods for the delegate
 */

public interface FirewallCimAdapterInitWizardIf extends InitWizardDelegatee {

    public static final String[] RESOURCE_BUNDLE_NAMES = new String[] { "messages",
            "messagesFirewall" };

    /** 
     * UpdateControls-Methods
     **/

    public void initWizardImpl(
            org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard1Container container,
            org.sblim.wbemsmt.firewall.wizard.NewManagedPortWizardContainer1 wizardContainer,
            String currentPagename) throws WbemsmtException;
}