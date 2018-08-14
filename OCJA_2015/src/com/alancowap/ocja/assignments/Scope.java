/** 
 *  Demo of Scope of variables
 *   - static, instance, non-static initializer, method local, block
 *   
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.assignments;

public class Scope {
	static int classScope;	//initialised to 0
	int objectScope;		//= 0
	{
		int initializerScope;
//		System.out.println("initializerScope is " + initializerScope); //No. Not initialized
		initializerScope = 2;
		System.out.println("initializerScope is " + initializerScope); //Ok.
	}
	
	public static void main(String[] args) {
		Scope scope = new Scope();
		System.out.printf("classScope is %d, objectScope is %d", Scope.classScope, scope.objectScope);
//		int num = initializerScope; //No, initializerScope is out of scope.
		
		//Shadow
		int classScope=4, objectScope=5;
		System.out.printf("\n(local)classScope is %d, (local)objectScope is %d", classScope, objectScope);
		
		//Local variables
		int localScope;
//		System.out.printf("\nlocalScope is %d", localScope); //No. Not initialized
		localScope = 6;
		System.out.printf("\nlocalScope is %d", localScope); //Ok.
		
	}
	
}
