/** 
 *  Demo of ArrayList
 *  - Remember to import java.util.ArrayList
 *  - ArrayList is empty - not initialised with null elements 
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.stringsarrays;

import java.util.ArrayList;

public class ArrayListApp {

	public static void main(String[] args) {
		ArrayList<String> petList = new ArrayList<String>(3); //specify initial size of ArrayList
		System.out.println(petList + " " + petList.size());
//		petList.add(1, "Fido"); //No, ArrayList is empty, but has size 3.
		petList.add(0, "Fido");
		petList.add(1, "Rover");
		petList.add(2, "Scoobs");
		int i = petList.indexOf("Rover"); // 1
		petList.remove("Rover");
		int j = petList.indexOf("Rover"); // -1 if Element not found. No Rover!
		System.out.println(petList + " " + petList.size());
		System.out.printf("i + j %d %d\n", i, j);
		petList.set(0, "Snoopy"); //replace the Element at the specified index
		
//		petList.add(2, null); //be mindful of null elements in Collections		
		for(String s : petList) {
			System.out.printf("%s says woof, I'm %d long!\n", s, s.length());
		}
		petList.add(1, "Rover");
		//petList.sort(c);//implement comparator as example - see ComparaLambda.java
		
		petList.clear();
		System.out.println("Clear " +petList + " " + petList.size());

//		petList[1] = "Snoopy";
	}

}

class Pet{}