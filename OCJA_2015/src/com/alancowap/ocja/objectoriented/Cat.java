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

public class Cat extends Animal{

	private static final String SOUND = "Meow!";

	public Cat(String name){
		super(name, Cat.SOUND);
	}

	@Override
	public void sleep() {
		System.out.println("Cat sleeping");		
	}
	
}

