/** 
 *  Demo Overloading (not overriding).
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.questions.sample;

public class Overload {


	/* What is the output of the following program? */ // Note: Overloading, NOT overriding.
	public boolean equals( Overload other ) {
		System.out.println( "Inside of Overload.equals" );
		return false;
	}
	public static void main( String [] args ) {
		Object t1 = new Overload();
		Object t2 = new Overload();
		Overload t3 = new Overload();
		Object o1 = new Object();
		int count = 0;
		System.out.println( count++ );// prints 0
		t1.equals( t2 ) ;
		System.out.println( count++ );// prints 1
		t1.equals( t3 );
		System.out.println( count++ );// prints 2
		t3.equals( o1 );
		System.out.println( count++ );// prints 3
		t3.equals(t3);
		System.out.println( count++ );// prints 4
		t3.equals(t2);
	}
}

