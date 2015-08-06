/** 
 *  Class definition.
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.objectoriented;

//interfaces are implicitly abstract
public abstract interface Spawnable {
	
	//"variables" in interfaces are implicitly public static final
	public static final int NUM_SPAWNS = 123;
	
	//methods in interfaces are implicitly public abstract
	public abstract void spawn();

}
