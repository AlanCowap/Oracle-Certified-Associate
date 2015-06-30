/** 
 *  Class to interact with Phone objects.
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.codechallenge.phone;

public class PhoneApp {

	public static void main(String[] args) {
		//Using individual getters and setters
		Phone s5 = new Phone();
		s5.setManufacturer("Samsung");
		s5.setModel("S5");
		s5.setScreenSize(5.0F);
		s5.setMemoryGB(4.0F);

		System.out.println(s5.getManufacturer());
		System.out.println(s5.getModel());
		System.out.println(s5.getScreenSize());
		System.out.println(s5.getMemoryGB());

		//Using convenience methods
		Phone s6 = new Phone();
		s6.setAll("Samsung", "S6", 6.0F, 8.0F);
		s6.printAll();
		
		Phone x55 = new Phone();
		x55.setAll("HTC", "X55", 5.5F, 5.0F);
		x55.printAll();
		
		//Calculate total screen size for all three devices
		float totalScreenSize = s5.getScreenSize() + s6.getScreenSize() 
									+ x55.getScreenSize();
		System.out.println("Total screensize is " + totalScreenSize + " inches" );
		
		//Calculate total memory for all three devices
		float totalMemoryGB = s5.getMemoryGB() + s6.getMemoryGB() + x55.getMemoryGB();
		System.out.println("Total memory is " + totalMemoryGB + " GB" );
	}

}
