/** 
 *  Demo Error Handling - create and recover from a StackOverflowError 
 *  
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.exceptions;

public class Stacko{
	private static int methodCounter = 0;
	public static void main(String[] args){
		System.out.println("Stackoverflow...");
		try{
			new Stacko().method1();
		}catch(StackOverflowError soe){
			System.out.printf("The Stackoverfloweth...%d", methodCounter);
		}
	}

	private void method1(){++methodCounter; method2();}
	private void method2(){++methodCounter; method1();}
}