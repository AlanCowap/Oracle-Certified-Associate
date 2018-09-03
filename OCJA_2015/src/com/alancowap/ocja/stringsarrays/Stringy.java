/** 
 *  Demo of Strings
 *  - Strings are immutable
 *  - String literals are stored in the String Constant Pool
 *  - Strings created with 'new' are stored on the Heap
 *  - Difference between object equality using ==, and meaningful equivalence using .equals()
 *  - intern() method checks if a String is in the SCP, if not adds it, returns ref to String
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */

package com.alancowap.ocja.stringsarrays;

public class Stringy {

	public static void main(String[] args) {
		System.out.println("Strings");
		
		//Strings are immutable, need to reassign ORVs as necessary
		String immutable = "Constant";
		immutable.concat("Change"); //no assignment, so no reference to new String
		System.out.println(immutable);
		immutable = immutable.concat("Change"); //assignment, so reference to new String
		System.out.println(immutable);

		//you can do 'valid' assignments in a println
		System.out.println(immutable = immutable.concat("Forever"));
		System.out.println(immutable);

		//Strings and Memory, String literals go in the SCP (String Constant Pool)
		String str = "Bill";
		String str2 = "Bill";
		System.out.println(str.equals(str2)); // true
		System.out.println(str == str2); // true - because String literals are in SCP
		System.out.println("frank" == "frank"); //true
		System.out.println((str == "Bill") && ("Bill" == str2)); //true
		System.out.println();
		
		//Strings can also go on the Heap, use 'new'
		String str3 = new String("Bill");
		String str4 = new String("Bill");
		System.out.println(str3.equals(str4)); // true
		System.out.println(str3 == str4); // false, new Strings() go on the Heap
		System.out.println(new String("frank") == new String("frank")); // false
		System.out.println(new String("frank") == "frank"); // false
		System.out.println(new String("frank").equals("frank")); // true
		
		//intern a String to put it in the SCP (if it's not already there)
		String author = "Bill Joy";		
		String name = new String("Bill Joy");
		String nameInterned = name.intern();
		System.out.println(name == nameInterned); //false
		System.out.println(author == nameInterned); //true
		System.out.println(name.toString() == nameInterned.toString()); //false (still)
		
		//substring
		String full = "O commemorate me where there is water.";
		String inde = "01234567890123456789012345678901234567";
		String sub = full.substring(2);
		String subsub = sub.substring(7,12);
		System.out.println(inde + "\n"+ full + "\n" + sub +"\n"+ subsub );
		
	}

}
