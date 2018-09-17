/** 
 *  Demo initialization blocks, constructors 
 *  - static and non-static variables
 *  - static and non-static initialization blocks
 *  - single classes and order of execution of variables, init blocks, and constructors.
 *  - Order of execution (for a single class. class hierarchies add to this):
 *  - -static variables & static init blocks: in order they are written
 *  - -static method (main) if running a program
 *  - +Then, if an object is created
 *  - -non-static variables & non-static init blocks: in order they are written
 *  - -constructor
 *  - -non-static method (if one invoked)
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
	private static int num = InitializationSingle.classVariableInit(42);
	static {System.out.println("static init block");}
	private static int num2 = InitializationSingle.classVariableInit(43);
	private int numnum = InitializationSingle.objectVariableInit(8);
	{System.out.println("non static init block");}
	private int numnum2 = InitializationSingle.objectVariableInit(9);
	
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
	
	private static int classVariableInit(int num) {
		System.out.println("classVariableInit " + num);
		return num;
	}
	private static int objectVariableInit(int num) {
		System.out.println("objectVariableInit " + num);
		return num;
	}
	
}

//Output:
//classVariableInit 42
//static init block
//classVariableInit 43
//Main (static)
//~~Everything above is static. Everything below is non-static.
//objectVariableInit 8
//non static init block
//objectVariableInit 9
//Constructor
//Just a code block