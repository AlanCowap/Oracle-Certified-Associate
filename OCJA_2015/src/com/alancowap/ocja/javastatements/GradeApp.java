/** 
 *  Class to demonstrate if, else-if, else statements
 *  Also uses Scanner class to get user input
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
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
		

		
		// determine a grade
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
	}

}
