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
		Animal fighter2 = new Person("Robert Poulson");
		this.talk(fighter1);
		this.talk(fighter2);
		
		Cat pet = new Cat("Spot");
		Cat pet2 = new Cat("Garfield");
		this.talk(pet);
		this.talk(pet2);
		
		Dog pet3 = new Dog("Scooby");
		Dog pet4 = new Dog("Snoopy");
		this.talk(pet3);
		this.talk(pet4);
		
		Duck pet5 = new Duck("Daffy");
		this.talk(pet5);
		Duck pet6 = new Duck("Donald");
		this.talk(pet6);
		
		this.moveIt(fighter1);	//Person
		this.moveIt(pet2);		//Cat
		this.moveIt(pet4);		//Dog
		this.moveIt(pet6);		//Duck
	
		this.goToSleep(fighter1);
		this.goToSleep(pet2);
		this.goToSleep(pet4);
		this.goToSleep(pet6);
		
	}
	
	// Now let's try some polymorphism
	// Is it a Dog, is it a Cat, wotevs it's an Animal
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
