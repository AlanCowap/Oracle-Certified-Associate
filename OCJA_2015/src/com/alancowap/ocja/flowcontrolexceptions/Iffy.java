/** 
 *  Demo of 'if' statements, 'else if', 'else'
 *  -  
 *   
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.flowcontrolexceptions;

public class Iffy {

	public static void main(String[] args) {
		//if statement refers to very next statement
		if (true)
			System.out.println("This is true");
			System.out.println("This is printed anyway"); //misleading indentation

		//if statement refers to very next statement (use curly braces if necessary)
		if (true) {
			System.out.println("This is true");
		}
		System.out.println("This is printed anyway"); //misleading indentation
			
		//if statements conditional must evaluate to true or false
		//there are many ways to get true or false
		int num = 1;
		boolean primBol = false;
		Boolean wrapBol = new Boolean(false);
		if(num == 3) {}
		else if(num < 10) {}
		else if (isEven(3)) {}
		else if (primBol) {}
		else if (wrapBol) {}
		else {}
	}

	private static boolean isEven(int num) {
		return (num % 2) == 0;
	}
	
}