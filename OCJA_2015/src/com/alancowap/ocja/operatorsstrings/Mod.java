/** 
 *  Demo modulus operator %, with divide by zero
 *  
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.operatorsstrings;

public class Mod {
	public static void main(String[] args){
		int res = 5 % 0;	// ArithmeticException / by zero
		System.out.printf("Result ", res);
	}
}
