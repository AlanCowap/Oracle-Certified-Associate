/** 
 *  Simple class to interact with LawnMower objects.
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.sample;


public class LawnMowerApp {


	public static void main(String[] args) {
		LawnMower lawnMower = new LawnMower();		
		System.out.println("LawnMower engine on? " + lawnMower.isEngineOn());
		lawnMower.turnEngineOn();
		System.out.println("LawnMower engine on? " + lawnMower.isEngineOn());
		lawnMower.turnEngineOff();
		System.out.println("LawnMower engine on? " + lawnMower.isEngineOn());
	}

}
