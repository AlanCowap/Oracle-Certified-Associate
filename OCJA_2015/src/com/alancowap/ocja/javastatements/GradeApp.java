/** 
 *  Class to demonstrate if, else-if, else statements
 *  Demonstrate uise of switch statement
 *  Also uses Scanner class to get user input
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  Initial version
 * @version 1.1  Add switch statement
 * @dependencies None
 *  
 */
package com.alancowap.ocja.javastatements;

import java.util.Scanner;

public class GradeApp {

	public static void main(String[] args) {

		// get a result from the user		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a percentage (0-100) ");
		int result = scan.nextInt(); //assume we get a valid input



		// determine a grade using if
		String grade = "Unknown";

		if(result > 84 ){
			grade = "A";
		}else if(result > 69){
			grade = "B";
		}else if(result > 54){
			grade = "C";
		}else if(result > 39){
			grade = "D";
		}else{
			grade = "Fail";
		}		

		System.out.println("Your grade is " + grade);

		//determine a result using switch
		String resultRange = "Undetermined";
		switch (grade){
			case "A":	resultRange = "85-100"; break;
			case "B":	resultRange = "70-84"; break;
			case "C":	resultRange = "55-69"; break;
			case "D":	resultRange = "40-54"; break;
			default :	resultRange = "fail";
		}
		System.out.println("Your result range is " + resultRange);

	}

}
