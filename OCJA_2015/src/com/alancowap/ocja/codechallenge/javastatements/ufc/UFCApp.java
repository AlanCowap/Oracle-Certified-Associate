/** 
 *  Class to satisfy code challenge requirements (see separate specification)
 *  User enters weight in lbs or kg, and are told which weight division they are in
 *  Requires use of if - else if - else 
 *  
 *  Apologies to physicists for using "weight" instead of "mass" :^)
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.codechallenge.javastatements.ufc;

import java.util.Scanner;

public class UFCApp {

	private static final float KG_TO_POUNDS = 2.20462F;

	public static void main(String[] args) {
		System.out.println("Welcome to the UFC Weight Classification App");
		//Display main menu and get user input (use kg or lbs)
		System.out.println("1. Enter weight in kg");
		System.out.println("2. Enter weight in lbs");
		System.out.print("Please select an option> ");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();

		// assume we're using kg
		boolean usingKg = true;
		String msg = "kg";
		// but IF we're using lbs
		if( choice == 2 ){
			usingKg = false;
			msg = "lbs";
		}

		//Prompt user to enter weight, convert to lbs inf necessary
		System.out.print("\nThank you. Please enter your weight in " + msg + " > ");		
		float weight = scan.nextFloat();
		if(usingKg){
			weight = weight * KG_TO_POUNDS;	//convert kg to lbs
		}		

		String output = "No output";
		//Determine appropriate weight division using kg
		if(weight < 145 || weight > 265){
			output = "Sorry you are not eligible to fight";
		}else if(weight > 205){
			output = "Heavyweight";
		}else if(weight > 185){
			output = "Light Heavyweight";
		}else if(weight > 170){
			output = "Middleweight";
		}else if(weight > 155){
			output = "Welterweight";
		}else if(weight > 144){
			output = "Lightweight";
		}

		//Output result
		System.out.println(output);

	}

}
