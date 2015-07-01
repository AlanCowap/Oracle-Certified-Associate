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
		
		//Initialise elements of array with values in range 1..100 (inclusive)		
		for(int i=0; i < scores.length; ++i){// iterate over array
			scores[i] = i+1;
			System.out.print(scores[i] + " ");	// read values
		}
		
		//Calculate the arithmetic mean (average)
		/* 
		   declare a variable to hold the total, initialise to 0
			BEGIN LOOP 
				iterate through the array
				add each element to total
			END LOOP
			divide total by number of elements		
		*/		
		float total = 0;
		for(int i=0; i < scores.length; ++i){
			total = total + scores[i];
		}
		float mean = total / scores.length;
		System.out.println("\nMean is " + mean);
		
		//Calculate the max value
		int max=scores[0];
		for(int i=1; i < scores.length; ++i){
			if(scores[i] > max ) {
				max = scores[i];
			}
		}
		System.out.println("Max is " + max);
		
		
	}

}
