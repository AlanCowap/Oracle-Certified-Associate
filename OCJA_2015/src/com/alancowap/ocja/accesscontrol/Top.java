/** 
 *  Demo of Access Control modifiers: private, <default>, protected, public
 *  - within a class    
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.accesscontrol;

public class Top {
	private int secretNumber = 42;
	int defaultNumber = 0;	//default access control
	protected int protectedNumber = 100;
	public int freeNumber = 1800;
	
	private void encryptNum(int secretNumber) {
			this.secretNumber = (int) (42 * 1.34);	// private access ok within class
			this.defaultNumber = 5; 				// default access ok within class
			this.protectedNumber = 120; 			// protected access ok within class
			this.freeNumber = 1800;					// public access ok within class
	}
}
