/** 
 *  Demo of Comparator implementation using Lambda expression
 *  - here we use a Lambda (introduced in Java 8) instead of an Anonymous Inner Class (AIC).
 *  - Lambdas are useful for implementing e.g. a single method from an interface
 *  - e.g. java.util.Comparator interface defines a compare method 
 *  - - [Ref: https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html]
 *  - - We can implement the compare method using a Lambda expression.
 *  Note: This code is is more suited to 1Z0-809 Oracle Certified Professional. 
 *        The 1Z0-808 Oracle Certified Associate uses Lambda Predicates only, no AIC.
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.stringsarrays;

import java.util.ArrayList;
import java.util.Collections;

public class ComparaLambda {

	public static void main(String[] args) {
		// Lambda and Comparable
		ArrayList<Motorbike> bikes = Motorbike.createMotorbikes();
		System.out.println("Unsorted " + bikes);
		
//		public static <T> void sort(List<T> list, Comparator<? super T> c)
		//So we need a class that implements Comparator, could use an AIC
		Collections.sort(bikes, (bike1, bike2) ->
							bike1.getManufacturer().compareTo(bike2.getManufacturer()));
		System.out.println("Sorted by Manufacturer " + bikes);
		
		//Use a Lambda to sort by Model
		Collections.sort(bikes, (bike1, bike2) -> 
							bike1.getModel().compareTo(bike2.getModel()));
		System.out.println("Sorted by Model " + bikes);
		
		//What would a sort look like using an Anonymous Inner Class
		Collections.sort(bikes, new java.util.Comparator<Motorbike>(){
			public int compare(Motorbike bike1, Motorbike bike2){
				return bike1.getEngineCapacity() - bike2.getEngineCapacity();
			}
		});
		System.out.println("Sorted by Engine CC " + bikes);
		
	}

}

class Motorbike{
	private String manufacturer;
	private String model;
	private int engineCapacity;
	
	private Motorbike(String manufacturer, String model, int engineCapacity) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.engineCapacity = engineCapacity;
	}
	
	public String getManufacturer() {return this.manufacturer;}
	public String getModel() {return this.model;}
	public int getEngineCapacity() {return this.engineCapacity;}
	
	//Factory Method
	public static ArrayList<Motorbike> createMotorbikes(){
		ArrayList<Motorbike> bikes = new ArrayList<>(5); //diamond notation, initial capacity.
		bikes.add(new Motorbike("Suzuki", "GSXR1000", 1000));
		bikes.add(new Motorbike("Yamaha", "R1", 998));
		bikes.add(new Motorbike("Honda", "Fireblade", 999));
		bikes.add(new Motorbike("Kawasaki", "ZX10R", 1000));
		return bikes;
	}
	
	@Override
	public String toString() {
		return this.manufacturer +" "+ this.model;
	}
}