/** 
 * EditSupportedServicesCommandLoader.java
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


import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter;
import org.sblim.wbemsmt.tools.cli.CimCommandValues;
import org.sblim.wbemsmt.tools.cli.CliDataLoader;
import org.sblim.wbemsmt.tools.cli.CliUtil;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class EditSupportedServicesCommandLoader extends FirewallLoader implements CliDataLoader {

	protected CimCommandValues cmd;
	
	public void load ( WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, CimCommandValues commandValues )
			throws WbemsmtException {

		this.cmd = commandValues;
		selectSupportedService ( bundle, adapter, "rhino1" ,CliUtil.getOption ( cmd, EditSupportedServicesCommand.KEY_serviceName ));
		FirewallCimAdapter adap = ((FirewallCimAdapter)adapter);

		adap.setSupportedServicesInterfacesCLIData ( adap.parseInterfaceData(CliUtil.getOption ( cmd, EditSupportedServicesCommand.KEY_deviceID ) , CliUtil.getOption ( cmd, EditSupportedServicesCommand.KEY_isEnabled )));
		
		return;		
		
	}


}
