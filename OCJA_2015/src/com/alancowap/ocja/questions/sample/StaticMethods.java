/** 
 *  Demo that static methods and variables in parent classes can be invoked through child classtypes and object references
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
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
	}

}

class Top{
	static int num = 10;
	static void runMe(){}
}

class Middle extends Top{}

class Bottom extends Middle{}