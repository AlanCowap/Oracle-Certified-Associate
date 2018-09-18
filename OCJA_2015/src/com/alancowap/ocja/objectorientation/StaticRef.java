/** 
 *  Demo references to static fields & methods 
 *  - and access through child classes via static (class), and object references.
 *  - static fields and methods ARE inheritable
 *  - -inherited static fields can shadow a parent static field
 *  - -inherited static methods can shadow parent methods with same signature
 *  Shadowing - reusing a variable name already declared somewhere else (in scope)
 *  See link below to JLS, also note the following from the JLS:
 *  "Fields, methods, and member types of a class type may have the same name,
 *   since they are used in different contexts and are disambiguated by different
 *   lookup procedures (§6.5). However, this is discouraged as a matter of style."
 *   Refer also to com.alancowap.ocja.objectorientation.InheritOrOverride.java
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 * @see https://docs.oracle.com/javase/specs/jls/se7/html/jls-8.html#jls-8.2
 * 
 */
package com.alancowap.ocja.objectorientation;

public class StaticRef {
	public static void main(String[] args) {
		//static fields
		System.out.println(Base.str);
		System.out.println(Derived.str); //Inheritance
		System.out.println(DerivedDerived.str); //Shadowing
		System.out.println(new Base().str); //Bad practice, but legal syntax
		System.out.println(new Derived().str); //Inheritance
		System.out.println(new DerivedDerived().str); //Shadowing
		
		//static methods
		Base.sayHello();
		Derived.sayHello(); //Inheritance
		DerivedDerived.sayHello(); //Shadowing (not overriding)
		new Base().sayHello(); //Bad practice, but legal syntax
		new Derived().sayHello(); //Inheritance
		new DerivedDerived().sayHello(); //Shadowing (not overriding).
	}
}


class Base{
	static String str = "Base field";
	static void sayHello() {System.out.println("Base method");}
}

class Derived extends Base{}

class DerivedDerived extends Derived{
static String str = "DerivedDerived field"; //Shadowing
	static void sayHello() {
		System.out.println("DerivedDerived method"); //Shadowing (not overriding)
	}
}

