/** 
 *  Demo logical operators: && || !
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.operatorsstrings;


public class LogicalOperators {

	private boolean state = false;
	
	public static void main(String[] args) {
		LogicalOperators lo = new LogicalOperators();
		System.out.println(lo.state);
		lo.changeState();
		System.out.println(lo.state);
		lo.changeState();
		System.out.println(lo.state);
		if( ! lo.state ){
			System.out.println("State is false");
		}else{
			System.out.println("State is true");
		}
		
	}
	
	private void changeState(){
		state = !state;
	}
	

}
