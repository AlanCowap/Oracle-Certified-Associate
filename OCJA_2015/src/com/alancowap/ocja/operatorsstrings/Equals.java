/** 
 *  Demo equals() method, incl Wrapper classes
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.operatorsstrings;

public class Equals{
	public static void main(String[] args){
		Integer value1 = new Integer("312");
		Object object1 = new Object();

		System.out.println(value1.equals(object1));
		System.out.println(object1.equals(value1));

		object1 = value1;

		System.out.println(value1.equals(object1));
		System.out.println(object1.equals(value1));

		object1 = new Object();
		Temp t = new Temp();
		System.out.println(t.equals(object1));
		System.out.println(t.equals(value1));

		value1.equals(2);

		Long l = 1234567890123L;

	}
}

class Temp{}
