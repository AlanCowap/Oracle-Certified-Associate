/** 
 *  Simple class to demo super() to call a parent class constructor
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.methodsscope;


public class ChildClass extends ParentClass{
	public static int numChildren = 0;
	
	public ChildClass(){
		this("");	
	}
	
	public ChildClass(String s){
		super(s);
		++numChildren;
		System.out.println("ChildClass Constructor ");	
	}
	
	public int getNumChildren() {
		return numChildren;
	}


	
}
