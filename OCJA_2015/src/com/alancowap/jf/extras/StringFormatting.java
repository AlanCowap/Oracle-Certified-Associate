/** 
 *  Demo of String Formatting
 *  - System.out.printf()
 *  - String.format() static method
 *  - Escape sequences: %d, %n, %s, %f, %n, %b, %t
 *  - - the escape sequences apply to printf and format, but do NOT apply to println.
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.jf.extras;

import java.util.Date;

public class StringFormatting {
	public static void main(String[] args) {
		//String formatting using printf()
		
		// %s String
		String creator1 = "James Gosling";
		String creator2 = "Bill Joy";		
		System.out.println(creator1 + " and " + creator2 + " created Java");
		System.out.printf("%s and %s created Java%n", creator1, creator2);		
		String sentence = String.format("%s and %s created Java%n", creator1, creator2);
		System.out.println(sentence);
		
		// %d decimal integer
		String student = "Frank";
		int percent = 100, score = 92;
		System.out.printf("%s scored %d out of %d in his C++ exam%n", student, score, percent);

		// %f decimal floating point
		String pundit = "Pol";
		float correct = 33.123456789F;
		System.out.printf("%s was correct %f percent of the time%n", pundit, correct);
		System.out.printf("%s was correct %2.4f percent of the time%n", pundit, correct);
		
		// %n line separator (new line)
		System.out.println("Every %n word %n is %n special%n"); //literals in println!
		System.out.printf("Every %n word %n is %n special%n");
		
		// %b Boolean
		boolean right = true;
		System.out.printf("What's null is %b %n", null);
		System.out.printf("What's true is %b and what's false is %b %n", right, 5);
		// CAUTION: any non-Boolean value will return 'true'
		
		// %t Time conversion characters
		//Formatting date in String format method - date in dd/mm/yy
		String dateString = "No date set";
		dateString = String.format("Today is %tD", new Date());
        System.out.println(dateString);      
        Date today = new Date();
        System.out.printf("Today in dd/mm/yy format %td/%tm/%ty %n", today,today,today );

        System.out.printf("Today in Day dd/mm/yyyy format %tA %td/%tm/%tY %n", today,today,today,today );

		
	}


}
