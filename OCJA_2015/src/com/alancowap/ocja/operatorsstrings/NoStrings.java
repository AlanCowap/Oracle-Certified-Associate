/** 
 *  Demo String comparison
 *   
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.operatorsstrings;

public class NoStrings {

	/**
	 * @param args String[] not used
	 */
	public static void main(String[] args) {
		System.out.println("~~~ No strings App ~~~");
		String choice = "2";
		
//		while (choice < 4){}	//You can't do that because String and int can't be compared directly
								//	(int is a primitive and has implementation for the Comparable interface)
		while(Integer.parseInt(choice) < 4){
			System.out.println("No string comparison, but ints are good ");
			int thisChoice = Integer.parseInt(choice) + 1; 
			choice = String.valueOf(thisChoice);
		}

		choice = "2";
		String delimiter = "4";
//		while (choice < delimiter){}	//You can't do that either, String implements the Comparable<T> interface so...
		
		while (choice.compareTo(delimiter) < 0){
			System.out.println("Nothing CompareTo You :)");
			int thisChoice = Integer.parseInt(choice) + 1; 
			choice = String.valueOf(thisChoice);
		}
		
	}

}
