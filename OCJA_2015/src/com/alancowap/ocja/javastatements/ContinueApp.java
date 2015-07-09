/** 
 *  Demo continue statement
 *  
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
		for(int i=10; i<101; ++i){
			if((i%2)==0) {continue;}
			else {System.out.println(i);}
		}
	}

}
