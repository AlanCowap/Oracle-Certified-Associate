/** 
 *  Demo ternary operator.
 *  Demo succinct coding / less readable coding
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.operatorsstrings;

public class Tern{
	public static void main(String[] args){
		System.out.printf("Lower value is %d", new Tern().findLowerValue(3, 4));
	}
	private int findLowerValue(int number1, int number2){
		return number1 < number2 ? number1 : number2;
	}
}