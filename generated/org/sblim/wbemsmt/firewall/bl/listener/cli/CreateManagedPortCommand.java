/**
 * CreateManagedPortCommand.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE
 * TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS
 * FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the
 * Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/cmd/createCommand.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Class for creating objects generated Class
 */

package org.sblim.wbemsmt.firewall.bl.listener.cli;

import org.apache.commons.cli.*;
import org.apache.commons.lang.ClassUtils;
import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.bl.messages.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.cli.*;
import org.sblim.wbemsmt.tools.wizard.cli.*;

public class CreateManagedPortCommand extends CimCommand implements ContainerUpdater {

    //All Options that are local and defined for this command
    /**
     *  --interfacesEnabled
     */
    public static final OptionDefinition KEY_interfacesEnabled = new OptionDefinition(null,
            "interfacesEnabled", null, "CreateManagedPortCommand.interfacesEnabled.argValue",
            false, false, "CreateManagedPortCommand.interfacesEnabled.argDescription");
    /**
     * required,  --StartPort
     */
    public static final OptionDefinition KEY_StartPort = new OptionDefinition(null, "StartPort",
            null, "NewManagedPortWizard1Container.StartPort.argValue", true, false,
            "NewManagedPortWizard1Container.StartPort.argDescription");
    /**
     *  --EndPort
     */
    public static final OptionDefinition KEY_EndPort = new OptionDefinition(null, "EndPort", null,
            "NewManagedPortWizard1Container.EndPort.argValue", false, false,
            "NewManagedPortWizard1Container.EndPort.argDescription");
    /**
     * required,  --Protocol
     */
    public static final OptionDefinition KEY_Protocol = new OptionDefinition(null, "Protocol",
            null, "NewManagedPortWizard1Container.Protocol.argValue", true, false,
            "NewManagedPortWizard1Container.Protocol.argDescription");

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

    private static final OptionDefinition[] LOCAL_OPTIONS = new OptionDefinition[] {
            KEY_interfacesEnabled, KEY_StartPort, KEY_EndPort, KEY_Protocol, };

    private static final OptionDefinition[] GLOBAL_TASK_OPTIONS = new OptionDefinition[] {};

    private static final OptionDefinition[] GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS = new OptionDefinition[] {
            KEY_GLOBAL_httpProtocolType, KEY_GLOBAL_hostname, KEY_GLOBAL_port,
            KEY_GLOBAL_namespace, KEY_GLOBAL_user, KEY_GLOBAL_password, KEY_GLOBAL_publickeyfile,
            KEY_GLOBAL_privatekeyfile, };

    private static final OptionDefinition[] GLOBAL_WBEMSMT_COMMON_OPTIONS = new OptionDefinition[] {
            KEY_GLOBAL_locale, KEY_GLOBAL_help, KEY_GLOBAL_QUESTION_MARK_, };

    CommandLine cmd = null;
    AbstractBaseCimAdapter adapter = null;

    public CreateManagedPortCommand(java.util.Locale locale) {
        super("CreateManagedPortCommand", new String[] { "messages", "messagesFirewall" }, locale);
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

            values.getOut().println("\n" + bundle.getString("NewManagedPortwizard.create.start"));

            CliDataLoader loader = new CreateManagedPortCommandLoader();
            loader.load(bundle, adapter, commandValues);

            org.sblim.wbemsmt.firewall.bl.container.wizard.cli.NewManagedPortWizard1 wizard = new org.sblim.wbemsmt.firewall.bl.container.wizard.cli.NewManagedPortWizard1(
                    (org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter) adapter);
            if (!wizard.canBeExecuted()) {
                traceErrors("error.while.execution", wizard.getMessageList());
                return;
            }
            wizard.startWizard();

            while (!wizard.getContainer().isLast(wizard.getContainer().getCurrentPageName())) {
                BaseDataContainer dataContainer = wizard.getCurrentPanel();
                if (true == false)
                    ;
                else if (dataContainer instanceof org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard1Container)
                    setCommandLineValues(
                            cmd,
                            adapter,
                            (org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard1Container) dataContainer);
                else if (dataContainer instanceof org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard2Container)
                    setCommandLineValues(
                            cmd,
                            adapter,
                            (org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard2Container) dataContainer);
                else if (dataContainer instanceof org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard3Container)
                    setCommandLineValues(
                            cmd,
                            adapter,
                            (org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard3Container) dataContainer);
                else {
                    logger.severe(dataContainer.getClass().getName()
                            + " cannot be handled from command class " + this.getClass().getName());
                    throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, bundle
                            .getString("internal.error"));
                }

                MessageList result = MessageList.init(dataContainer);
                if (result.hasErrors()) {
                    traceErrors(result);
                    return;
                }
                else {
                    Message caption = Message.create(ErrCodes.MSG_ADDITIONAL_MESSAGES,
                            Message.ERROR, bundle, "additional.messages");
                    traceMessages(caption, result);
                    result.clear();
                }

                wizard.next(this);
                result = wizard.getCurrentPanel().getMessagesList();

                if (result != null) {
                    if (result.hasErrors()) {
                        Message caption = Message.create(ErrCodes.MSG_VALIDATION_ERROR,
                                Message.ERROR, bundle, "validation.error");
                        traceMessages(caption, result);
                        return;
                    }
                    else {
                        Message caption = Message.create(ErrCodes.MSG_ADDITIONAL_MESSAGES,
                                Message.ERROR, bundle, "additional.messages");
                        traceMessages(caption, result);
                        dataContainer.getMessagesList().clear();
                    }
                }
            }

            BaseDataContainer lastPanel = wizard.getCurrentPanel();

            MessageList result = wizard.finish();
            String wizardName = ClassUtils.getShortClassName(wizard.getClass());
            if (result != null && result.hasErrors()) {
                result.addMessage(new Message(ErrCodes.MSG_CREATE_FAILED, Message.ERROR, bundle
                        .getString(wizardName + ".create.failed")));
            }
            else {
                result.addMessage(new Message(ErrCodes.MSG_CREATE_SUCCESS, Message.SUCCESS, bundle
                        .getString(wizardName + ".create.success")));
            }
            traceErrors(result);

            if (true == false)
                ;
            else if (lastPanel instanceof org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard3Container)
                ((CreateManagedPortCommandLoader) loader)
                        .loadTracingObject(
                                bundle,
                                adapter,
                                (org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard3Container) lastPanel);
            else {
                logger.severe("Cannot loadTracingObject for " + lastPanel.getClass().getName());
                throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, bundle
                        .getString("internal.error"));
            }

            org.sblim.wbemsmt.firewall.bl.container.wizard.cli.NewManagedPortWizard1ContainerImpl dc = new org.sblim.wbemsmt.firewall.bl.container.wizard.cli.NewManagedPortWizard1ContainerImpl(
                    adapter);

            adapter.updateControls(dc);
            values.getOut().println("\n" + bundle.getString("createdObject") + ":\n");
            dc.trace(values.getOut());

            //values.getOut().println("\n" + bundle.getString("NewManagedPortwizard.create.success"));

        }
        catch (Exception e) {
            super.handleException(e, values.getArgs(), values.getOptions(), KEY_GLOBAL_password);
        }
        finally {
            if (adapter != null)
                adapter.cleanup();
        }
    }

    public void prepareForUpdateControls(DataContainer dataContainer) throws WbemsmtException {
        if (true == false)
            ;
        else if (dataContainer instanceof org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard1Container)
            updateContainerChilds(
                    cmd,
                    adapter,
                    (org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard1Container) dataContainer);
        else if (dataContainer instanceof org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard2Container)
            updateContainerChilds(
                    cmd,
                    adapter,
                    (org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard2Container) dataContainer);
        else if (dataContainer instanceof org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard3Container)
            updateContainerChilds(
                    cmd,
                    adapter,
                    (org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard3Container) dataContainer);
        else {

            logger.severe("Cannot setValues for Container " + dataContainer.getClass().getName());
            throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS,
                    "Cannot setValues for Container " + dataContainer.getClass().getName());
        }
    }

    private void updateContainerChilds(CommandLine cmd, AbstractBaseCimAdapter adapter,
            org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard1Container dc)
            throws WbemsmtException {

        try {
            //update the child-containers

        }
        catch (Exception e) {
            throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS, bundle
                    .getString("internal.error"), e);
        }

    }

    private void setCommandLineValues(CommandLine cmd, AbstractBaseCimAdapter adapter,
            org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard1Container dc)
            throws WbemsmtException {
        //set the values
        setValue(cmd, dc.get_usr_StartPort(), KEY_StartPort);
        setValue(cmd, dc.get_usr_EndPort(), KEY_EndPort);
        setMultiValue(adapter.getBundle(), cmd, dc.get_usr_Protocol(), KEY_Protocol);

        //The Buttons

    }

    private void updateContainerChilds(CommandLine cmd, AbstractBaseCimAdapter adapter,
            org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard2Container dc)
            throws WbemsmtException {

        try {
            //update the child-containers

            int count = 0;

            count = adapter
                    .count(
                            "interfacesListForPort",
                            org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForServicesContainer.class,
                            dc);
            dc.getInterfacesListForPort().clear();
            for (int i = 0; i < count; i++) {
                org.sblim.wbemsmt.firewall.bl.container.edit.cli.FInterfacesForServicesContainerImpl child = new org.sblim.wbemsmt.firewall.bl.container.edit.cli.FInterfacesForServicesContainerImpl(
                        adapter);
                dc.getInterfacesListForPort().add(child);
            }
        }
        catch (Exception e) {
            throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS, bundle
                    .getString("internal.error"), e);
        }

    }

    private void setCommandLineValues(CommandLine cmd, AbstractBaseCimAdapter adapter,
            org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard2Container dc)
            throws WbemsmtException {
        //set the values

        //The Buttons

    }

    private void updateContainerChilds(CommandLine cmd, AbstractBaseCimAdapter adapter,
            org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard3Container dc)
            throws WbemsmtException {

        try {
            //update the child-containers

            int count = 0;

            count = adapter
                    .count(
                            "interfacesListForPortSummary",
                            org.sblim.wbemsmt.firewall.bl.container.edit.FInterfacesForPortSummaryContainer.class,
                            dc);
            dc.getInterfacesListForPortSummary().clear();
            for (int i = 0; i < count; i++) {
                org.sblim.wbemsmt.firewall.bl.container.edit.cli.FInterfacesForPortSummaryContainerImpl child = new org.sblim.wbemsmt.firewall.bl.container.edit.cli.FInterfacesForPortSummaryContainerImpl(
                        adapter);
                dc.getInterfacesListForPortSummary().add(child);
            }
        }
        catch (Exception e) {
            throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS, bundle
                    .getString("internal.error"), e);
        }

    }

    private void setCommandLineValues(CommandLine cmd, AbstractBaseCimAdapter adapter,
            org.sblim.wbemsmt.firewall.bl.container.wizard.NewManagedPortWizard3Container dc)
            throws WbemsmtException {
        //set the values

        //The Buttons

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