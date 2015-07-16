/** 
 *  Demo casting of primitives
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.classesvariables;

public class Casting {

	public static void main(String[] args) {
		int num = 128;
		char ch = (char) num;
		System.out.println(num +" "+ ch);
		
		byte b = (byte) num;	// careful now!
		System.out.println(b);
		
		float f = 0.99999F;
		num = (int) f;
		System.out.println(f +" "+ num);
		
	}

}
/*

Outputs:
128 ?
-128
0.99999 0

*/