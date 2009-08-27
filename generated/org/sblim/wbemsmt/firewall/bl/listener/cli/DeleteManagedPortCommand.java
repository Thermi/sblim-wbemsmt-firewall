/**
 * DeleteManagedPortCommand.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE
 * TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS
 * FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the
 * Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/cmd/deleteCommand.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Class for deleteting objects generated Class
 */

package org.sblim.wbemsmt.firewall.bl.listener.cli;

import org.apache.commons.cli.*;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimAdapterFactory;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.cli.*;

public class DeleteManagedPortCommand extends CimCommand {

    //All Options that are local and defined for this command
    /**
     * required, used for selection:  --instanceID
     */
    public static final OptionDefinition KEY_instanceID = new OptionDefinition(null, "instanceID",
            null, "DeleteManagedPortCommand.instanceID.argValue", true, false,
            "DeleteManagedPortCommand.instanceID.argDescription");

    //All Options that are global and task-related

    // Global Communication Options
    /**
     * used for selection:  --httpProtocolType, default: http
     */
    public static final OptionDefinition KEY_GLOBAL_httpProtocolType = new OptionDefinition(null,
            "httpProtocolType", "http", "httpProtocolType.argValue", false, false,
            "httpProtocolType.argDescription");
    /**
     * required, used for selection:  --hostname
     */
    public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition(null,
            "hostname", null, "hostname.argValue", true, false, "hostname.argDescription");
    /**
     * used for selection:  --port, default: 5988
     */
    public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition(null, "port",
            "5988", "port.argValue", false, false, "port.argDescription");
    /**
     * used for selection:  --namespace, default: /root/cimv2
     */
    public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition(null,
            "namespace", "/root/cimv2", "namespace.argValue", false, false,
            "namespace.argDescription");
    /**
     * used for selection:  --user, default: none
     */
    public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition(null, "user",
            "none", "user.argValue", false, false, "user.argDescription");
    /**
     * used for selection:  --password, default: none
     */
    public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition(null,
            "password", "none", "password.argValue", false, false, "password.argDescription");
    /**
     * used for selection:  --publickeyfile, default: none
     */
    public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition(null,
            "publickeyfile", "none", "publickeyfile.argValue", false, false,
            "publickeyfile.argDescription");
    /**
     * used for selection:  --privatekeyfile, default: none
     */
    public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition(null,
            "privatekeyfile", "none", "privatekeyfile.argValue", false, false,
            "privatekeyfile.argDescription");

    // Global Common Options
    /**
     *  -L --locale, default: none
     */
    public static final OptionDefinition KEY_GLOBAL_locale = new OptionDefinition("L", "locale",
            "none", "locale.argValue", false, false, "locale.argDescription");
    /**
     *  -h --help, default: none
     */
    public static final OptionDefinition KEY_GLOBAL_help = new OptionDefinition("h", "help",
            "none", "help.argValue", false, false, "help.argDescription");
    /**
     *  -?, default: none
     */
    public static final OptionDefinition KEY_GLOBAL_QUESTION_MARK_ = new OptionDefinition("?",
            null, "none", "?.argValue", false, false, "?.argDescription");

    private static final OptionDefinition[] LOCAL_OPTIONS = new OptionDefinition[] { KEY_instanceID, };

    private static final OptionDefinition[] GLOBAL_TASK_OPTIONS = new OptionDefinition[] {};

    private static final OptionDefinition[] GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS = new OptionDefinition[] {
            KEY_GLOBAL_httpProtocolType, KEY_GLOBAL_hostname, KEY_GLOBAL_port,
            KEY_GLOBAL_namespace, KEY_GLOBAL_user, KEY_GLOBAL_password, KEY_GLOBAL_publickeyfile,
            KEY_GLOBAL_privatekeyfile, };

    private static final OptionDefinition[] GLOBAL_WBEMSMT_COMMON_OPTIONS = new OptionDefinition[] {
            KEY_GLOBAL_locale, KEY_GLOBAL_help, KEY_GLOBAL_QUESTION_MARK_, };

    CommandLine cmd = null;
    AbstractBaseCimAdapter adapter = null;

    public DeleteManagedPortCommand(java.util.Locale locale) {
        super("DeleteManagedPortCommand", new String[] { "messages", "messagesFirewall" }, locale);
    }

    public void execute(CimCommandValues values) throws WbemsmtException {

        //do the real processing
        try {

            commandValues = values;
            cmd = values.getCommandLine();

            Options options = values.getOptions();

            //first handle the help options and then the parseException
            //if the user wants help parsing the args will fail (due to missing required args)
            //and so the helpOptions should be handled first

            if (hasOption(values.getArgs(), "-" + KEY_GLOBAL_QUESTION_MARK_.getShortKey())
                    || hasOption(values.getArgs(), "-" + KEY_GLOBAL_help.getShortKey())) {
                showUsage(values.getOut(), options);
                return;
            }
            else if (hasOption(values.getArgs(), "--" + KEY_GLOBAL_help.getLongKey())) {
                //TODO add extendedHelp by loading a manpage or sth else
                showUsage(values.getOut(), options);
                return;
            }

            else if (values.getParseException() != null) {
                handleParseException(values, KEY_GLOBAL_password);
                return;
            }
            adapter = (org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter) CimAdapterFactory
                    .getInstance().getAdapter(
                            org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter.class, this);
            adapter.setBundle(bundle);
            adapter.setCimClient(values.getCimClient());

            adapter.loadInitial(adapter.getCimClient());

            values.getOut().println(
                    "\n"
                            + bundle.getString("deleting", new Object[] { bundle
                                    .getString("FirewallManagedPortContainer.caption") }));

            CliDataLoader loader = new DeleteManagedPortCommandLoader();
            loader.load(bundle, adapter, commandValues);

            org.sblim.wbemsmt.firewall.bl.container.edit.cli.FirewallManagedPortContainerImpl dc = new org.sblim.wbemsmt.firewall.bl.container.edit.cli.FirewallManagedPortContainerImpl(
                    adapter);

            int count = 0;

            count = adapter.count("interfacesForPort",
                    org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortContainer.class,
                    dc);
            dc.getInterfacesForPort().clear();
            for (int i = 0; i < count; i++) {
                org.sblim.wbemsmt.firewall.bl.container.edit.cli.FInterfacesForPortContainerImpl child = new org.sblim.wbemsmt.firewall.bl.container.edit.cli.FInterfacesForPortContainerImpl(
                        adapter);
                dc.getInterfacesForPort().add(child);
            }

            adapter.updateControls(dc);

            dc.trace(values.getOut());

            if (getConfirmation()) {
                adapter.delete();
                values.getOut().println(
                        "\n"
                                + bundle.getString("deleted", new Object[] { bundle
                                        .getString("FirewallManagedPortContainer.caption") }));
            }
            else {
                values.getOut().println(
                        "\n"
                                + bundle.getString("not.deleted", new Object[] { bundle
                                        .getString("FirewallManagedPortContainer.caption") }));
            }

        }
        catch (Exception e) {
            super.handleException(e, values.getArgs(), values.getOptions(), KEY_GLOBAL_password);
        }
        finally {
            if (adapter != null)
                adapter.cleanup();
        }
    }

    protected LoginOptionValues getLoginOptions() {
        return new LoginOptionValues(KEY_GLOBAL_hostname, KEY_GLOBAL_user, KEY_GLOBAL_password);
    }

    protected CimClientOptionValues getCimClientOptions() {

        return new CimClientOptionValues(KEY_GLOBAL_httpProtocolType, KEY_GLOBAL_hostname,
                KEY_GLOBAL_port, KEY_GLOBAL_namespace, KEY_GLOBAL_user, KEY_GLOBAL_password,
                KEY_GLOBAL_publickeyfile, KEY_GLOBAL_privatekeyfile);
    }

    public Options getOptions() throws WbemsmtException {
        Options options = super.createOptions(LOCAL_OPTIONS, bundle);
        super.createOptions(options, GLOBAL_TASK_OPTIONS, bundle);
        super.createOptions(options, GLOBAL_WBEMSMT_COMMON_OPTIONS, bundle);
        super.createOptions(options, GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS, bundle);
        return options;
    }

    public Options getLocalOptions() throws WbemsmtException {
        Options options = super.createOptions(LOCAL_OPTIONS, bundle);
        return options;
    }

    public Options getGlobalWbemsmtCommonOptions() throws WbemsmtException {
        Options options = super.createOptions(GLOBAL_WBEMSMT_COMMON_OPTIONS, bundle);
        return options;
    }

    public Options getGlobalWbemsmtCommunicationOptions() throws WbemsmtException {
        Options options = super.createOptions(GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS, bundle);
        return options;
    }

    public Options getGlobalTaskOptions() throws WbemsmtException {
        Options options = super.createOptions(GLOBAL_TASK_OPTIONS, bundle);
        return options;
    }
}