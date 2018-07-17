/** 
 *  Demo initialization blocks, constructors 
 *  - static and non-static initialization blocks
 *  - single classes and order of execution of init blocks and constructors 
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
	static {System.out.println("static init");}
	{System.out.println("non static init");}
	
	public InitializationSingle() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main");
		new InitializationSingle();
		
		{System.out.println("Just a code block");}
		{}	//you can have an empty code block
		;	// you can have an empty expression		
		{{{{}}}}{};;;{;;;}	//you can have lots of both
		
		for(int i=0; i <10; ++i);	//do the "empty expression" 10 times
		
	}
	
}

//Output:
//static init
//Main
//non static init
//Constructor
//Just a code block
