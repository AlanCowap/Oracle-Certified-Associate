/** 
 *  Demo java.util.ArrayList
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.arrays;
import java.util.ArrayList;

public class ArrList{
	public static void main(String[] args){
		System.out.println("ArrList");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		//arr.add("hello");
		//arr.add(new Object());
		arr.add(new Integer(2));
		arr.add(2);

		for(int i : arr){
			System.out.println(i);			
		}
	}
}