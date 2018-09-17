/** 
 *  Demo initialization blocks, constructors 
 *  - static and non-static initialization blocks
 *  - single classes and order of execution of init blocks and constructors
 *  -  and initialisation of class variables and instance variables.
 *  Code blocks and empty statements
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 * @see com.alancowap.ocja.sample.InitHier
 *  
 */
package com.alancowap.ocja.objectorientation;

public class InitializationSingle {
	private static int num = InitializationSingle.classVariableInit();
	static {System.out.println("static init block");}
	private int numnum = InitializationSingle.objectVariableInit();
	{System.out.println("non static init block");}
	
	public InitializationSingle() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main (static)");
		System.out.println("~~Everything above is static. Everything below is non-static.");
		new InitializationSingle();
		
		{System.out.println("Just a code block");}
		{}	//you can have an empty code block
		;	// you can have an empty expression		
		{{{{}}}}{};;;{;;;}	//you can have lots of both
		
		for(int i=0; i <10; ++i);	//do the "empty expression" 10 times
		
	}
	
	private static int classVariableInit() {
		System.out.println("classVariableInit");
		return 42;
	}
	private static int objectVariableInit() {
		System.out.println("objectVariableInit");
		return 0;
	}
	
}

//Output:
//classVariableInit
//static init block
//Main (static)
//~~Everything above is static. Everything below is non-static.
//objectVariableInit
//non static init block
//Constructor
//Just a code block