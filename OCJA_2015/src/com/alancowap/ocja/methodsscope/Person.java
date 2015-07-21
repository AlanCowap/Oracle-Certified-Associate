/** 
 *  Class to describe a person.
 *  Demo instance variables
 *  Demo constructors, and constructor overloading
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

	//Constructors
	Person(){
		this("mule", -1);
	}
	
	Person(String name, int age){
		this.setAge(age);
		this.setName(name);
	}
	
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

