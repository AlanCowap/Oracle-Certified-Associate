/** 
 *  Demo of Constructor Calling
 *  - no-args constructor
 *  - implicit calls to super()
 *  - explicit calls to this() and super()
 *  -  
 *   
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.objectorientation;

public class Parent {

	private int num;
	
	Parent(int num){
		this.num = num;
	}

}

//class Child extends Parent{}
//default constructor in Child will try to call parent class no-args constructor
// But the Parent class has no no-args constructor

class GoodChild extends Parent{
	GoodChild(){
//		super(); //no-args constructor doesn't exist
		super(61);	
	}
	
	GoodChild(int num){
		this();		//this(), super(), must be first statement in a constructor
//		super(num);
	}
}