/** 
 *  Demo Passing Parameters By Value - using Primitive variables
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.methodsscope;

class ByValueApp{
	
	public static void main(String[] args){
		int num = 0;
		ByValueApp ba = new ByValueApp();
		System.out.println("Main num " + num);	// 0
		ba.changeNumber(num);
		System.out.println("Main num " + num); 	// 0
	}
	
	private void changeNumber(int number){
		System.out.println("Method num " + number); 	// 0
		++number;
		System.out.println("Method num " + number); 	// 1
	}
}

