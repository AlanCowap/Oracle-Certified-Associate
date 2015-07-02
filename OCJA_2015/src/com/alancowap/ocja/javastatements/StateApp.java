/** 
 *  Simple class to demo pre and post increment and decrement operators (++, --)
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.javastatements;

public class StateApp {

	public static void main(String[] args) {
		int age = 21;
		System.out.println("Initial age is " + age);
		
		// Increment
		age++;
		System.out.println("Post incremented age is " + age);		
		++age;
		System.out.println("Pre incremented age is " + age);		
		
		// Decrement
		age--;
		System.out.println("Post decremented age is " + age);		
		--age;
		System.out.println("Pre decremented age is " + age);		
		
	}

}
