/**
 * FirewallCimAdapterInitContainerIf.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED
 * UNDER THE TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR
 * DISTRIBUTION OF THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a
 * current copy of the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceInitContainer.vm Contributors:
 *            Prashanth Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.firewall.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.*;

import org.sblim.wbemsmt.exception.WbemsmtException;

/*
 * * This is the interface containing only the UpdateControls-Methods for the delegate
 */

public interface FirewallCimAdapterInitContainerIf extends InitContainerDelegatee {

    /** 
     * InitContainer-Methods
     **/
    public void initContainerImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FInterfaceContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortSummaryContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesListContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesListContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FSupportedServicesContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FSupportedServicesWithInterfacesContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FirewallInterfacesContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FirewallManagedPortContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FirewallServiceConfContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FirewallServiceOptionsContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FirewallSupportedServicesContainer container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard1Container container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard2Container container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard3Container container)
            throws WbemsmtException;

    public void initContainerImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.WelcomeContainer container)
            throws WbemsmtException;
}