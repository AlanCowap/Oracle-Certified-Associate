/** 
 *  Demo of Access Control modifiers: private, <default>, protected, public
 *  - within a package (not inheriting)    
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */

package com.alancowap.ocja.accesscontrol;

public class Sideways {

	public int getTopSecretNumber() {
		Top myTop = new Top();
		int num;
		//myTop.secretNumber; 	//can't access private member from outside class
		num = myTop.defaultNumber;	//can access default  member from outside class
		myTop.protectedNumber = 12; //can access protected member from same package
		myTop.freeNumber = 1800;// public access ok within package
		
		return 1;
	}
	
}
