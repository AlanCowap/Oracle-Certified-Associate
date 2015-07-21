/** 
 *  Demo Passing Parameters By Reference - using Object Reference Variables
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.methodsscope;


public class ByReferenceApp {

	public static void main(String[] args){
		ByReferenceApp va = new ByReferenceApp();
		Car myCar = new Car();
		System.out.println(myCar.getModel());
		va.changeCar(myCar);
		System.out.println(myCar.getModel());
	}
	private void changeCar(Car car){
		car.setModel("Veyron");
	}

}
