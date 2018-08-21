/** 
 *  Demo of ^, XOR, eXclusive OR operator 
 *   - XOR returns true if one and only one operand is true, otherwise false.
 *   - 
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.operators;

public class ExclusiveOr {

	public static void main(String[] args) {
		//XOR
		boolean t = true, f = !t;
		boolean [] results = {t ^ t, t ^ f, f ^ t, f ^ f};
		
		for(boolean b : results)
			System.out.println(b);
	}
}
//Output:
//false
//true
//true
//false