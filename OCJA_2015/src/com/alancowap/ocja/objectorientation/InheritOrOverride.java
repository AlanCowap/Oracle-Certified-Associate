/** 
 *  Demo Inheritance, Overriding, shadowing. 
 *  - and access through child classes via static (class), and object references.
 *  - static fields and methods ARE inheritable
 *  - -inherited static fields can shadow a parent static field
 *  - -inherited static methods can shadow parent methods with same signature
 *  Shadowing - reusing a variable name already declared somewhere else (in scope)
 *  See link below to JLS, also note the following from the JLS:
 *  "Fields, methods, and member types of a class type may have the same name,
 *   since they are used in different contexts and are disambiguated by different
 *   lookup procedures (§6.5). However, this is discouraged as a matter of style."
 *   Refer also to com.alancowap.ocja.objectorientation.StaticRef.java
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 * @see https://docs.oracle.com/javase/specs/jls/se7/html/jls-8.html#jls-8.2
 * 
 */
package com.alancowap.ocja.objectorientation;

public class InheritOrOverride {}
/*
Inheritable Override
I O
n n	private
n n	constructor
n n	static init block
n n non-static init block
y n	final field	//can shadow
y n	final method //can't override a final method
y n	static field //can shadow 
y n	static method //can shadow
y n	non-static field //can shadow
y y	non-static method //can override (if not final)

 */

class High{
	//Not inherited
	static {System.out.println("static init block, not inherited");}
	{System.out.println("non-static init block, not inherited");}
	High(){System.out.println("constructor, not inherited");}
	private String secret = "private, not inherited";
	
	//Inherited, cannot be reassigned/overridden (assuming they are visible)
	final StringBuilder same = new StringBuilder("Final");
	final void finalMethod() {}
	
	//Inherited, cannot be overridden but can be shadowed (assuming they are visible)
	//static field
	static int staticNum = 10;
	//static method
	static void staticMethod() {}
	
	//Inherited, can be overridden (assuming they are visible)
	//non-static field
	int instanceNum = 2;
	//non-static method
	void instanceMethod() {}
	
	
	
}

class Middle extends High{
	static int staticNum = 5; //shadowing
	int instanceNum = 1; //shadowing
	StringBuilder same = new StringBuilder("shadowy");
	
	public void doStuff() {
//		String me = super.str; //No. not visible.
	
		StringBuilder sb = same; //inherited...
		same = new StringBuilder("Cannot reassign"); //No. ..cannot be reassigned
		finalMethod(); //inherited...		
		
	}
	
//	void finalMethod() {}//No. ..cannot be overridden
	static void staticMethod() {}	//shadowing (not overriding)
	void instanceMethod() {} //Overriding.
}