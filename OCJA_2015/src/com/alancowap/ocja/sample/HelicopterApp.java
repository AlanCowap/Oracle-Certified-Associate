/** 
 *  A class to interact with Helicopters.
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.sample;


public class HelicopterApp {
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		
		Helicopter chopper = new Helicopter();
		System.out.println("Current altitude (feet) " + chopper.getCurrentAltitude() );
		chopper.setCurrentAltitude(1000.0D);
		System.out.println("Current altitude (feet) " + chopper.getCurrentAltitude() );
		System.out.println( chopper.getCurrentAltitudeInMeters() );
	}

}
