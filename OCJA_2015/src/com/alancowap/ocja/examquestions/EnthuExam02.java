/** 
 * Sample code based on mock-exam questions.   
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 * 
 */
package com.alancowap.ocja.examquestions;

import java.util.ArrayList;

public class EnthuExam02 {

	public static void main(String[] args) {
		EnthuExam02 ex2 = new EnthuExam02();
		ex2.q14();
		ex2.q29();

	}
	
	private void q14() {
		//you can use a literal false in an if statement.
		if(false)
			System.out.println("Unreachable code, but allowed");
		else {
			System.out.println("You can reach me if he is false");
		}
		System.out.println("Print me");
	}

	private void q29() {
		ArrayList<StringBuilder> arr = new ArrayList<>(3);
		arr.add(new StringBuilder("Bill Joy"));
		arr.add(new StringBuilder("James Gosling"));
		//you can use final modifer in enhanced-for loop, can't reassign str
		//however the object can still be mutated (if it's mutable)
		for(final StringBuilder sb : arr) {
			System.out.println(sb);
			System.out.println("in loop");
			this.someOtherMethod(sb);
		}
		System.out.println("fin loop");
		
		StringBuilder sb2;
//		for(sb2 : arr) {} //No. must define varaible within the enhanced for loop
	}
	
	private void someOtherMethod(StringBuilder sb) {
		sb = new StringBuilder("");
		return;
	}
}
