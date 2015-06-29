/** 
 *  Simple class to represent a Bicycle.
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.sample;

public class Bicycle {
	//State
	private int numGears = 5;
	
	//Behaviour
	public int getNumGears(){
		return this.numGears;
	}
	
	public void setNumGears(int newNumGears){
		if(newNumGears < 0 ){
			System.out.println("Pick a valid gear, minimum 0");
			return;
		}
		if(newNumGears > 20 ){
			System.out.println("Pick a valid gear, maximum 20");
			return;
		}
		this.numGears = newNumGears;
	}
	
}
