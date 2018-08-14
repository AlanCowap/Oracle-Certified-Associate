/** 
 *  Demo of PassByValue and PassByReference
 *   - primitives are PassByRalue
 *   - non-primitives (object reference variables) are PassByReference (sort of)
 *    - ORVs the memory address of the Object is copied - providing a Reference to the object   
 *   
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.assignments;

public class PassBy {

	public static void main(String[] args) {
		PassBy pb = new PassBy();
		
		//Primitives are Pass by Value
		int num = 5;
		boolean enable = true;
		System.out.println(num +" "+ enable);
		pb.primitives(num, enable); //copies are passed to primitives()
		System.out.println(num +" "+ enable);
		
		//ORVs are Pass by Reference (kind of)
		Person p = new Person();
		p.name = "Bill Joy";
		System.out.println(p.name);
		pb.objects(p);
		System.out.println(p.name);
	}
	
	private void primitives(int num, boolean enable) {
		num = -120;
		enable = false;
		System.out.println(num +" "+ enable);
	}
	
	private void objects(Person p) {
		p.name = "James Gosling";
		System.out.println(p.name);
	}
}

class Person{String name = "No Name";}