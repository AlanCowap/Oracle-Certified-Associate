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
		ex2.q19();
		ex2.q29();
		ex2.q56();
	}
	
	private void q14() {
		System.out.println("\nQ14");
		//you can use a literal false in an if statement.
		if(false)
			System.out.println("Unreachable code, but allowed");
		else {
			System.out.println("You can reach me if he is false");
		}
		System.out.println("Print me");
	}
	
	private void q19() { //labels
		EMPTY:;	//It is legal to label a statement, including empty statement
		BLOCKY:{}
		STATEMENT: System.out.println("Ok");
		
		//want to find 1,1
		OUTER: for(int i=0; i < 3; ++i) {
			INNER: for(int j=0; j < 3; ++j) {				
				STA: System.out.println(i+","+j);
//				if(1==i && 1==j) break STA; //No. Can't break to a non-loop.
			}
			System.out.println("After inner");
		}
		
	
	}

	private void q29() {
		System.out.println("\nQ29");
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
	
	private void q56() {
		System.out.println("\nQ56");
		Top t = new Top();
		t.myMethod();	//as expected		
		t = new Middle();//runtime look right, i is initialized with default value 0
		t.myMethod();	//by now i has been assigned a value of 10
	}
}

class Top{
	Top(){myMethod();}
	void myMethod() {System.out.println("Top o' the mornin' to ya!");}
}

class Middle extends Top{
	Middle(){System.out.println("Middle o' the constructor to ya!" + i);i=5;}
	int i = 10;
	void myMethod() {System.out.println("Middle o' the mornin' to ya!" + i);}
}

