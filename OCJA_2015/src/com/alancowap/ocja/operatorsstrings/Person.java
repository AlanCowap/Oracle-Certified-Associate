/** 
 *  Class describing a Person.
 *  Demo toString() method
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.operatorsstrings;


public class Person {
	// State
	String name = "Bob";
	int age = 22;
	
	// Behaviour
	public String toString(){
		return name + " " + age;
	}
	
}
