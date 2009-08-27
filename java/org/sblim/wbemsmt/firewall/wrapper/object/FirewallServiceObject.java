/** 
 * FirewallServiceObject.java
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


package org.sblim.wbemsmt.firewall.wrapper.object;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.wrapper.WbemsmtBusinessObject;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallService;

public class FirewallServiceObject extends WbemsmtBusinessObject {

	protected FirewallServiceObject ( AbstractBaseCimAdapter adapter ) {
		super ( adapter );
	}

	private Linux_FirewallService fco;

	private FirewallServiceConfigurationObject serviceconf = null;
	
	public FirewallServiceObject(Linux_FirewallService fco, FirewallCimAdapter adapter) {
		this(adapter);
		this.fco = fco;
	}
	
	public Linux_FirewallService getFco() {
		return fco;
	}

	/**
	 * @return the serviceconf
	 */
	public FirewallServiceConfigurationObject getServiceconf () {
		return serviceconf;
	}

	/**
	 * @param serviceconf the serviceconf to set
	 */
	public void setServiceconf ( FirewallServiceConfigurationObject serviceconf ) {
		this.serviceconf = serviceconf;
	}

	public CimObjectKey getCimObjectKey () throws WbemsmtException {
		return new CimObjectKey(fco.getCimObjectPath());
	}

}
