/** 
 *  Simple class representing a SmartTablet.
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.objectoriented;


public class SmartTablet extends SmartDevice{
	private String wifiPassword;
	
	public SmartTablet(String manufacturer, String model, String wifiPassword){
		super(manufacturer, model);
		this.wifiPassword = wifiPassword;
	}
	
	public String toString(){
		return super.toString() + " "+ this.wifiPassword;
	}
}
