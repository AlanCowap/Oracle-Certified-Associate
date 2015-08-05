/** 
 *  Simple class representing a SmartPhone.
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.objectoriented;


public class SmartPhone extends SmartDevice{
	private String phoneNumber;
	
	public SmartPhone(String manufacturer, String model, String phoneNumber){
		super(manufacturer, model);
		this.phoneNumber = phoneNumber;
	}
	
	public String toString(){
		return super.toString() + " "+ this.phoneNumber;
	}
}
