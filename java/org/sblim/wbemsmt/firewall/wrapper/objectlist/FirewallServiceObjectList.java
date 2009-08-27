/** 
 * FirewallServiceObjectList.java
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
import org.sblim.wbemsmt.firewall.wrapper.object.FirewallServiceObject;
import org.sblim.wbemsmt.schema.cim221.CIM_ManagedElement;

public class FirewallServiceObjectList extends ObjectList {

	public FirewallServiceObject getFirewallServiceObject(CimObjectKey key) {
		return (FirewallServiceObject) get(key);
	}

	public FirewallServiceObject getFirewallServiceObject(CIMObjectPath path) {
		return getFirewallServiceObject(new CimObjectKey(path));
	}

	public FirewallServiceObject getFirewallServiceObject(CIM_ManagedElement element) {
		return getFirewallServiceObject(new CimObjectKey(element
				.getCimObjectPath()));
	}

	public void addFirewallServiceObject(FirewallServiceObject obj) throws WbemsmtException {
		put(obj);
	}

	public FirewallServiceObject getFirewallServiceObject(int i) throws WbemsmtException {
		return (FirewallServiceObject) getList().get(i);
	}

	public FirewallServiceObject getFirewallServiceObjectByListName(String listName) throws WbemsmtException {
		return (FirewallServiceObject) getObjectsByName().get(listName);
	}

	protected Object getFco(Object value) {
		FirewallServiceObject obj = (FirewallServiceObject) value;
		return obj.getFco();
	}

	protected Object getKey(Object value) {
		FirewallServiceObject obj = (FirewallServiceObject) value;
		return obj.getFco().get_Name();
	}

}
