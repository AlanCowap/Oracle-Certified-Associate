/** 
 *  Demo of Garbage Collection
 *   - Note the JVM may automatically allocate more space as required
 *   - - hence the Free Memory can increase
 *   - the gc() method is not _required_ to be implemented by the Java Language Spec.
 *   
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.assignments;

public class Garbage {
	public static void main(String[] args) {		
		System.out.println("Garbage Collection");
		Runtime rt = Runtime.getRuntime();
		
		long initialFreeMemory = rt.freeMemory();
		long initialTotalMemory = rt.totalMemory();
		long bigArray[][][] = new long[100][1000][1000];

		long arrayFreeMemory = rt.freeMemory();
		long arrayTotalMemory = rt.totalMemory();
		
		bigArray = null;
		rt.gc();
		
		long finalFreeMemory = rt.freeMemory();
		long finalTotalMemory = rt.totalMemory();
		
		System.out.printf("Inital memory %d\nArray memory %d\nFinal memory %d",
				initialFreeMemory, arrayFreeMemory, finalFreeMemory);
		System.out.printf("\nInital Total memory %d\nArray Total memory %d\nFinal Total memory %d",
				initialTotalMemory, arrayTotalMemory, finalTotalMemory);
		
	}
	
	
}
