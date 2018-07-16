/** 
 *  Demo of Constructor Chaining, this(), super()
 *  - no-args constructor
 *  - implicit calls to super()
 *  - explicit calls to this() and super()
 *  -  
 *   
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.objectorientation;

public class Constructors {

	Constructors(){}			//overloaded constructor
	Constructors(String name){}	//overloaded constructor	
	
	public static void main(String[] args) {
//		new Animal();
		new Dog();
	}
	
}


class Animal{
	protected String name;
	Animal(){this(""); System.out.println("Animal constructor - no args");}
	Animal(String name){System.out.println("Animal constructor - args");}
}

class Mammal extends Animal{
	protected String owner;	
	Mammal(){System.out.println("Mammal constructor - no args");}	
	
	Mammal(String name){
//		super(owner + name); //can't access instance members until after super constructor
		System.out.println(owner); //can access instance members now - super is finished
		System.out.println("Mammal constructor");
	}
	void Mammal(){} //this is not a constructor, it's a poorly named method
}

class Dog extends Mammal{
	Dog(){System.out.println("Dog constructor - no args");}
}