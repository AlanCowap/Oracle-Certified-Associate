/** 
 *  Demo that static methods and variables in parent classes can be invoked through child classtypes and object references
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0 Initial code  
 * @version 1.1  Demo static call to Parent class method thrgugh a casted child class object reference, thx to Kevin Phair for the suggestion  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.questions.sample;

public class StaticMethods {

	public static void main(String[] args) {
		Top.runMe();
		Middle.runMe();
		Bottom.runMe();
		Bottom.num = 6;

		new Bottom().runMe();
		Bottom b = new Bottom();
		b.runMe();
		b.num = 8;
		
		((Top)b).runMe(); //This will execute runMe() in Top, even if there was another in Bottom
	}

}

class Top{
	static int num = 10;
	static void runMe(){System.out.println("Top");}
}

class Middle extends Top{}

class Bottom extends Middle{
	static void runMe(){System.out.println("Bottom");}
}