/** 
 *  Simple class representing a SmartDevice.
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.objectoriented;


public abstract class SmartDevice {
	private String manufacturer;
	private String model;
	
	protected SmartDevice(){
		this("No Manufacturer","No model");
	}
	
	protected SmartDevice(String manufacturer, String model){
		this.manufacturer = manufacturer;
		this.model = model;
	}
	
	public String toString(){
		return this.manufacturer +" "+ this.model ;
	}
	
}
