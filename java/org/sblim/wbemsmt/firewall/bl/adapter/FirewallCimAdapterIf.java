/**
 * FirewallCimAdapterIf.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS
 * OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterface.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.firewall.bl.adapter;

/*
 * * This is the interface containing all Methods
 */

public interface FirewallCimAdapterIf extends FirewallCimAdapterCountIf,
        FirewallCimAdapterCreateIf, FirewallCimAdapterDeleteIf,
        FirewallCimAdapterInstallValidatorsIf, FirewallCimAdapterSaveIf,
        FirewallCimAdapterRevertIf, FirewallCimAdapterUpdateControlsIf,
        FirewallCimAdapterUpdateModelIf, FirewallCimAdapterInitWizardIf,
        FirewallCimAdapterInitContainerIf {

    public static final String[] RESOURCE_BUNDLE_NAMES = new String[] { "messages",
            "messagesFirewall" };

}