/** 
 *  Demo inheritance, polymorphism.
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
		Person fighter2 = new Person("Robert Poulson");
		this.talk(fighter1);
		this.talk(fighter2);
		
		Cat pet = new Cat("Spot");
		Cat pet2 = new Cat("Garfield");
		this.talk(pet);
		this.talk(pet2);
	}
	
	private void talk(Person fighter){
		fighter.makeNoise();
	}
	
	private void talk(Cat pet){
		pet.makeNoise();
	}
	
}
