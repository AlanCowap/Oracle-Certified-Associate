/** 
 *  Demo inheritance, polymorphism
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.objectoriented;

import java.util.ArrayList;

public class SmartApp {

	public static void main(String[] args) {
		System.out.println("Hello SmartApp");
		
		ArrayList<SmartDevice> al = new ArrayList<SmartDevice>();
		al.add(new SmartPhone("Samsung","S6","555-123456"));
		al.add(new SmartTablet("Samsung", "Tab4", "tango"));
		al.add(new SmartPhone("Samsung","S6","555-123456"));
		al.add(new SmartTablet("Samsung", "Tab4", "tango"));
		al.add(new SmartPhone("Samsung","S6","555-123456"));
		al.add(new SmartTablet("Samsung", "Tab4", "tango"));
		al.add(new SmartPhone("Samsung","S6","555-123456"));
		al.add(new SmartTablet("Samsung", "Tab4", "tango"));
		al.add(new SmartPhone("Samsung","S6","555-123456"));
		al.add(new SmartTablet("Samsung", "Tab4", "tango"));
		
		for(SmartDevice sd : al){
			System.out.println(sd);
		}
		
	}

}
