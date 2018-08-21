/** 
 *  Demo of Equality operators 
 *   - == for primitives and object reference variables 
 *   - == and overriding .equals()
 *   - instanceof operator
 *   
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.operators;

public class Equality {
	public static void main(String[] args) {
		//Primitive equality
		int num = 5, otherNum=6;
		double num2 = 5.0;		
		System.out.println((num == num2) +" "+ (num == otherNum));
		
		//Object equality using == (equality operator)
		Object o = new Object();
		Object p = new Object();
		Object q = p;
		System.out.println((o == p) +" "+ (o == q) +" "+ (p == q));
		
		//Object equality using equals() (where equals() not overridden it's same as ==)
		System.out.println((o.equals(p)) +" "+ (o.equals(q)) +" "+ (p.equals(q)));
		
		//Object equality using equals() (where equals() is overridden)
		Person person1 = new Person("Bill Joy", 30);
		Person person2 = new Person("James Gosling", 35);
		Person person3 = person1;
		System.out.println((person1.equals(person2)) +" "+ person1.equals(person3) +" "+ person2.equals(person3));

		Person person4 = new Person("Bill Joy", 30);
		System.out.println("== "+ (person1 == person4) + " .equals() " + (person1.equals(person4)));
	}	
}

class Person{
	private int age = 0;
	private String name = "";
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Person) {
			Person p = (Person) o;
			//Note that we can access private members of any instance of the same class
			return (this.age == p.age) && (this.name.equals(p.name));			
		}else {		
			return false;
		}
	}
}