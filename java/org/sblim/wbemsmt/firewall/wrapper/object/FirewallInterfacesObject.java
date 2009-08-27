/** 
 * FirewallInterfacesObject.java
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
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.bl.wrapper.WbemsmtBusinessObject;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter;
import org.sblim.wbemsmt.firewall.bl.container.edit.FInterfaceContainer;
import org.sblim.wbemsmt.firewall.bl.fco.Linux_FirewallInterface;

public class FirewallInterfacesObject extends WbemsmtBusinessObject {

	private Linux_FirewallInterface fco = null;
	private FirewallCimAdapter adapter = null;
	
	public FirewallInterfacesObject ( Linux_FirewallInterface fco, FirewallCimAdapter adapter2 ) {
		super ( adapter2 );
		this.fco = fco;
		this.adapter = adapter2;
	}

	protected FirewallInterfacesObject ( AbstractBaseCimAdapter adapter ) {
		super ( adapter );
	}
	
	public Linux_FirewallInterface getFco() {
		return fco;
	}

	public CimObjectKey getCimObjectKey () throws WbemsmtException {
		return new CimObjectKey(fco.getCimObjectPath());
	}

	public void updateControls(FInterfaceContainer container){
		container.get_DeviceID ().setControlValue ( fco.get_key_DeviceID () );
		container.get_IsTrusted ().setControlValue ( fco.get_isTrusted () );
	}

	public MessageList save(FInterfaceContainer container) throws WbemsmtException{
		fco.set_isTrusted ( (Boolean) container.get_IsTrusted ().getConvertedControlValue () );
		adapter.getFcoHelper().save(fco, adapter.getCimClient());
		
		adapter.setMarkedForReload ();
		adapter.setPathOfTreeNode ( fco.getCimObjectPath () );
		
		return null;
		
	}
	
}
