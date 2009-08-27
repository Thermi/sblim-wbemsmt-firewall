/** 
 * FirewallManagedPortObjectList.java
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
import org.sblim.wbemsmt.firewall.wrapper.object.FirewallManagedPortObject;
import org.sblim.wbemsmt.schema.cim221.CIM_ManagedElement;

public class FirewallManagedPortObjectList extends ObjectList {

	public FirewallManagedPortObject getFirewallManagedPortObject(CimObjectKey key) {
		return (FirewallManagedPortObject) get(key);
	}

	public FirewallManagedPortObject getFirewallManagedPortObject(CIMObjectPath path) {
		return getFirewallManagedPortObject(new CimObjectKey(path));
	}

	public FirewallManagedPortObject getFirewallManagedPortObject(CIM_ManagedElement element) {
		return getFirewallManagedPortObject(new CimObjectKey(element
				.getCimObjectPath()));
	}

	public void addFirewallManagedPortObject(FirewallManagedPortObject obj) throws WbemsmtException {
		put(obj);
	}

	public FirewallManagedPortObject getFirewallManagedPortObject(int i) throws WbemsmtException {
		return (FirewallManagedPortObject) getList().get(i);
	}

	public FirewallManagedPortObject getFirewallManagedPortObjectByListName(String listName) throws WbemsmtException {
		return (FirewallManagedPortObject) getObjectsByName().get(listName);
	}

	protected Object getFco(Object value) {
		FirewallManagedPortObject obj = (FirewallManagedPortObject) value;
		return obj.getFco();
	}

	protected Object getKey(Object value) {
		FirewallManagedPortObject obj = (FirewallManagedPortObject) value;
		return obj.getFco().get_ElementName();
	}

}
