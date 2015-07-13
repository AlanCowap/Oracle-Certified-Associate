/** 
 *  Demo numeric promotion
 *  Demo primitive casting
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.operatorsstrings;


public class NumericPromotion {


	public static void main(String[] args) {
		byte num1 = 10;
		byte num2 = 15;
		byte sum = (byte) (num1 + num2);
		
		System.out.println("Sum is " + sum);
	}

}

