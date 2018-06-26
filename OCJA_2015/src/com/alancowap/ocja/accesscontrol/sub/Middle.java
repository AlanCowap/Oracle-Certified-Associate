/** 
 *  Demo of Access Control modifiers: private, <default>, protected, public
 *  - in a different package and inheriting 
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */

package com.alancowap.ocja.accesscontrol.sub;

import 	com.alancowap.ocja.accesscontrol.Top;

public class Middle extends Top{

	public void accessTop() {
		Top myTop = new Top();
		//myTop.defaultNumber = 2;	//can't access default member from outside package
		//myTop.protectedNumber = 12;	//can't access protected member from outside package through ORV
		this.protectedNumber = 13;	//can access protected member from outside package through inheritance
		protectedNumber = 14;		//can access protected member from outside package through inheritance
		myTop.freeNumber = 1800;// public access ok outside package
		//defaultNumber = 10;			//can't access default member from outside package even if inheriting
	}
}
