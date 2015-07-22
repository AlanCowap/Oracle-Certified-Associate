/** 
 *  Demo use of this() to call another constructor
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.methodsscope;


public class ParentClass {
	
	public ParentClass(){
		//System.out.println("ParentClass Constructor");
		this("");
	}
	
	public ParentClass(String s){
		System.out.println("ParentClass Constructor " + s);
	}
}
