/** 
 *  Demo how to use Command Line Arguments
 *    
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.basics;

class MainArgs{

	public static void main(String[] args){
		System.out.println("MainArgs");
		System.out.println(args);
		System.out.println(args.length);
		//Iterate through Command Line Arguments
		for (String st : args){
			System.out.println(st);
		}
		//Iterate through Command Line Arguments
		for(int i=0; i < args.length; ++i){
			System.out.println(args[i]);
		}
		//Get username and password
		if(args.length == 2){
			System.out.printf("Username is: %s\n", args[0]);
			System.out.printf("Password is: %s\n", "<not displayed>");
		}else{
			System.out.println("Usage is MainArgs @username @password");
		}
	}
}
/*
Write a program that will take up to 10 numbers as command line
 arguments, and display the min, max, mean, and total values.
 You should use floating-point numbers, and arrays (no ArrayList etc.)
 Hint: Refer to the API e.g. Double.parseDouble() for String->double
*/
/*
class MainArgs{
//...
//String args[ ]
//String args[/*Post no-comments*/]

//	public /**/static/**/ void/**/ main/**/(/**/String/**/  [] /* */ args/**/){
//		System.out.println("MainArgs");
//	}
//}

