/** 
 *  Demo of Access Control modifiers: private, <default>, protected, public
 *  - in a different package (not inheriting) 
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */

package com.alancowap.ocja.accesscontrol.sub;

import com.alancowap.ocja.accesscontrol.Top;

public class Left {
	public void accessTop() {
		Top myTop = new Top();
		myTop.freeNumber = 1800;// public access ok outside package and not inherited
	}

}
