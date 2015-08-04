/** 
 *  Demo inheritance.
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.objectoriented;


public class InheritApp {


	public static void main(String[] args) {
		InheritApp ia = new InheritApp();
		ia.startProgram();
	}

	private void startProgram() {		
		Person fighter1 = new Person("John Doe");
		System.out.println(fighter1);
		Person fighter2 = new Person("Robert Poulson");
		System.out.println(fighter2);
		fighter2.makeNoise();
	}
	
	
	

}
