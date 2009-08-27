/** 
 * FirewallLoader.java
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
 *  *
 * @author: Prashanth Karnam <prkarnam@in.ibm.com>
 *
 * Contributors: 
 * 
 * Description: 
 * 
 */


package org.sblim.wbemsmt.firewall.bl.listener.cli;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.cim.CIMObjectPath;

import org.apache.commons.cli.CommandLine;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.exception.ErrorCode;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallInterface;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallInterfaceHelper;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallManagedPorts;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallManagedPortsHelper;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallService;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallServiceConfiguration;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallTrustedServices;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallTrustedServicesHelper;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class FirewallLoader {

	protected CommandLine cmd;
	
	public FirewallLoader(){
		super();
	}

	
	protected void selectService(WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, String serviceName) throws WbemsmtException {
		try {
			CIMObjectPath pathService = getPathOfService(adapter, serviceName);
			if (pathService != null)
			{
				CimObjectKey key = new CimObjectKey(pathService);
				adapter.select(key);
				return;
			}
			else
			{
				throw new WbemsmtException(null,bundle.getString("service.not.found",new Object[]{serviceName}));
			}
		} catch (WbemsmtException e) {
			throw new WbemsmtException((ErrorCode)e.getErrorCode (),bundle.getString("service.not.found",new Object[]{serviceName}),e);
		}
	}

	protected void selectPort(WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, String serviceName , String PortInstanceId) throws WbemsmtException {
		
//		CIMObjectPath pathService = getPathOfService(adapter, serviceName);
//		Linux_FirewallService service = (Linux_FirewallService) adapter.getFcoHelper().reload(Linux_FirewallServiceHelper.class,pathService,adapter.getCimClient());
		CIMObjectPath pathPort = getPathOfPort(adapter, PortInstanceId);

//		CimObjectKey keyService = new CimObjectKey(pathService);
		CimObjectKey keyUser = new CimObjectKey(pathPort);
//		keyService.setNextKey(keyUser);
		adapter.select(keyUser);
	}

	protected void selectSupportedService(WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, String serviceName , String SupportedServiceName) throws WbemsmtException {

//		CIMObjectPath pathService = getPathOfService(adapter, serviceName);
//		Linux_FirewallService service = (Linux_FirewallService) adapter.getFcoHelper().reload(Linux_FirewallServiceHelper.class,pathService,adapter.getCimClient());
		CIMObjectPath pathSupportedService = getPathOfSupportedService (adapter, SupportedServiceName);

//		CimObjectKey keyService = new CimObjectKey(pathService);
		CimObjectKey keyUser = new CimObjectKey(pathSupportedService);
//		keyService.setNextKey(keyUser);
		adapter.select(keyUser);
	}
	
	protected void selectInterface(WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, String serviceName , String deviceID) throws WbemsmtException {

		CIMObjectPath pathService = getPathOfService(adapter, serviceName);
//		Linux_FirewallService service = (Linux_FirewallService) adapter.getFcoHelper().reload(Linux_FirewallServiceHelper.class,pathService,adapter.getCimClient());

		CimObjectKey keyService = new CimObjectKey(pathService);
		adapter.select(keyService);
	}
	
	protected CIMObjectPath getPathOfService(AbstractBaseCimAdapter adapter, String serviceName) throws WbemsmtException {

		return adapter.getFcoHelper().getPath(Linux_FirewallService.class,adapter.getNamespace (),"Name",serviceName,adapter.getCimClient());
	}

	protected CIMObjectPath getPathOfServiceConfiguration(AbstractBaseCimAdapter adapter, Linux_FirewallServiceConfiguration serviceConf, String ServiceConfName) throws WbemsmtException {
		List<CIMObjectPath> ServiceConfNames = serviceConf.getAssociated_Linux_FirewallService_Linux_FirewallServiceConfigurationForServiceNames (adapter.getCimClient());
		return adapter.getFcoHelper().getPath(ServiceConfNames,"Name",ServiceConfName);
	}

	protected CIMObjectPath getPathOfPort(AbstractBaseCimAdapter adapter, String portInstanceId) throws WbemsmtException {
		List<Linux_FirewallManagedPorts> PortNames = Linux_FirewallManagedPortsHelper.enumerateInstances ( adapter.getCimClient (), adapter.getNamespace (), true );
		return adapter.getFcoHelper().getPath(getObjectPathsForManagedPorts (PortNames),"InstanceId", portInstanceId);
	}

	protected CIMObjectPath getPathOfSupportedService(AbstractBaseCimAdapter adapter, String serviceName) throws WbemsmtException {
		List<Linux_FirewallTrustedServices> SupportedServicesNames = Linux_FirewallTrustedServicesHelper.enumerateInstances ( adapter.getCimClient (), adapter.getNamespace (), true );
		return adapter.getFcoHelper().getPath(getObjectPathsSupportedServices (SupportedServicesNames),"InstanceID", serviceName);
	}

	protected CIMObjectPath getPathOfInterface(AbstractBaseCimAdapter adapter, String deviceID) throws WbemsmtException {
		List<Linux_FirewallInterface> InterfacesNames = Linux_FirewallInterfaceHelper.enumerateInstances ( adapter.getCimClient (), adapter.getNamespace (), true );
		return adapter.getFcoHelper().getPath(getObjectPathsInterfaces (InterfacesNames),"DeviceID", deviceID);
	}
	
	
	private List<CIMObjectPath> getObjectPathsInterfaces(List<Linux_FirewallInterface> objs){
		
		ArrayList<CIMObjectPath> objpathlist = new ArrayList<CIMObjectPath>();
		
		for (Iterator<Linux_FirewallInterface> iter = objs.iterator(); iter.hasNext();) {
			Linux_FirewallInterface fco = (Linux_FirewallInterface) iter.next ();
			objpathlist.add(fco.getCimObjectPath ());
		}
		return objpathlist;
	}

	private List<CIMObjectPath> getObjectPathsSupportedServices(List<Linux_FirewallTrustedServices> objs){
		
		ArrayList<CIMObjectPath> objpathlist = new ArrayList<CIMObjectPath>();
		
		for (Iterator<Linux_FirewallTrustedServices> iter = objs.iterator(); iter.hasNext();) {
			Linux_FirewallTrustedServices fco = (Linux_FirewallTrustedServices) iter.next ();
			objpathlist.add(fco.getCimObjectPath ());
		}
		return objpathlist;
	}


	private List<CIMObjectPath> getObjectPathsForManagedPorts(List<Linux_FirewallManagedPorts> objs){
		
		ArrayList<CIMObjectPath> objpathlist = new ArrayList<CIMObjectPath>();
		
		for (Iterator<Linux_FirewallManagedPorts> iter = objs.iterator(); iter.hasNext();) {
			Linux_FirewallManagedPorts fco = (Linux_FirewallManagedPorts) iter.next ();
			objpathlist.add(fco.getCimObjectPath ());
		}
		return objpathlist;
	}

	
}
