/** 
 *  Class definition for Phone.
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.codechallenge.phone;


public class Phone {
	//State
	private String manufacturer;
	private String model;
	private float screenSize;
	private float memoryGB;
	
	//Behaviour
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public float getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(float screenSize) {
		this.screenSize = screenSize;
	}
	public float getMemoryGB() {
		return memoryGB;
	}
	public void setMemoryGB(float memoryGB) {
		this.memoryGB = memoryGB;
	}
	
	public void setAll(String manufacturer, String model, float screenSize, float memoryGB ){
		this.setManufacturer(manufacturer);
		this.setModel(model);
		this.setScreenSize(screenSize);
		this.setMemoryGB(memoryGB);
	}
	
	public void printAll(){
		String output = this.getManufacturer() + " ";
		output += this.getModel() + " ";
		output += this.getScreenSize() + " ";
		output += this.getMemoryGB();
		System.out.println(output);
	}
	
	
}
