/** 
 * Sample code to demonstrate order of execution of static (variables, init-blocks),
 * non-static (variables, init-blocks), & constructors; in a class hierarchy
 *	
 *  
 * @author Alan Cowap 
 * @version 1.0  Basic class hierarchy: Top - Middle - Bottom
 * @dependencies None
 *  
 */

package com.alancowap.ocja.sample;

public class InitHier{
	public static void main(String[] args) {
		System.out.println("\tStart main");
		Bottom b = new Bottom();
		System.out.println("\tEnd main");
	} 
}

class Top{
	static int topStatNum = Top.doNum(1);
	static int doNum(int num){System.out.println("static Top num " + num); return num;}
	int topInstNum = doInstNum(1);
	int doInstNum(int num){System.out.println("inst Top num " + num); return num;}

	static{System.out.println("static Top");}
	{System.out.println("non-static Top");}
	Top(){System.out.println("construct Top");}
}

class Middle extends Top{
	static int midStatNum = Middle.doNum(1);
	static int doNum(int num){System.out.println("static Middle num " + num); return num;}
	int midInstNum = doMidInstNum(1);
	int doMidInstNum(int num){System.out.println("inst Middle num " + num); return num;}

	static{System.out.println("static Middle");}
	{System.out.println("non-static Middle");}
	Middle(){System.out.println("construct Middle");}
}

class Bottom extends Middle{
	static int botStatNum = Bottom.doNum(1);
	static int doNum(int num){System.out.println("static Bottom num " + num); return num;}
	int botInstNum = doBotInstNum(1);
	int doBotInstNum(int num){System.out.println("inst Bottom num " + num); return num;}

	static{System.out.println("static Bottom");}
	{System.out.println("non-static Bottom");}
	Bottom(){System.out.println("construct Bottom");}
}