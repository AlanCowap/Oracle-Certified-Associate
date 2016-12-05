/** 
 *  Demo abstract class, abstract method
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.objectoriented;
abstract class Device{
	protected int serialNumber = 0;
	public abstract void switchOn();
	public void vibrate(){System.out.println("vibrate");}
}

class Phone extends Device{
	public void switchOn(){
		System.out.println("Phone switch on");
	}
}

class Tablet extends Device{
	public void switchOn(){
		System.out.println("Tablet switch on");
	}
}