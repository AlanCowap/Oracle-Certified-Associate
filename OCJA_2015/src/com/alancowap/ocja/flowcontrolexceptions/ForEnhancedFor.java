/** 
 *  Demo of for, and enhanced for loops
 *  - 'enhanced for' loop, aka 'for in' loop, aka 'for each' loop
 *  - watch for null elements in Arrays (and Collections)
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.flowcontrolexceptions;

public class ForEnhancedFor {

	public static void main(String[] args) {
		//for loop
		int[] arr = {1,2,3};
		for(int j=0; j < arr.length; ++j) {
			System.out.println(j +" "+ arr[j]);
		}
		
		//'enhanced for' loop, aka 'for in' loop, aka 'for each' loop
		for(int j : arr) {
			System.out.println(j);
		}
		
		//watch for null elements in Arrays (and Collections)
		String[] strArr = {"Alice", "Mallory", "Bob", null};
		for(String s : strArr) {
			System.out.println(s);	//prints contents of Array, including null
//			System.out.println(s + " "+ s.length()); //NPE thrown at s.length()
		}
	}

}
