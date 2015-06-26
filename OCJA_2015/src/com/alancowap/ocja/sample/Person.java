/** 
 *  Simple class to represent a Person.
 *  
 *  We could improve this class by using access modifiers for instance variables
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */

package com.alancowap.ocja.sample;

public class Person {

	//State
	int age;
	String name;
	char gender;
	
	//Behaviour
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
