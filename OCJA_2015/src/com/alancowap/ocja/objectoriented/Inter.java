/** 
 *  Demo use of interfaces and class implementing an interface
 *  Show polymorphism through inheritance.
 *  Show how instance variables are bound to the datatype at compiletime
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.objectoriented;
public class Inter{
	public static void main(String[] args){
		Edible e = new Plant();
		e.eat(3 * Edible.NUM_MEALS);
		dinnerTime(new Tulip());
		dinnerTime(new Maple());
		dinnerTime(new Fir());
		dinnerTime(new Pine());
		dinnerTime(new Oak());
		dinnerTime(new Apple());
		dinnerTime(new Orange());
		
		System.out.println("\nWhat about instance variables at runtime?");
		// instance variables are bound at compile-time to the object reference datatype
		Plant p = new Plant();
		Tulip t = new Tulip();
		System.out.println("Plant p is named " + p.name);
		System.out.println("Tulip t is named " + t.name);
		p = t;
		System.out.println("Plant p is now named " + p.name);
		
	}

	private static void dinnerTime(Edible e){
		e.eat((int) (Math.random()*10));
	}

	// Without inheritance and polymorphism I will need multiple versions of each method
	// But with them I can have a single method taking a parent class or interface type.
	// One parameter datatype to rule them all!
/*	private static void dinnerTime(Tulip t){
		t.eat(1);
	}

	private static void dinnerTime(Maple m){
		m.eat(1);
	}

	private static void dinnerTime(Fir f){
		f.eat(1);
	}

	private static void dinnerTime(Pine p){
		p.eat(1);
	}
*/
}

class Plant implements Edible{
	protected String name="Plant"; 
	public void eat(int num){
		System.out.println(name + " is eating " + num);
	}
}

class Tulip extends Plant{protected String name="Tulip";}
class Maple extends Plant{protected String name="Maple";}
class Fir extends Plant{protected String name="Fir";}
class Pine extends Plant{protected String name="Pine";}
class Oak extends Plant{protected String name="Oak";}

class Fruit implements Edible{
	public void eat(int num){
		System.out.println("Fruit is " + num);
	}
}

class Apple extends Fruit{protected String name="Apple";}
class Orange extends Fruit{protected String name="Orange";}