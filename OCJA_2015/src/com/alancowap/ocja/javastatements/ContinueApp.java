/** 
 *  Demo continue statement
 *   Prettify the output
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.javastatements;

public class ContinueApp {

	public static void main(String[] args) {
		//output the odd numbers in the range 10..100
		for(int i=10, oddCount=0; i<101; ++i){
			if( (i%2) == 0) {	// even numbers
				continue;		// don't execute the lines below, continue with next iteration
			}
			else {				// odd numbers
				//Print a new line, on every 10th odd number
				if( (oddCount % 10) == 0){
					System.out.println("");
				}
				++oddCount;
				System.out.print(i + " ");
			}
		}
	}

}
