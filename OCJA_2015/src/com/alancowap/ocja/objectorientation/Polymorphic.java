/** 
 *  Demo of Polymorphism
 *  - polymorphic references for classess and interfaces
 *  - IS-A test
 *  - Compiler looks at declared type of variable
 *  - Runtime dynamically uses object at runtime for instance methods. 
 *   
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.objectorientation;

public class Polymorphic {
	
	public static void main(String[] args) {
		Polymorphic p = new Polymorphic();
		Vehicle v = new Vehicle();
		Car c = new Car();		
		p.useVehicle(v);
		p.useVehicle(c);
		
		//Polymorphic reference variable
		Vehicle veh = new Car();
		veh = new MotorBike();
		veh = new Vehicle();
//		veh = new Object(); //can't do this
		veh.drive();
		
		Object o = new Car(); //polymorphic reference - use IS-A test
//		o.drive(); //can't do this, Object has no drive() method
		
		
		//Polymorphic reference to an Interface type
		Driveable d = new Car();
//		d = "I am not a Drivable"; //can't do this
		
		p.driveIt(d);
		p.driveIt(new Car());
		p.driveIt(new MotorBike());
		p.driveIt(new Vehicle());
//		p.driveIt(new Driveable()); //can't do this, can't instantiate an Interface		
		
		p.driveIt(new GolfBall());
		
	}
	
	public void useVehicle(Vehicle v) { //can take a ref to a Vehicle or any subclass of Vehicle
		v.drive();
	}
	
	public void driveIt(Driveable d) {
		d.drive();
	}
		
}


class Vehicle implements Driveable{public void drive() {System.out.println("Vehicle");}}
class Car extends Vehicle{public void drive() {System.out.println("Car");}}
class MotorBike extends Vehicle{public void drive() {System.out.println("MotorBike");}}

abstract interface Driveable{
	public abstract void drive(); 
}

class GolfBall implements Driveable{
	public void drive() {
		System.out.println("GolfBall");		
	}	
}
