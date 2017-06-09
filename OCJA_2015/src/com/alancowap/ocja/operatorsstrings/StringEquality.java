/** 
 *  Demo String equality using == and .equals
 *  Demo String comparison using .compareTo(String) method of String class
 *  Demo Lexiconographic comparison
 *  Note that (per the API) length of String is only considered when both Strings are identical AND one String is exhausted.
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.operatorsstrings;

public class StringEquality{
	public static void main(String[] args){
		System.out.println("String equality...");

		String str1 = new String("Bill");
		String str2 = new String("Bison");
		String str3 = new String("James");
		String str4 = new String("Billy");
		String str5 = new String("bill");


		//String Equality
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		//String compareTo
		System.out.println("str1.compareTo(str1) " + str1.compareTo(str1));
		System.out.println("str1.compareTo(str2) " + str1.compareTo(str2));
		System.out.println("str1.compareTo(str3) " + str1.compareTo(str3));
		System.out.println("str1.compareTo(str4) " + str1.compareTo(str4));
		System.out.println("str4.compareTo(str1) " + str4.compareTo(str1));
		System.out.println("str2.compareTo(str3) " + str2.compareTo(str3));
		System.out.println("str1.compareTo(str5) " + str1.compareTo(str5));
		

	}
}