/** 
 *  Sample class to demonstrate Static Nested Class
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.sample;

class Statico {
	public Statico(){}
	
	public static void main(String[] args) {
		BigOuter.Nest n = new BigOuter.Nest();
		n.go();
		new Broom().doStuff();
	}
}
class BigOuter{
	static class Nest{void go(){System.out.println("Nesty");}}
}
class Broom{
	static class B2{void goB2(){System.out.println("Broomy");}}
	void doStuff(){
		B2 b2 = new B2();
		b2.goB2();
	}
}
