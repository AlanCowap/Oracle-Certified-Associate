/** 
 *  Demo pre and post increment operator
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.operatorsstrings;


public class Incrementor{

	
	public static void main(String[] args) {
		//Post-increment
		int age = 0;
		System.out.println("Age is " + age++);		// 0		
		System.out.println("Second age is " + age);	// 1
		
		//Pre-increment
		int numPeople = 99;
		System.out.println("\nNum people is: " + ++numPeople);		//100
		System.out.println("Second num people is: " + numPeople);	//100
		

	}

	public void doStuff(){}
}
