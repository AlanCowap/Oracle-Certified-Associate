/** 
 *  Assignment of boolean and Boolean in the conditional clause of an if-statement
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.questions.sample;

public class IfApp{
	boolean instanceVar; //init to false
	static boolean classVar; //init to false

	public static void main(String[] args){
		boolean localVar; //not initialised
		if (localVar = true)
			System.out.println("True");
		
		Boolean localVarWrap; //not initialised
		if (localVarWrap = true)
			System.out.println("True wrap");
	}
}