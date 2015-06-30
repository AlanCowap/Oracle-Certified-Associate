/** 
 *  Simple class definition.
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.sample;

public class Helicopter {

	//State
	private String purpose; //transport, medivac, attack, recon 
	private int numPassengers;
	private int numCrew;
	private double maxAltitudeInFeet;
	private double currentAltitude;
	
	//Behaviour
	
	/**
	 * 
	 * @param newAltitude new Altitude in feet
	 */
	public void setCurrentAltitude(double newAltitude){
		this.currentAltitude = newAltitude;
	}
	
	public double getCurrentAltitude(){
		return this.currentAltitude;
	}
}
