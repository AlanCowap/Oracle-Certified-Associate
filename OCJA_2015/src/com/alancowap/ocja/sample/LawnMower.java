/** 
 *  Simple class to describe a LawnMower
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.sample;


public class LawnMower {
	//State
	private boolean engineOn = false;
	private enum EngineType{PETROL, ELECTRIC, HYBRID, NONE }
	private String colour;
	
	//Behaviour
	public void turnEngineOn(){
		System.out.println("Turning engine on...");
		this.engineOn = true;
	}
	
	public void turnEngineOff(){
		System.out.println("Turning engine off...");
		this.engineOn = false;
	}
	
	public boolean isEngineOn(){
		return this.engineOn;
	}
	
}
