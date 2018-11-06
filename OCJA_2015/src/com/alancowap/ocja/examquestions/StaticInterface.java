/** 
 * Static methods in an interface (since Java SE8) and in a class; with the same signature.
 * - Should use Class or Interface name to access static method
 * - can use object reference to access static method in class 
 * - - even if implemented interface has a static method with the same signature
 * - can't use object reference (of interface type) to access static method.
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 * 
 */
package com.alancowap.ocja.examquestions;

public class StaticInterface {

	public static void main(String[] args) {
		Jumper j = new Jumper();
		Staticable.method();	//Staticable
		Jumper.method();		//Jumper
		j.method();				//Jumper
		
		Staticable s = new Jumper();
//		s.method();	//No. reference to static method must be through Interface
		j = (Jumper) s;
		j.method();				//Jumper
	}

}


interface Staticable{
	static void method() {System.out.println("Staticable");};
}

class Jumper implements Staticable{
	static void method() {System.out.println("Jumper");}
}