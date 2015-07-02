/** 
 *  Simple class to demo pre and post increment and decrement operators (++, --)
 *  Demo use of "if" statement
 *  Show how to use Scanner class to get user input from the command line
 *  
 *  Improve this program using if - else if, rather than multiple if statements
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.javastatements;

import java.util.Scanner;

public class StateApp {

	public static void main(String[] args) {
		int age = 1;
		System.out.println("Initial age is " + age);
		
		// Increment
		age++;
		System.out.println("Post incremented age is " + age);		
		++age;
		System.out.println("Pre incremented age is " + age);		
		
		// Decrement
		age--;
		System.out.println("Post decremented age is " + age);		
		--age;
		System.out.println("Pre decremented age is " + age);		
		
		// Conditional statement - if
		if(age > 17){
			System.out.println("Welcome!");
		}
		
		// Get user input
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Enter name ");
		System.out.println("2. Enter age ");
		System.out.println("3. Quit ");
		System.out.print("Please choose> ");
		int userChoice = scan.nextInt();
		System.out.println("You chose " + userChoice);
	
		//Evaluate user choice		
		if(1 == userChoice){
			System.out.println("You want to Enter name");
		}
		if(2 == userChoice){
			System.out.println("You want to Enter age");
		}
		if(3 == userChoice){
			System.out.println("You want to Exit");
		}

		
	}

}
