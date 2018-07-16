/** 
 *  Demo of implementing interfaces - including default and static methods
 *  Note since Java 8 Interfaces can have default, and static methods.
 *   
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.accesscontrol;

public class Implementor implements Demoable{
	public void method() {}
	public void sameMethod() {}
	
	private void doStuff() {
		defMethod();
//		statMethod(); //not inherited from interface because it's static
		Demoable.statMethod();
	}
	
	public static void main(String[] args) {
		new Implementor().doStuff();
	}

}

class NonImplementor{
	private void doStuff() {
		Demoable.statMethod();//static method, access it through Interface
	}
}

abstract interface Demoable{ 		//interfaces are abstract by default
	
	//'constants' are public static final by default
	public static final int SAME = 100;	
	int SAME_AS = 100;
	
	//methods are public and abstract by default
	public abstract void method();	
	void sameMethod();

	//Since Java 8 we can have a default method
	default void defMethod() {System.out.println("Default method");}
	
	//Since Java 8 we can have a static method
	static void statMethod() {System.out.println("Static method");}
}