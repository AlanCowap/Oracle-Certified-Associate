/** 
 *  Class definition.
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.questions.sample;

/**
 * @author User1
 *
 */
interface Interfacio {
	int num=0;
	void doStuff();
}

class MYCLASS implements Interfacio{
	public void doStuff(){
		System.out.println("Do something");		
	}
}