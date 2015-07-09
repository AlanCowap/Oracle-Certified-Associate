/** 
 *  Demo Labelled statements, with continue and break
 *  Labels must have valid identifier names, and be followed by a colon :
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.javastatements;

public class LabelApp {

	public static void main(String[] args) {
		
		System.out.println("Example 1 : break with label");
		boolean isTrue = true;		
		outer:		//this is a label, note the colon. 
		for(int i=0; i < 5; ++i){
			while(isTrue){
				System.out.println("Hello");
				break outer;
			}//end inner while loop
			System.out.println("Outer loop");	//won't be reached			
		}
		System.out.println("Goodbye");
				
		
		System.out.println("\nExample 2 : continue with label");
		outer:		//this is a label, note the colon. 
		for(int i=0; i < 5; ++i){
			for(int j=0; j < 5; ++j){
				System.out.println("Hello");
				continue outer;
			}//end inner for loop
			System.out.println("outer");	//won't be reached
		}
		System.out.println("Goodbye");
			
				
	}

}

/*

This program gives the following output:
Example 1 : break with label
Hello
Goodbye

Example 2 : continue with label
Hello
Hello
Hello
Hello
Hello
Goodbye

*/