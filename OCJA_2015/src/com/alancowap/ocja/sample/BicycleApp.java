/** 
 *  Simple class to interact with Bicycle objects.
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.sample;

public class BicycleApp {
	public static void main(String[] args) {
		Bicycle myBike = new Bicycle();
		System.out.println( myBike.getNumGears() );//5
		myBike.setNumGears(10);
		System.out.println(myBike.getNumGears() );//10
	}
}
