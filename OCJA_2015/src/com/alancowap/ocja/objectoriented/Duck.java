/** 
 *  Describes a Duck.
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.objectoriented;


public class Duck extends Animal {
	private static final String SOUND = "Quack";

	public Duck(String name){
		super(name, Duck.SOUND);
	}
	
	//Override the inherited method move()
	public void move(){
		System.out.println("Duck moving ...");
	}

	@Override
	public void sleep() {
		System.out.println("Duck sleeping");		
	}

	public void spawn(){
		// empty implementations
	}

	
}
