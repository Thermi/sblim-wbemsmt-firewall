/** 
 * LookupServerTask.java
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


package org.sblim.wbemsmt.firewall.lookup;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallService;
import org.sblim.wbemsmt.lookup.Lookup;

public class LookupServerTask implements Lookup {

	public boolean lookup ( WBEMClient cimClient, String namespace ) throws WbemsmtException {
		
		Logger logger = Logger.getLogger(LookupServerTask.class.getName()); 
		
		try {
			new Linux_FirewallService(cimClient,namespace);
			return true;
		} catch (WbemsmtException e) {
			logger.log(Level.SEVERE,"Cannot lookup dns task on server " + namespace,e);
			return false;
		}
	}

}
