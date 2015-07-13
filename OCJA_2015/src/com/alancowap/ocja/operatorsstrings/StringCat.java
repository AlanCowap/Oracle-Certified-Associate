/** 
 *  Demo String concatentation.
 *  Demo 'operator overloading' of + operator (numeric addition, string concatenation)
 *  Demonstrate precedence
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.operatorsstrings;


public class StringCat {

	public static void main(String[] args) {
		String name = "Hair" + " Cut";
		int age = 20, numPeople = 5;
		System.out.println(age + numPeople + name);
		System.out.println(age + name + numPeople); 
		System.out.println(name + age + numPeople);

		System.out.println(name + (age * numPeople));

	}

}
