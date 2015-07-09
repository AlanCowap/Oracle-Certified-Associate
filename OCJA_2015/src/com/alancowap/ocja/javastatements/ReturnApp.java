/** 
 *  Demo return statement
 *  Also object creatino, and method invocation
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.javastatements;

public class ReturnApp {

	public static void main(String[] args) {
		System.out.println("Demo return statement");

		ReturnApp myReturnApp = new ReturnApp();
		System.out.println(myReturnApp.isEven(4));	
		
	}

	public boolean isEven(int num){
		return (num%2 == 0);
	}


}
