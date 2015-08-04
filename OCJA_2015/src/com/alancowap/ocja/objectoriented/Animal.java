/** 
 *  Abstract class defining state and behaviour for Animals
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.objectoriented;

public abstract class Animal {
	private String name;
	private String sound;
	
	public Animal(){
		this("NoName", "NoSound");
	}
	
	public Animal(String name, String sound){
		this.name = name;
		this.sound = sound;
	}
	
	abstract public void sleep();
	
	public void makeNoise(){
		System.out.println(this.name + " says " + this.sound);
	}
	
	public void move(){
		System.out.println("Animal moving...");
	}
	
	public String toString(){
		return this.name;
	}
}
