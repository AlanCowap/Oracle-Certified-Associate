/** 
 *  Demo of Access Control modifiers: private, <default>, protected, public
 *  - within a package and inheriting
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */

package com.alancowap.ocja.accesscontrol;

public class Bottom extends Top{

	private void encryptNum() {
		//Access through ORV
		Top myTop = new Top();
		//myTop.secretNumber = (int) (42 * 1.34); // private access not ok within sub-class, same package
		myTop.defaultNumber = 5; 				// default access ok within sub-class, same package
		myTop.protectedNumber = 120; 			// protected access ok within sub-class, same packageass
		myTop.freeNumber = 1800;				// public access ok within sub-class, same package

		//Access through Inheritance
		//secretNumber = (int) (42 * 1.34); 	// private access not ok within sub-class, same package
		defaultNumber = 5; 						// N.B. default access ok within sub-class, same package
		protectedNumber = 120; 					// protected access ok within sub-class, same package
		freeNumber = 1800;						// public access ok within sub-class, same package
		
}

	
}
