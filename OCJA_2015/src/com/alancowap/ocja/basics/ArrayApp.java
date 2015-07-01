/** 
 *  Simple class to demo a 1D Array
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.basics;

public class ArrayApp {

	public static void main(String[] args) {
		int[] scores = new int[10];			// Construct Array
		
		for(int i=0; i < scores.length; ++i){// iterate over array
			scores[i] = 16;					// assign values
			System.out.println(scores[i]);	// read values
		}
	}

}
