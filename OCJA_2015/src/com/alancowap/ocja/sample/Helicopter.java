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
	private String purpose; //transport, medevac, attack, recon 
	private int numPassengers;
	private int numCrew;
	private double maxAltitudeInFeet;
	private double currentAltitude;
	
	private static final double FEET_TO_METERS = 3.33D;
	
	//Behaviour
	
	/**
	 * Sets the current altitude of the Helicopter
	 * 
	 * @param newAltitude new Altitude in feet
	 */
	public void setCurrentAltitude(double newAltitude){
		this.currentAltitude = newAltitude;
	}
	
	/**
	 * 
	 * @deprecated Please use getCurrentAltitudeInFeet
	 * @return
	 */
	public double getCurrentAltitude(){
		return this.getCurrentAltitudeInFeet();
	}
	
	public double getCurrentAltitudeInFeet(){
		return this.currentAltitude;
	}
	
	
	public double getCurrentAltitudeInMeters(){
		return (this.getCurrentAltitudeInFeet() / FEET_TO_METERS);
	}
	
	
}
