/** 
 * EditInterfacesCommandLoader.java
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


import java.util.Iterator;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter;
import org.sblim.wbemsmt.firewall.wrapper.object.FirewallInterfacesObject;
import org.sblim.wbemsmt.tools.cli.CimCommandValues;
import org.sblim.wbemsmt.tools.cli.CliDataLoader;
import org.sblim.wbemsmt.tools.cli.CliUtil;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class EditInterfacesCommandLoader extends FirewallLoader implements CliDataLoader {

	protected CimCommandValues cmd;
	
	public void load ( WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, CimCommandValues commandValues )
			throws WbemsmtException {
	
		this.cmd = commandValues;
		selectService ( bundle, adapter, "rhino1" );
		FirewallCimAdapter adap = ((FirewallCimAdapter)adapter);
		
		FirewallInterfacesObject obj = null;
		for (Iterator<Object> iter = adap.getFirewallInterfacesobjlist ().iterator (); iter.hasNext ();){ 
			obj  = (FirewallInterfacesObject)iter.next();
			if(obj.getFco ().get_key_DeviceID ().equalsIgnoreCase ( CliUtil.getOption(cmd,EditInterfacesCommand.KEY_deviceID)))
				obj.getFco ().set_isTrusted ( new Boolean(CliUtil.getOption(cmd,EditInterfacesCommand.KEY_isTrusted )));
		}
		
		return;		
	}
}
