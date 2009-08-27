/**
 * FirewallCimAdapterRevertIf.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE
 * TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS
 * FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the
 * Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceRevert.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.firewall.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.*;

import org.sblim.wbemsmt.exception.WbemsmtException;

/*
 * * This is the interface containing only the Revert-Methods for the delegate
 */

public interface FirewallCimAdapterRevertIf extends RevertDelegatee {

    /** 
     * Revert-Methods
     **/
    public org.sblim.wbemsmt.bl.messages.MessageList revertImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FInterfaceContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList revertImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList revertImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortSummaryContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList revertImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList revertImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesListContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList revertImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesListContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList revertImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FSupportedServicesContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList revertImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FSupportedServicesWithInterfacesContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList revertImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FirewallInterfacesContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList revertImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FirewallManagedPortContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList revertImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FirewallServiceConfContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList revertImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FirewallServiceOptionsContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList revertImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FirewallSupportedServicesContainer container)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList revertImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FInterfaceContainer container,
            org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallInterface fco) throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList revertImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortContainer container,
            org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallManagedPorts fco)
            throws WbemsmtException;

    public org.sblim.wbemsmt.bl.messages.MessageList revertImpl(
            org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainer container,
            org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallInterface fco) throws WbemsmtException;

}