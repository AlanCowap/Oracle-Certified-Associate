/** 
 *  Demo use of break statement 
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.javastatements;

public class BreakApp {


	public static void main(String[] args) {
		System.out.println("Let's demo the break statement");

		//print out 1..100
		for(int i=1; i<101; ++i){
			//stop printing at 23
			if(23 == i) {
				System.out.println("Found "+ i );
				break;
			}
			else {
				System.out.println(i);
			}
		}		
	}
}
