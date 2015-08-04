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

public class Cat {
	private String name;

	public Cat(String name){
		this.name = name;
	}
	
	public void makeNoise(){
		System.out.println(this.name + " says Meow!");
	}
	
	public String toString(){
		return this.name;
	}
	
}

