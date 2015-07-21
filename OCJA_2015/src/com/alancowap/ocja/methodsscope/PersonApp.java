/** 
 *  Class to interact with some Person objects.
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.methodsscope;


public class PersonApp {

	public static void main(String[] args) {
		Person me = new Person("Sam", 0);
		Person you = new Person();
		
		me.setAge(21);
		you.setAge(100);
		
		me.setName("Alice");
		you.setName("Bob");
		
		System.out.println(me.getName() +" "+ me.getAge());
		System.out.println(you.getName() +" "+ you.getAge());
	}

}
