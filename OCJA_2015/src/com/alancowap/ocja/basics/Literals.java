/** 
 *  Demo numerical literals - in/valid
 *   - octal, hex, and binary (since JavaSE7)
 *   
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.basics;


public class Literals {

	public static void main(String[] args) {
		double a = 0xb10_000;
		float b = 0b10_000;
		//float c = 0b20_000; //can't have a 2 in binary - only 0 or 1
//		float d = 0b10_000f; //can't use floating point with binary literal?
		long e = 0b10000L;
//		double f = 0b10_000D; //can't use floating point with binary literal?
		
			double num = 0b1;
	}

}
