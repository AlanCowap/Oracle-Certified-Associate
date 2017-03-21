/** 
 *  Various interesting features of Java
 *   - main method in abstract class
 *   - break to label within an if statement, goto, StringBuilder mutability,
 *   - String.replace() inconsistent behaviour between overloaded methods: char vs CharSequence
 *   - implicit conversion of primitives by assignment and compound assignment operators, compiler range checking. 
 *  Based on original code from David Mackessy 
 * 
 * @author David Mackessy, modified by Alan Cowap
 * @version 1.0  Initial revision
 * @dependencies None
 *  
 */
package com.alancowap.ocja.submitted;

/*
* valid compile & run in abstract class
*
*/
/*
public abstract class InterestingJava{

	public static void main(String[] args){
		System.out.println("i am in an abstract class");				
		someLabel:	//labels can be used in iteration (for, do/while) and decision statements (if, switch)
			if(true){
			someInnerLabel:	//nested labels allowed
				System.out.println("Take a break");
				break someLabel;
			}
		System.out.println("have a kiwi");
		someLabel:
			if(true){
				System.out.println("Take another break");
				break someLabel;
				//goto someLabel; //goto is reserved but not implemented
				//int goto = 5;	// goto is reserved.
			}
	}

}

*/


public class InterestingJava{

	public static void main(String[] args){
		System.out.println("interesting Java");		
	
		//break with a label is allowed in an if/if else statement
		myLabel : 
			if(true){
				break myLabel;
			}

		//StringBuilder: when .reverse() invoked, SB stays reversed, no reassignment needed
		StringBuilder sb = new StringBuilder("string");
		StringBuilder sbReversed = sb.reverse();
		if (sb.equals(sbReversed)) System.out.println("We're the same");
		else System.out.println("We're so different");

		System.out.println(sb);

		//String: overloaded method .replace(x,y) acts differently when passing "s"(CharSequence) or 'c'(chars)
		String myString = "myString";
		//pass strings first & then check equality on objects
		String stringsPassedNoChange = myString.replace("g", "g");	// returns a new String in all cases
		String stringsPassedChange = myString.replace("g", "G");
		System.out.println(myString == stringsPassedNoChange);		// returns false
		System.out.println(myString == stringsPassedChange);		// returns false

		String charsPassedNoChange = myString.replace('g', 'g');	// returns ref to your original string if no change!!
		String charsPassedChange = myString.replace('g', 'G');
		System.out.println(myString == charsPassedNoChange);		// returns true!!
		System.out.println(myString == charsPassedChange );		// returns false

		//final variables must be explicitly initialised either when declared, in constructor or in initialisation block
		//constructors can throw exceptions
		//abstract class methods must be declared abstract explicitly (if they are abstract)

		//compound operators do explicit casts
		byte myByte = 8;	//does implicit conversion if range check is ok
		float myFloat = 4.5f;

		myByte += myFloat;	//equivalent to myByte = (byte) (myByte + myFloat);
		//myByte = (byte) (myByte + myFloat);
		System.out.println("myByte = " + myByte);

	}

}

