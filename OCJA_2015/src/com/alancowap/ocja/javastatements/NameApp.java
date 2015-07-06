/** 
 *  Simple class to demonstrate for-loop.
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.javastatements;


public class NameApp {


	public static void main(String[] args) {
		
		//For loop
		for(int i=0; i < 100; ++i){
			System.out.println(i + "Alan");
		}

		//Enhanced For loop
		String[] nobelNames = {"Einstein", "Feynman", "Heisenberg", "Schrödinger", "Bohr"};
		for(String s : nobelNames){
			System.out.print(s);
		}
		
	}

}
