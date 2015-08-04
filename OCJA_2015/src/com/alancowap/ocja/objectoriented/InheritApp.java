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
		//Create lots of objects, all extended from Animal
		Person fighter1 = new Person("John Doe");		
		Person fighter2 = new Person("Robert Poulson");
		Cat pet = new Cat("Spot");
		Cat pet2 = new Cat("Garfield");
		Dog pet3 = new Dog("Scooby");
		Dog pet4 = new Dog("Snoopy");
		Duck pet5 = new Duck("Daffy");
		Duck pet6 = new Duck("Donald");

		// Pass references to these objects to methods (which take an Animal reference as argument)
		System.out.println("\nWhat do the Animals say...");
		this.talk(fighter1);
		this.talk(fighter2);		
		this.talk(pet);
		this.talk(pet2);		
		this.talk(pet3);
		this.talk(pet4);		
		this.talk(pet5);
		this.talk(pet6);
		
		System.out.println("\nHow do the Animals move...");
		this.moveIt(fighter1);	//Person
		this.moveIt(pet2);		//Cat
		this.moveIt(pet4);		//Dog
		this.moveIt(pet6);		//Duck
	
		System.out.println("\nHow do the Animals sleep...");
		this.goToSleep(fighter1);
		this.goToSleep(pet2);
		this.goToSleep(pet4);
		this.goToSleep(pet6);
		
	}
	
	// Now let's try some polymorphism
	// Is it a Dog, is it a Cat, ..., wotevs it's an Animal
	
	private void talk(Animal anim){
		anim.makeNoise();
	}
	
	private void moveIt(Animal anim){
		anim.move();
	}

	private void goToSleep(Animal anim){
		anim.sleep();
	}	
	
}
