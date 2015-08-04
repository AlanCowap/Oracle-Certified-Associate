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


public class Dog extends Animal{
	private static final String SOUND = "Woof";

	public Dog(String name){
		super(name, Dog.SOUND);
	}
	
}
