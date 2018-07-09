/** 
 *  Demo of Encapsulation
 *   - restrict variable access, expose an API, use JavaBeans convention.
 *   
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.objectorientation;

public class Encapsulate {
	//Encapsulation - keep variables e.g. private
	private int age = 5;
	private String name = "Not Set";
	
	//Encapsulation - provide accessors & mutators as appropriate 
	public int getAge() {
		return age;
	}
	
	//Now we can validate input
	public void setAge(int age) {
		if (age >= 0) 
			this.age = age;
		//else //ideally we should let the caller know we didn't set the Age
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

class TestEncapsulate{
	public static void main(String[] args) {
		Encapsulate en = new Encapsulate();
//		en.age = -3; //Encapsulation prevents access to private members
	}
}
