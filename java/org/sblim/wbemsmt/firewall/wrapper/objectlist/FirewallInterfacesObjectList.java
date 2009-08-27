/** 
 * FirewallInterfacesObjectList.java
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
import org.sblim.wbemsmt.firewall.wrapper.object.FirewallInterfacesObject;
import org.sblim.wbemsmt.schema.cim221.CIM_ManagedElement;

public class FirewallInterfacesObjectList extends ObjectList {

	public FirewallInterfacesObject getFirewallInterfacesObject(CimObjectKey key) {
		return (FirewallInterfacesObject) get(key);
	}

	public FirewallInterfacesObject getFirewallInterfacesObject(CIMObjectPath path) {
		return getFirewallInterfacesObject(new CimObjectKey(path));
	}

	public FirewallInterfacesObject getFirewallInterfacesObject(CIM_ManagedElement element) {
		return getFirewallInterfacesObject(new CimObjectKey(element
				.getCimObjectPath()));
	}

	public void addFirewallInterfacesObject(FirewallInterfacesObject obj) throws WbemsmtException {
		put(obj);
	}

	public FirewallInterfacesObject getFirewallInterfacesObject(int i) throws WbemsmtException {
		return (FirewallInterfacesObject) getList().get(i);
	}

	public FirewallInterfacesObject getFirewallInterfacesObjectByListName(String listName) throws WbemsmtException {
		return (FirewallInterfacesObject) getObjectsByName().get(listName);
	}

	protected Object getFco(Object value) {
		FirewallInterfacesObject obj = (FirewallInterfacesObject) value;
		return obj.getFco();
	}

	protected Object getKey(Object value) {
		FirewallInterfacesObject obj = (FirewallInterfacesObject) value;
		return obj.getFco().get_key_DeviceID ();
	}

}
