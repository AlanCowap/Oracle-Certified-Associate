/** 
 *  Demo usages of Boxing and Unboxing, with Wrapper classes and primitives
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.classesvariables;

public class Boxer{
	public static void main(String[] args){
		Boxer box = new Boxer();
		box.boxingDay(26);
	}

	private boolean boxingDay(Integer day){		// boxes the int argument
		Boolean isBox = true;			// boxes the literal
		Short num = 360;				// boxes the primitive
		if(isBox){						// unboxed
			System.out.println(++num);	// unbox, increment, box
		}
		return !isBox;					// unbox, return inverse (Note: isBox is not changed)
	}
}
