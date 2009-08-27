 /** 
  * FirewallValidator.java
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
 *   *
  * @author: Prashanth Karnam <prkarnam@in.ibm.com>
  *
  * Contributors: 
  * 
  * Description: 
  * 
  */


package org.sblim.wbemsmt.firewall.validator;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.bl.messages.MessageNumber;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.firewall.bl.adapter.FirewallCimAdapter;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.validator.Validator;

public class FirewallValidator extends Validator {

	private LabeledBaseInputComponentIf field = null;
	
	private int check = 0;
	
	public FirewallValidator ( LabeledBaseInputComponentIf field,AbstractBaseCimAdapter adapter ) {
		super ( adapter );
		this.adapter = (FirewallCimAdapter) adapter;
		this.field = field;
	}

	protected LabeledBaseInputComponentIf[] getComponents () {
		return new LabeledBaseInputComponentIf[] { field };
	}

	public void validateElement ( MessageList result ) throws WbemsmtException {

		String value = (String) field.getConvertedControlValue ();

		switch (check) {

		case CHECK_EMPTY:
			checkIfEmpty ( value, result );
			break;
		case CHECK_NUMBER:
			checkNumber ( value, result );
			break;
			
		default:
			break;
		}

		
	}

	private void checkIfEmpty ( String value, MessageList result ) {

		if (value.equals ( "" )) {
			Message err = Message.create ( new MessageNumber ( this.field.getLabelText (), " Value Not Set", 5 ),
					Message.ERROR, adapter.getBundle (), value );
			result.addMessage ( err );
		}
	}
	
	private void checkNumber ( String value, MessageList result ) {

		if (value.equals ( "" ))
			return;

		if (value.matches ( "[0-9]+" ) == false) {
			Message err = Message.create ( new MessageNumber ( this.field.getLabelText (), " Not a valid Number.", 5 ),
					Message.ERROR, adapter.getBundle (), value );
			result.addMessage ( err );
		}

	}

	public void setFlags ( int Flag ) {
		check = Flag;
	}
	
	public static final int CHECK_EMPTY = 0;
	public static final int CHECK_NUMBER = 1;
}
