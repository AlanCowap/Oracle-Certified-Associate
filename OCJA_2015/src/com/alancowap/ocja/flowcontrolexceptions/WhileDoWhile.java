/** 
 *  Demo of while, and do while
 *  - while executes 0+ times
 *  - do-while executes 1+ times
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.flowcontrolexceptions;

public class WhileDoWhile {

	public static void main(String[] args) {
		// while - condition must evaluate to true
		//while executes 0+ times
		int i = 7;
		while (i < 10) { // true => infinite loop, flase => unreachable code compiler error
			System.out.println("Looping");
			++i;
		}
		
		//do-while executes 1+ times
		i=7;
		do {
			System.out.println("Loop The Loop");
			++i;
		}while (i < 7); //must end with semicolon
		
	}
}
