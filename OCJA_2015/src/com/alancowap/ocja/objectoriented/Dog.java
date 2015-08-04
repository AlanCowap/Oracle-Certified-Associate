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
//	private String name;
	private static final String SOUND = "Woof";

	public Dog(String name){
		super(name, Dog.SOUND);
	}
	
//	public void makeNoise(){
//		System.out.println(this.name + " says Woof!");
//	}
//	
//	public String toString(){
//		return this.name;
//	}
	
}
