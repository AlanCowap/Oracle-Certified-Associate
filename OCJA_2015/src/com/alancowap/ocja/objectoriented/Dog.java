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

	public Dog(){}
	public Dog(String name){
		super(name, Dog.SOUND);
	}
	@Override
	public void sleep() {
		System.out.println("Dog sleeping");		
	}

	public void spawn(){
		System.out.println("Dog spawning...");
	}

}
