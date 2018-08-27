/** 
 *  Demo of 'switch' statements
 *  - fall-through behaviour (unlike if statement)
 *  - byte, char, short, int, enum (since J2SE 5), String (since J2SE 7)
 *  - - can also cast to these (assuming valid cast)
 *  - can't use null as constant
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.flowcontrolexceptions;

public class Switchy {

	public static void main(String[] args) {
		// switch statement has fall-through behaviour (unlike if statement)
		// switch on byte, char, short, int, enum (since J2SE 5), String (since J2SE 7)
		// - can also cast to these (assuming valid cast)
		int num = 10;
		switch (num) {
			case 1: System.out.println("1");
			case 2: {
				//you can put a code block with a case statement
				System.out.println("2");
			}
			default: System.out.println("default");
		}
		
		//switch with Strings can be more complicated, it's case sensitive, and no nulls!
		String result, str = "Case Sensitive".toLowerCase();
		final String newString = "Case Sensitive";
		switch (str) {
			case "" : result = ""; break;
			case "Case SensitivE" : result = "Case SensitivE"; break;
			case "CASE Sensitive" : result = "CASE Sensitive"; break;
			case "case sensitive" : result = "case sensitive"; break;
			case newString : result = "Case Sensitive"; break;
//			case null : result = "null"; //'null' cannot be used as a constant
			default : result = "No match"; break;
		}
		System.out.println(result);

		//switch can take a cast (to a valid datatype) in the switch variable	
		long bigNum = 12;
		switch ((int) bigNum) { //Possible Loss of Precision using cast
			case 12 : result = "12";
		}

		//Recall that char are unsigned int
		char ch = 'A';
		switch(ch) {
			case 12 : {}
		}
	
	}
	
	

}
