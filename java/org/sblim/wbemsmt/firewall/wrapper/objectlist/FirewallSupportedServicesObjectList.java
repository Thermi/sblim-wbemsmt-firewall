/** 
 * FirewallSupportedServicesObjectList.java
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


package org.sblim.wbemsmt.firewall.wrapper.objectlist;

import javax.cim.CIMObjectPath;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.wrapper.ObjectList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.firewall.wrapper.object.FirewallSupportedServicesObject;
import org.sblim.wbemsmt.schema.cim221.CIM_ManagedElement;

public class FirewallSupportedServicesObjectList extends ObjectList {

	public FirewallSupportedServicesObject getFirewallSupportedServicesObject(CimObjectKey key) {
		return (FirewallSupportedServicesObject) get(key);
	}

	public FirewallSupportedServicesObject getFirewallSupportedServicesObject(CIMObjectPath path) {
		return getFirewallSupportedServicesObject(new CimObjectKey(path));
	}

	public FirewallSupportedServicesObject getFirewallSupportedServicesObject(CIM_ManagedElement element) {
		return getFirewallSupportedServicesObject(new CimObjectKey(element
				.getCimObjectPath()));
	}

	public void addFirewallSupportedServicesObject(FirewallSupportedServicesObject obj) throws WbemsmtException {
		put(obj);
	}

	public FirewallSupportedServicesObject getFirewallSupportedServicesObject(int i) throws WbemsmtException {
		return (FirewallSupportedServicesObject) getList().get(i);
	}

	public FirewallSupportedServicesObject getFirewallSupportedServicesObjectByListName(String listName) throws WbemsmtException {
		return (FirewallSupportedServicesObject) getObjectsByName().get(listName);
	}

	protected Object getFco(Object value) {
		FirewallSupportedServicesObject obj = (FirewallSupportedServicesObject) value;
		return obj.getFco();
	}

	protected Object getKey(Object value) {
		FirewallSupportedServicesObject obj = (FirewallSupportedServicesObject) value;
		return obj.getFco().get_ElementName();
	}

}
