/** 
 *  Demo Enumerated types usage
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.classesvariables;

public class Enumerated {

	private enum TrafficColour {RED, AMBER, GREEN}


	public static void main(String[] args) {
		TrafficColour col = TrafficColour.RED;

		if(col == TrafficColour.RED){
			System.out.println("Stop the lights");
		}else if(col == TrafficColour.AMBER){
			System.out.println("Prepare to stop");
		}else{
			System.out.println("If Clear&Safe..");
		}


	}

}
