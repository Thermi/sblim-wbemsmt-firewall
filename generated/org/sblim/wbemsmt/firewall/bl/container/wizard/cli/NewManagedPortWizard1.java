/**
 * NewManagedPortWizard1.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE TER
 * MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/cmd/wizardClass.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.firewall.bl.container.wizard.cli;

import java.util.*;
import java.util.logging.Logger;

import org.sblim.wbemsmt.bl.adapter.DataContainer;

import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.wizard.adapter.IPageWizardAdapter;
import org.sblim.wbemsmt.tools.wizard.cli.*;
import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;
import org.sblim.wbemsmt.exception.WbemsmtException;

public class NewManagedPortWizard1 extends CliWizardBase implements IPageWizardAdapter {

    static Logger logger = Logger.getLogger(NewManagedPortWizard1.class.getName());
    private org.sblim.wbemsmt.firewall.wizard.NewManagedPortWizardContainer1 container = null;

    public NewManagedPortWizard1(
            final org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter adapter) {
        super(adapter, ResourceBundleManager.getResourceBundle(new String[] { "messages",
                "messagesFirewall" }, Locale.getDefault()));
        this.container = new org.sblim.wbemsmt.firewall.wizard.NewManagedPortWizardContainer1(
                adapter,
                new org.sblim.wbemsmt.firewall.wizard.NewManagedPortWizardContainer1Panels() {
                    public DataContainer getNewManagedPortpanel1() throws WbemsmtException {
                        DataContainer dc = new org.sblim.wbemsmt.firewall.bl.container.wizard.cli.NewManagedPortWizard1ContainerImpl(
                                adapter);
                        return dc;
                    }

                    public DataContainer getNewManagedPortpanel2() throws WbemsmtException {
                        DataContainer dc = new org.sblim.wbemsmt.firewall.bl.container.wizard.cli.NewManagedPortWizard2ContainerImpl(
                                adapter);
                        return dc;
                    }

                    public DataContainer getNewManagedPortpanel3() throws WbemsmtException {
                        DataContainer dc = new org.sblim.wbemsmt.firewall.bl.container.wizard.cli.NewManagedPortWizard3ContainerImpl(
                                adapter);
                        return dc;
                    }
                });
        super.initialize();
        try {
            super.initWizard((IWizardContainer) container, this);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return;
        }
        logger.fine("Wizard initialized");
    }

    public void cleanUPPage(String panelName) {
        //cleanup is done in the adapter
    }

    public IWizardContainer getWizardContainer() {
        return container;
    }
}