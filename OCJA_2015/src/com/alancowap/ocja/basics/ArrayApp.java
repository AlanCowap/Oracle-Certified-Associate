/** 
 *  Simple class to demo a 1D Array
 *  Create an array of int, initialise with values in range 1..100 inclusive
 *  Calculate, min, max, mean, total
 *  Note that array elements are initialised (to the default value for the type of the array).
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.basics;

import java.util.Random;

public class ArrayApp {

	public static void main(String[] args) {
		int[] scores = new int[10];				// Construct Array
		
		for(int i=0; i < scores.length; ++i){	// iterate over array
			scores[i] = 16;						// assign values
			System.out.print(scores[i]);		// read values
		}
		System.out.println("");
		
		//Create a random number generator
		Random rand = new Random();
		
		//Initialise elements of array with random values in range 1..100 (inclusive)		
		for(int i=0; i < scores.length; ++i){	// iterate over array
			scores[i] = rand.nextInt(100) + 1; 	// add one, otherwise range is 0..99 inclusive.
			System.out.print(scores[i] + " ");	// output values (read values from array)
		}
		
		//Calculate the arithmetic mean (average)
		/* pseudocode
		   declare a variable to hold the total, initialise to 0
			BEGIN LOOP 
				iterate through the array
				add each element to total
			END LOOP
			divide total by number of elements		
		*/		
		float total = 0.0F;
		for(int i=0; i < scores.length; ++i){
			total = total + scores[i];
		}
		float mean = total / scores.length;
		System.out.println("\nTotal is " + total);
		System.out.println("Mean is " + mean);
		
		//Calculate the max value
		int max = scores[0];					// assume the first element is the max
		for(int i=1; i < scores.length; ++i){
			if(scores[i] > max ) {
				max = scores[i];
			}
		}
		System.out.println("Max is " + max);

		//Calculate the min value
		int min = scores[0];					// assume the first element is the min
		for(int i=1; i < scores.length; ++i){
			if(scores[i] < min ) {
				min = scores[i];
			}
		}
		System.out.println("Min is " + min);		
		
	}

}
