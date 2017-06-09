/** 
 *  Example interface
 *  Show implicit modifiers for interface, interface methods, interface constants.
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.objectoriented;
interface Edible{				// abstract is implicit for an interface
	void eat(int num);			// abstract public is implicit for interface methods
	int NUM_MEALS = 2;			// public static final is implicit for interface CONSTANTS
}


/* This interface is equivalent to the interface defined above

abstract interface Edible{				// abstract is implicit for an interface
	abstract public void eat(int num);		// abstract public is implicit for interface methods
	public static final int NUM_MEALS = 2;		// public static final is implicit for interface CONSTANTS
}

*/