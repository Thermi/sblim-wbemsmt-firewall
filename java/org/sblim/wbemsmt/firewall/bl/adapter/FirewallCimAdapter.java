/** 
 * FirewallCimAdapter.java
 *
* 
 * © Copyright IBM Corp.  2009,2008, 
 * 
 * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE 
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE 
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. 
 * 
 * You can obtain a current copy of the Eclipse Public License from 
 * http://www.opensource.org/licenses/eclipse-1.0.php 
 * 
 * @author: Prashanth Karnam <prkarnam@in.ibm.com>
 *
 * Contributors: 
 * 
 * Description: 
 * 
 */

package org.sblim.wbemsmt.firewall.bl.adapter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

import javax.cim.CIMInstance;
import javax.cim.CIMObjectPath;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.adapter.CountDelegatee;
import org.sblim.wbemsmt.bl.adapter.CreateDelegatee;
import org.sblim.wbemsmt.bl.adapter.DeleteDelegatee;
import org.sblim.wbemsmt.bl.adapter.InitContainerDelegatee;
import org.sblim.wbemsmt.bl.adapter.InitWizardDelegatee;
import org.sblim.wbemsmt.bl.adapter.InstallValidatorsDelegatee;
import org.sblim.wbemsmt.bl.adapter.RevertDelegatee;
import org.sblim.wbemsmt.bl.adapter.SaveDelegatee;
import org.sblim.wbemsmt.bl.adapter.SelectionHierarchy;
import org.sblim.wbemsmt.bl.adapter.UpdateControlsDelegatee;
import org.sblim.wbemsmt.bl.adapter.UpdateModelDelegatee;
import org.sblim.wbemsmt.bl.fco.FcoHelper;
import org.sblim.wbemsmt.bl.tree.ICIMInstanceNode;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.exception.ErrorCode;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallInterface;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallInterfaceHelper;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallManagedPorts;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallManagedPortsHelper;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallService;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallServiceConfiguration;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallServiceHelper;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallTrustedServices;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallTrustedServicesHelper;
import org.sblim.wbemsmt.firewall.wrapper.object.FirewallInterfacesObject;
import org.sblim.wbemsmt.firewall.wrapper.object.FirewallManagedPortObject;
import org.sblim.wbemsmt.firewall.wrapper.object.FirewallServiceConfigurationObject;
import org.sblim.wbemsmt.firewall.wrapper.object.FirewallServiceObject;
import org.sblim.wbemsmt.firewall.wrapper.object.FirewallSupportedServicesObject;
import org.sblim.wbemsmt.firewall.wrapper.objectlist.FirewallInterfacesObjectList;
import org.sblim.wbemsmt.firewall.wrapper.objectlist.FirewallManagedPortObjectList;
import org.sblim.wbemsmt.firewall.wrapper.objectlist.FirewallServiceObjectList;
import org.sblim.wbemsmt.firewall.wrapper.objectlist.FirewallSupportedServicesObjectList;
import org.sblim.wbemsmt.firewall.wrapper.wizard.NewFirewallManagedPortWizard;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.util.StringTokenizer;

public class FirewallCimAdapter extends AbstractBaseCimAdapter {

	private static final String[] BUNDLES = { "messages", "messagesFirewall" };

	// private static Set booleanOps = new HashSet();

	private static boolean DummyMode = false;
	
	private static HashMap<String,Integer> ProtocolVals; 
	
	Logger logger = Logger.getLogger ( this.getClass ().getName () );

	FirewallSelectionHeirarchy selectionHierarchy = null;

	private CountDelegatee countDelegatee;

	private CreateDelegatee createDelegatee;

	private DeleteDelegatee deleteDelegatee;

	private InitContainerDelegatee initContainerDelegatee;

	private InitWizardDelegatee initWizardDelegatee;

	private InstallValidatorsDelegatee installValidatorsDelegatee;

	private RevertDelegatee revertDelegatee;

	private SaveDelegatee saveDelegatee;

	private UpdateControlsDelegatee updateControlsDelegatee;

	private UpdateModelDelegatee updateModelDelegatee;

	private FirewallServiceObject FirewallServiceObj;

	private FirewallServiceObjectList Firewallserviceobjlist;

	private FirewallServiceConfigurationObject FirewallServiceConfigurationObj;

	private FirewallInterfacesObject FirewallInterfacesObj;

	private FirewallInterfacesObjectList FirewallInterfacesobjlist;

	private FirewallManagedPortObject FirewallManagedPortObj;

	private FirewallManagedPortObjectList FirewallManagedPortobjlist;

	private FirewallSupportedServicesObject FirewallSupportedServicesObj;

	private FirewallSupportedServicesObjectList FirewallSupportedServicesobjlist;

	private NewFirewallManagedPortWizard newportwizard;

	private HashMap<String, String> SupportedServicesInterfacesCLIData;
	
	private HashMap<String, String> ManagedPortInterfacesCLIData;
	
	public static class FirewallSelectionHeirarchy extends SelectionHierarchy {

		private final FirewallCimAdapter adapter;

		public FirewallSelectionHeirarchy ( FirewallCimAdapter adapter ) {
			this.adapter = adapter;
		}

		public void addService ( FirewallServiceObject obj ) {
			clear ();
			adapter.setFirewallServiceConfigurationObj ( null );
			push ( obj.getFco () );
		}

		public void addServiceConfiguration ( FirewallServiceConfigurationObject obj ) {
			// cleanup ( 1 );
			adapter.setFirewallServiceConfigurationObj ( obj );
			push ( obj.getFco () );
		}

		public void addManagedPort ( FirewallManagedPortObject obj ) {
			// cleanup ( 1 );
			adapter.setFirewallManagedPortObj ( obj );
			 push ( obj.getFco () );
		}

		public void addSupportedService ( FirewallSupportedServicesObject obj ) {
			// cleanup ( 1 );
			adapter.setFirewallSupportedServicesObj (  obj );
			 push ( obj.getFco () );
		}

		public void addInterfaces ( FirewallInterfacesObjectList obj ) {
			// cleanup ( 1 );
			adapter.setFirewallInterfacesobjlist ( obj );
//			 push ( obj.getFco () );
		}

		private void cleanup ( int currentLevel ) {
			while (size () > currentLevel) {
				pop ();
			}
		}

	}

	public FirewallCimAdapter () {
		super ();
	}

	public FirewallCimAdapter ( Locale locale ) {
		selectionHierarchy = new FirewallSelectionHeirarchy ( this );
		init ( ResourceBundleManager.getResourceBundle ( BUNDLES, locale ), selectionHierarchy, new FcoHelper () );

		updateControlsDelegatee = new FirewallCimAdapterUpdateControlsDelegatee ( this );
		saveDelegatee = new FirewallCimAdapterSaveDelegatee ( this );
		deleteDelegatee = new FirewallCimAdpaterDeleteDelegatee ( this );
		createDelegatee = new FirewallCimAdapterCreateDelegatee ( this );
		installValidatorsDelegatee = new FirewallCimAdapterInstallValidatorsDelegatee ( this );
		initWizardDelegatee = new FirewallCimAdapterInitWizardDelegatee ( this );
		initContainerDelegatee = new FirewallCimAdapterInitContainerDelegatee ( this );
		updateModelDelegatee = new FirewallCimAdapterUpdateModelDelegatee ( this );
		countDelegatee = new FirewallCimAdpaterCountDelegatee (this);
		revertDelegatee = new FirewallCimAdapterRevertDelegatee (this);
		 newportwizard = new NewFirewallManagedPortWizard(this);
		 ProtocolVals = new HashMap<String, Integer>();		 
		 ProtocolVals.put("udp",new Integer(0));
		 ProtocolVals.put("tcp",new Integer(1));
		 
		 SupportedServicesInterfacesCLIData = new HashMap<String, String>();
		 ManagedPortInterfacesCLIData = new HashMap<String, String>();
	}

	public CimObjectKey getKeyByTreeNode ( ITaskLauncherTreeNode treeNode ) throws WbemsmtException {

		if (treeNode instanceof ICIMInstanceNode) {
			ICIMInstanceNode node = (ICIMInstanceNode) treeNode;
			if (node.getCimInstance ().getClassName ().equals ( Linux_FirewallService.CIM_CLASS_NAME )) {
				CimObjectKey key = new CimObjectKey ( node );
				return key;
			}
			if (node.getCimInstance ().getClassName ().equals ( Linux_FirewallManagedPorts.CIM_CLASS_NAME)) {
				CimObjectKey key = new CimObjectKey ( node );
				return key;
			}

			if (node.getCimInstance ().getClassName ().equals ( Linux_FirewallTrustedServices.CIM_CLASS_NAME )) {
				CimObjectKey key = new CimObjectKey ( node );
				return key;
			}

		}

		// else if (treeNode instanceof ICIMClassNode) {
		// ICIMClassNode classNode = (ICIMClassNode) treeNode;
		// if (classNode.getName ().equals ( "options" ) || classNode.getName
		// ().equals ( "firewallOptions" )
		// || classNode.getName ().equals ( "Ports" ))
		// return new CimObjectKey ( new CIMObjectPath(classNode.getName ()) );
		//
		// if (classNode.getName ().equals ("SupportedServices" ) ){
		// ICIMInstanceNode parent = (ICIMInstanceNode)
		// classNode.getParent().getParent().getParent();
		// return new CimObjectKey(parent.getCimInstance().getObjectPath());
		// }
		//
		// if (classNode.getName ().equals ("Interfaces" ) ){
		// ICIMInstanceNode parent = (ICIMInstanceNode)
		// classNode.getParent().getParent();
		// return new CimObjectKey(parent.getCimInstance().getO bjectPath());
		// }
		// }

		if (treeNode.getName ().equals ( "options" )) {
			return new CimObjectKey ( new CIMObjectPath ( "options" ) );
		}

		if (treeNode.getName ().equals ( "firewalloptions" )) {
			return new CimObjectKey ( new CIMObjectPath ( "firewalloptions" ) );
		}

		if (treeNode.getName ().equals ( "Ports" )) {
			ICIMInstanceNode node = (ICIMInstanceNode)  treeNode.getParent ().getParent ().getParent ();
			CimObjectKey key = new CimObjectKey ( node );
			return  key;
//			return new CimObjectKey ( new CIMObjectPath ( "Ports" ) );
		}

//		if (treeNode.getName ().equals ( "supportedServices" )) {
//			ICIMInstanceNode node = (ICIMInstanceNode) treeNode.getParent ().getParent ().getParent ();
//			CimObjectKey key = new CimObjectKey ( node );
//			return  key;
//		}

		if (treeNode.getName ().equals ( "Interfaces" )) {
			ICIMInstanceNode node = (ICIMInstanceNode)  treeNode.getParent ().getParent ();
			CimObjectKey key = new CimObjectKey ( node );
			return  key;
		}

		return null;
	}

	public String[] getResourceBundleNames () {
		return BUNDLES;
	}

	public void load ( WBEMClient cimClient ) throws WbemsmtException {

		if (loaded == true)
			return;
		this.cimClient = rootNode.getCimClient ();

		// this.firewallserviceobjlist = new DhcpServiceObjectList ();

		setFirewallServiceObj ( getFirewallServiceObj () );
		// dhcpserviceobjlist.addDhcpServiceObject ( getDhcp );

		getFirewallServiceObj ().setServiceconf ( getFirewallServiceConfigurationObj () );
		setFirewallServiceConfigurationObj ( getFirewallServiceConfigurationObj () );

	}

	public void load ( ITaskLauncherTreeNode rootNode ) throws WbemsmtException {

		if (loaded == true)
			return;
		this.cimClient = rootNode.getCimClient ();

		this.rootNode = rootNode;
		
		// this.firewallserviceobjlist = new DhcpServiceObjectList ();

		setFirewallServiceObj ( getFirewallServiceObj () );
		// dhcpserviceobjlist.addDhcpServiceObject ( getDhcp );

		getFirewallServiceObj ().setServiceconf ( getFirewallServiceConfigurationObj () );
		setFirewallServiceConfigurationObj ( getFirewallServiceConfigurationObj () );

	}

	public void loadInitial ( WBEMClient cimClient ) throws WbemsmtException {

	}

	protected void reLoad ( WBEMClient cimClient ) throws WbemsmtException {
	}

	protected void reLoad ( ITaskLauncherTreeNode rootNode ) throws WbemsmtException {
		loaded = false;
		load ( rootNode );
	}

	public CountDelegatee getCountDelegatee () {
		return countDelegatee;
	}

	public CreateDelegatee getCreateDelegatee () {
		return createDelegatee;
	}

	public DeleteDelegatee getDeleteDelegatee () {
		return deleteDelegatee;
	}

	public InitContainerDelegatee getInitContainerDelegatee () {
		return initContainerDelegatee;
	}

	public InitWizardDelegatee getInitWizardDelegatee () {
		return initWizardDelegatee;
	}

	public InstallValidatorsDelegatee getInstallValidatorsDelegatee () {
		return installValidatorsDelegatee;
	}

	public RevertDelegatee getRevertDelegatee () {
		return revertDelegatee;
	}

	public SaveDelegatee getSaveDelegatee () {
		return saveDelegatee;
	}

	public UpdateControlsDelegatee getUpdateControlsDelegatee () {
		return updateControlsDelegatee;
	}

	public UpdateModelDelegatee getUpdateModelDelegatee () {
		return updateModelDelegatee;
	}

	public boolean select_0_Linux_FirewallService ( CimObjectKey key ) throws WbemsmtException {

		FirewallServiceConfigurationObject serviceconfobj = null;
		FirewallServiceObject service = null;

		if (Firewallserviceobjlist != null && Firewallserviceobjlist.getFirewallServiceObject ( key ) != null) {
			service = Firewallserviceobjlist.getFirewallServiceObject ( key );
			serviceconfobj = service.getServiceconf ();
		} else {
			Firewallserviceobjlist = new FirewallServiceObjectList ();
		}

		if (service == null) {

			// service obj
			setFirewallServiceObj ( getFirewallServiceObj () );
			FirewallServiceObj.setServiceconf ( getFirewallServiceConfigurationObj () );
			setFirewallServiceConfigurationObj ( getFirewallServiceConfigurationObj () );
			// --

			if (getFirewallServiceObj ().getFco () != null) {

				Firewallserviceobjlist.addFirewallServiceObject ( getFirewallServiceObj () );
				selectionHierarchy.addService ( getFirewallServiceObj () );
				selectionHierarchy.addServiceConfiguration ( getFirewallServiceConfigurationObj () );
				SelectInterface ();
//				SelectSupportedService ();
				return true;
			}
			return false;
		} else {
			selectionHierarchy.addService ( service );
			selectionHierarchy.addServiceConfiguration ( getFirewallServiceConfigurationObj () );
			SelectInterface ();
//			SelectSupportedService ();
		}

		return true;
	}

	public boolean SelectInterface ( ) throws WbemsmtException {

		FirewallInterfacesobjlist = getFirewallInterfacesobjlist ();

		return true;
	}

//	public boolean SelectSupportedService (  ) throws WbemsmtException {
//
//		FirewallSupportedServicesobjlist = getFirewallSupportedServicesobjlist ();
//
//		return true;
//	}

	// Ports
	public boolean select_0_Linux_FirewallManagedPorts ( CimObjectKey key ) throws WbemsmtException {

		FirewallManagedPortObject portobj = null;

		if (FirewallManagedPortobjlist != null && FirewallManagedPortobjlist.getFirewallManagedPortObject ( key ) != null)
			portobj = FirewallManagedPortobjlist.getFirewallManagedPortObject ( key );
		else{
//			FirewallManagedPortobjlist = new FirewallManagedPortObjectList ();
			FirewallManagedPortobjlist = getFirewallManagedPortobjlist ();
			setFirewallManagedPortobjlist ( FirewallManagedPortobjlist );
			}

		if (portobj == null) {

			portobj = FirewallManagedPortobjlist.getFirewallManagedPortObject (key  );
			setFirewallManagedPortObj ( portobj );

			if (portobj.getFco () != null) {
				selectionHierarchy.addManagedPort ( getFirewallManagedPortObj () );
				return true;
			}
			return false;
		} else {
			selectionHierarchy.addManagedPort ( portobj );
		}
		return true;
	}

	public boolean select_0_Linux_FirewallTrustedServices(CimObjectKey key) throws WbemsmtException{
		FirewallSupportedServicesObject portobj = null;

		if (FirewallSupportedServicesobjlist != null && FirewallSupportedServicesobjlist.getFirewallSupportedServicesObject ( key ) != null)
			portobj = FirewallSupportedServicesobjlist.getFirewallSupportedServicesObject ( key );
		else{
//			FirewallManagedPortobjlist = new FirewallManagedPortObjectList ();
			FirewallSupportedServicesobjlist = getFirewallSupportedServicesobjlist ();
			setFirewallSupportedServicesobjlist ( FirewallSupportedServicesobjlist );
			}

		if (portobj == null) {

			portobj = FirewallSupportedServicesobjlist.getFirewallSupportedServicesObject (key  );
			setFirewallSupportedServicesObj ( portobj );

			if (portobj.getFco () != null) {
				selectionHierarchy.addSupportedService ( getFirewallSupportedServicesObj () );
				return true;
			}
			return false;
		} else {
			selectionHierarchy.addSupportedService ( portobj );
		}
		return true;
	}
	
	/**
	 * @return the FirewallServiceObj
	 */
	public FirewallServiceObject getFirewallServiceObj () {

		try {
			if (FirewallServiceObj == null) {
				// List listWithServiceNodes = rootNode.findInstanceNodes (
				// Linux_FirewallService.CIM_CLASS_NAME );
				List<Linux_FirewallService> listWithServiceNodes = Linux_FirewallServiceHelper.enumerateInstances ( getCimClient (),
						getNamespace (), true );
				for (Iterator<Linux_FirewallService> iterServiceNodes = listWithServiceNodes.iterator (); iterServiceNodes.hasNext ();) {
					// ICIMInstanceNode serviceNode = (ICIMInstanceNode)
					// iterServiceNodes.next ();

					Linux_FirewallService serviceFco = (Linux_FirewallService) iterServiceNodes.next ();

					// set the service object
					Linux_FirewallService aFco = new Linux_FirewallService ( serviceFco.getCimInstance () );

					FirewallServiceObject FirewallServiceObject = new FirewallServiceObject ( aFco, this );

					setFirewallServiceObj ( FirewallServiceObject );
					// setFirewallServiceConfigurationObj (
					// getFirewallServiceConfigurationObj () );
				}
			}
		} catch (WbemsmtException e) {
			try {
				throw new WbemsmtException ( (ErrorCode) e.getErrorCode (), e );
			} catch (WbemsmtException e1) {
				e1.printStackTrace ();
			}
		}

		return FirewallServiceObj;
	}

	/**
	 * @param FirewallServiceObj
	 *            the FirewallServiceObj to set
	 */
	public void setFirewallServiceObj ( FirewallServiceObject FirewallServiceObj ) {
		this.FirewallServiceObj = FirewallServiceObj;
	}

	/**
	 * @return the FirewallServiceConfigurationObj
	 * @throws WbemsmtException
	 */
	public FirewallServiceConfigurationObject getFirewallServiceConfigurationObj () throws WbemsmtException {

		FirewallServiceConfigurationObject serviceconfobj = null;

		if (FirewallServiceConfigurationObj == null) {
			List<CIMObjectPath> serviceconfArrayList = getFirewallServiceObj ()
					.getFco ()
					.getAssociated_Linux_FirewallServiceConfiguration_Linux_FirewallServiceConfigurationForServiceNames (
							cimClient );

			for (Iterator<CIMObjectPath> iter = serviceconfArrayList.iterator (); iter.hasNext ();) {
				CIMObjectPath obj = (CIMObjectPath) iter.next ();
				Linux_FirewallServiceConfiguration settingFco = new Linux_FirewallServiceConfiguration (
						new CIMInstance ( obj, null ) );
				serviceconfobj = new FirewallServiceConfigurationObject ( settingFco, this );
			}

			setFirewallServiceConfigurationObj ( serviceconfobj );
		}

		return FirewallServiceConfigurationObj;
	}

	/**
	 * @param FirewallServiceConfigurationObj
	 *            the FirewallServiceConfigurationObj to set
	 */
	public void setFirewallServiceConfigurationObj ( FirewallServiceConfigurationObject FirewallServiceConfigurationObj ) {
		this.FirewallServiceConfigurationObj = FirewallServiceConfigurationObj;
	}

	/**
	 * @return the firewallInterfacesObj
	 */
	public FirewallInterfacesObject getFirewallInterfacesObj () {
		return FirewallInterfacesObj;
	}

	/**
	 * @param firewallInterfacesObj
	 *            the firewallInterfacesObj to set
	 */
	public void setFirewallInterfacesObj ( FirewallInterfacesObject firewallInterfacesObj ) {
		FirewallInterfacesObj = firewallInterfacesObj;
	}

	/**
	 * @return the firewallInterfacesobjlist
	 * @throws WbemsmtException
	 */
	public FirewallInterfacesObjectList getFirewallInterfacesobjlist () throws WbemsmtException {

		if (FirewallInterfacesobjlist == null) {

			FirewallInterfacesobjlist = new FirewallInterfacesObjectList ();

			List<Linux_FirewallInterface> interfacesArrayList = Linux_FirewallInterfaceHelper.enumerateInstances ( getCimClient (),
					getNamespace (), true );

			for (Iterator<Linux_FirewallInterface> iter = interfacesArrayList.iterator (); iter.hasNext ();) {
				Linux_FirewallInterface obj = (Linux_FirewallInterface) iter.next ();
//				Linux_FirewallInterface interfaceFco = new Linux_FirewallInterface ( new CIMInstance ( obj, null ) );
				FirewallInterfacesobjlist.addFirewallInterfacesObject ( new FirewallInterfacesObject(obj,this) );
			}
		}

		return FirewallInterfacesobjlist;
	}

	/**
	 * @param firewallInterfacesobjlist
	 *            the firewallInterfacesobjlist to set
	 */
	public void setFirewallInterfacesobjlist ( FirewallInterfacesObjectList firewallInterfacesobjlist ) {
		FirewallInterfacesobjlist = firewallInterfacesobjlist;
	}

	/**
	 * @return the firewallManagedPortObj
	 */
	public FirewallManagedPortObject getFirewallManagedPortObj () {
		return FirewallManagedPortObj;
	}

	/**
	 * @param firewallManagedPortObj
	 *            the firewallManagedPortObj to set
	 */
	public void setFirewallManagedPortObj ( FirewallManagedPortObject firewallManagedPortObj ) {
		FirewallManagedPortObj = firewallManagedPortObj;
	}

	/**
	 * @return the firewallManagedPortobjlist
	 * @throws WbemsmtException 
	 */
	public FirewallManagedPortObjectList getFirewallManagedPortobjlist () throws WbemsmtException {

		if(FirewallManagedPortobjlist != null)
			return FirewallManagedPortobjlist;
		
			FirewallManagedPortobjlist = new FirewallManagedPortObjectList ();
			
			List<Linux_FirewallManagedPorts> ManagedObjectArrayList = Linux_FirewallManagedPortsHelper.enumerateInstances ( getCimClient (),
					getNamespace (), true);

			for (Iterator<Linux_FirewallManagedPorts> iter = ManagedObjectArrayList.iterator (); iter.hasNext ();) {
				Linux_FirewallManagedPorts obj = (Linux_FirewallManagedPorts) iter.next ();
//				Linux_FirewallManagedPorts ManPortFco = new Linux_FirewallManagedPorts ( new CIMInstance ( obj, null ) );
				FirewallManagedPortobjlist.addFirewallManagedPortObject ( new FirewallManagedPortObject(obj,this) );
			}
			
		return FirewallManagedPortobjlist;
	}

	/**
	 * @param firewallManagedPortobjlist
	 *            the firewallManagedPortobjlist to set
	 */
	public void setFirewallManagedPortobjlist ( FirewallManagedPortObjectList firewallManagedPortobjlist ) {
		FirewallManagedPortobjlist = firewallManagedPortobjlist;
	}

	/**
	 * @return the firewallSupportedServicesObj
	 */
	public FirewallSupportedServicesObject getFirewallSupportedServicesObj () {
		return FirewallSupportedServicesObj;
	}

	/**
	 * @param firewallSupportedServicesObj
	 *            the firewallSupportedServicesObj to set
	 */
	public void setFirewallSupportedServicesObj ( FirewallSupportedServicesObject firewallSupportedServicesObj ) {
		FirewallSupportedServicesObj = firewallSupportedServicesObj;
	}

	/**
	 * @return the firewallSupportedServicesobjlist
	 * @throws WbemsmtException
	 */
	public FirewallSupportedServicesObjectList getFirewallSupportedServicesobjlist () throws WbemsmtException {

		if (FirewallSupportedServicesobjlist == null) {

			FirewallSupportedServicesobjlist = new FirewallSupportedServicesObjectList ();

			List<Linux_FirewallTrustedServices> SupportedServicesArrayList = Linux_FirewallTrustedServicesHelper.enumerateInstances (
					getCimClient (), getNamespace (), true );

			for (Iterator<Linux_FirewallTrustedServices> iter = SupportedServicesArrayList.iterator (); iter.hasNext ();) {
				Linux_FirewallTrustedServices obj = (Linux_FirewallTrustedServices) iter.next ();
//				Linux_FirewallTrustedServices supserviceFco = new Linux_FirewallTrustedServices ( new CIMInstance (
//						obj, null ) );
				FirewallSupportedServicesobjlist.addFirewallSupportedServicesObject ( new FirewallSupportedServicesObject(obj,this) );
			}
		}

		return FirewallSupportedServicesobjlist;
	}

	/**
	 * @param firewallSupportedServicesobjlist
	 *            the firewallSupportedServicesobjlist to set
	 */
	public void setFirewallSupportedServicesobjlist (
			FirewallSupportedServicesObjectList firewallSupportedServicesobjlist ) {
		FirewallSupportedServicesobjlist = firewallSupportedServicesobjlist;
	}

	public NewFirewallManagedPortWizard getNewportwizard () {
		return newportwizard;
	}

	public void setNewportwizard ( NewFirewallManagedPortWizard newportwizard ) {
		this.newportwizard = newportwizard;
	}

	/**
	 * @return the protocolVals
	 */
	public HashMap<String, Integer> getProtocolVals () {
		return ProtocolVals;
	}

	/**
	 * @return the managedPortInterfacesCLIData
	 */
	public HashMap<String, String> getManagedPortInterfacesCLIData () {
		return ManagedPortInterfacesCLIData;
	}

	/**
	 * @param managedPortInterfacesCLIData the managedPortInterfacesCLIData to set
	 */
	public void setManagedPortInterfacesCLIData ( HashMap<String, String> managedPortInterfacesCLIData ) {
		ManagedPortInterfacesCLIData = managedPortInterfacesCLIData;
	}

	/**
	 * @return the supportedServicesInterfacesCLIData
	 */
	public HashMap<String, String> getSupportedServicesInterfacesCLIData () {
		return SupportedServicesInterfacesCLIData;
	}

	/**
	 * @param supportedServicesInterfacesCLIData the supportedServicesInterfacesCLIData to set
	 */
	public void setSupportedServicesInterfacesCLIData ( HashMap<String, String> supportedServicesInterfacesCLIData ) {
		SupportedServicesInterfacesCLIData = supportedServicesInterfacesCLIData;
	}

	public HashMap<String, String> parseInterfaceData ( String option1, String option2 ) throws WbemsmtException {
		
	     StringTokenizer st1 = new StringTokenizer(option1,",");
	     StringTokenizer st2 = new StringTokenizer(option2,",");
		
	     if(st1.countTokens ()< st2.countTokens ())
	    	 throw new WbemsmtException(new ErrorCode(option2, 0),"Less number of arguements passed. provide the isenabled flag data for all the deviceids passed");
	     
	     HashMap<String, String> interfacedata = new HashMap<String, String>();
	     
	     for(;st1.hasMoreTokens();) 
	    	 interfacedata.put(st1.nextToken(),st2.nextToken());
	    	 
		return interfacedata;
	}

	
}
