/**
 * Commands.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS OF THE
 * ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/cmd/commands.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Class containing the mapping between Commands
 *            and the Commandlet generated Class
 */

package org.sblim.wbemsmt.firewall.cli;

public class Commands extends org.sblim.wbemsmt.tools.cli.Commands {

    public Commands() {

        addCommand("DeleteManagedPortCommand",
                org.sblim.wbemsmt.firewall.bl.listener.cli.DeleteManagedPortCommand.class);
        addCommand("CreateManagedPortCommand",
                org.sblim.wbemsmt.firewall.bl.listener.cli.CreateManagedPortCommand.class);
        addCommand("EditServiceConfCommand",
                org.sblim.wbemsmt.firewall.bl.listener.cli.EditServiceConfCommand.class);
        addCommand("EditServiceOptionsCommand",
                org.sblim.wbemsmt.firewall.bl.listener.cli.EditServiceOptionsCommand.class);
        addCommand("EditManagedPortCommand",
                org.sblim.wbemsmt.firewall.bl.listener.cli.EditManagedPortCommand.class);
        addCommand("EditInterfacesCommand1",
                org.sblim.wbemsmt.firewall.bl.listener.cli.EditInterfacesCommand1.class);
        addCommand("EditSupportedServicesCommand1",
                org.sblim.wbemsmt.firewall.bl.listener.cli.EditSupportedServicesCommand1.class);
        addCommand("EditInterfacesCommand",
                org.sblim.wbemsmt.firewall.bl.listener.cli.EditInterfacesCommand.class);
        addCommand("EditSupportedServicesCommand",
                org.sblim.wbemsmt.firewall.bl.listener.cli.EditSupportedServicesCommand.class);
    }
}