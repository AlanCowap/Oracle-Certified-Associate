/** 
 *  Demo wrapper classes and implicit casting, explicit casting, range checking
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.objectoriented;

public class ShortApp{
	public static void main(String[] args){
		System.out.println("Abstract classes");
		//short s = (Short) 8;	// invalid, won't do 2 steps "narrow and autobox" in one go
		//Short s2 = (Short) 8;	// invalid, won't do 2 steps "narrow and autobox" in one go
		short s3 = (short) 8;	// valid, cast is not required in this case (see next line of code)
		short s4 = 32767;		// valid, range check shows 32767 is within range of short
	}
}