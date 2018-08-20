/** 
 *  Demo of Primitive Casting, Underscores, Literals.
 *  Underscores introduced in Java 7 
 *  - underscores must be between digits
 *  Literals
 *  - binary literals introduced in Java 7
 *  Casting
 *   - primitives, implicit & explicit (widening & narrowing)
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.assignments;

public class Primitives {
	//multiple inline declarations with local variables vs instance variables
	int x, y=x+1; //Yes. x is initialised (instance variable)
	static int a, b=a+1; //Yes. x is initialised (class/static variable)
	
	public static void main(String[] args) {
		Primitives prim = new Primitives();
		prim.underscores();
		
		//Be mindful with implicit casting
		char ch = (char) -65460;
		int num = ch;
		System.out.println("Char is " + ch + "\nNum is " + num);
		
		//implicit casting and range-checking
		byte b=127;
//		byte c=128; //No. 128 is outside range of byte so no implicit cast
		
		//multiple inline declarations with local variables vs instance variables
//		int x, y=x+1; //No. x is not initialised (local variable)
		
		//Max digits in an octal literal
		long octMax = 01_7777777_7777777_7777777L; //Oops! What happened the 21 digit octal limit
		long octMaxDigits =01000000_0000000_0000000_1L;
		System.out.println("Max octal long is " + Long.toOctalString((Long.MAX_VALUE)));
		System.out.println("octMax is " + octMax);
	}
	
	
	
	public void underscores() {
		//since Java 7 int literals can have underscores
		int num = 1__________7; //you can have multiple underscores
		
		int oct = 0_10;		//octal 10 equals decimal 8
		System.out.println("oct is " + oct);

//		int hex = 0X_7;		//not allowed - underscores must be between numbers
		int hex2 = 0X000000F_10;
		System.out.println("hex2 is " + hex2);
//		int bin = 0B_01;	//not allowed - underscores must be between numbers
		
		//can't have underscore at beginning or end of a number
		int _123 = 10; //valid identifier
//		int begin = _124;	//not a valid literal
//		int end = 123_;	//not a valid literal
		
		//can't have underscore adjacent to a decimal point
//		double pre = 123_.45;
//		double post = 123._45;
		//can't have underscore at start/end of literal
//		double end = 123.45_;
//		double start = _123.45;

//		long preEnd = 123_L;
		
	}
}
