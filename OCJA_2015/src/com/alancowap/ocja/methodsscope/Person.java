/** 
 *  Class to describe a person.
 *  Demo instance variables
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.methodsscope;

public class Person{
	//instance variables
	private int age = -1;	
	private String name = "mule";
	
	//Getters & Setters
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}	
	
}

