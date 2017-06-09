/** 
 *  Demo arrays - Declaration, Construction, Initialization
 *  
 *  
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.arrays;

public class Arr{
	public static void main(String[] args){
		System.out.println("Arrrrggghhhh");
		int[] arr = new int[8];
		int count = 0;
		for(int i : arr){			
			//i = i+1;
			//arr[i] = i+1;
			arr[count] = count++;
		}
		for(int i : arr){			
			System.out.println(i);
		}
	}
}