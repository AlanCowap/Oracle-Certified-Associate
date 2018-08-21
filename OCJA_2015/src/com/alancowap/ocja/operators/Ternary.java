/** 
 *  Demo of Ternary operator (aka Conditional operator) 
 *   - as alternative to if-else statement
 *   - concise use of boolean, and conditional logic
 *   
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.operators;

public class Ternary {

	public static void main(String[] args) {
		//if-else
		int score = 90;
		String result;
		if(score > 39)
			result = "Pass";
		else
			result = "Fail";
//		System.out.println(result);
		
		//ternary equivalent
		String result2 = (score > 39) ? "Pass" : "Fail";
		System.out.println(result +" "+ result2);

		Ternary t = new Ternary();
		for(int i =1; i <20; ++i)
			System.out.println(i +" "+ t.isEven(i));
		
	}

	private boolean isEven(int num) {
		return (num % 2) == 0;
	}
	
	//The isEven() method is concise and readable,
	//The isEvenLongVersion() method is verbose and harder to read, avoid those pitfalls
	private boolean isEvenLongVersion(int num) {
		//can you shorten this code
		boolean result;
		if(num % 2 == 0)
			result = true;
		else result = false;
		
		//this code hurts, so don't do it
		if (result == true)
			return true;
		else
			return false;				
	}
		
}