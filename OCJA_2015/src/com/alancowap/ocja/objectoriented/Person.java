/** 
 *  Simple class representing a Person.
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.objectoriented;


public class Person extends Animal{

	private static final String SOUND = "Yay!";

	public Person(String name){
		super(name, Person.SOUND);
	}
	
}
