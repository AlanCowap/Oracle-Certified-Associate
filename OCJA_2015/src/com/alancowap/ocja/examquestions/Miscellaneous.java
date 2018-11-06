/** 
 * Sample code based on mock-exam questions.
 * - Wrapper classes, equality operator ==, equals() method.   
 * - Exceptions: Throwables printStackTrace(), and overridden toString() methods
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 * 
 */
package com.alancowap.ocja.examquestions;

public class Miscellaneous {

	public static void main(String[] args) {
		Miscellaneous m = new Miscellaneous();
//		m.wrapperEquality();
//		m.exceptions();
		m.method1();
	}

	private void wrapperEquality() {
		System.out.println("Wrapper Equality\n");
		Number n = 5;	//strange but true (Number is superclass of numeric wrapper classes)
		//5 is an int, wrapped to an Integer, polymorphic reference from Number ORV
		//Character and Boolean both extend Object directly
		System.out.println("instanceof:");
		System.out.println(n instanceof Integer);	//true
		System.out.println(n instanceof Byte);		//false
		Number nd = 5.5;
		System.out.println(nd instanceof Double);	//true
		System.out.println(nd instanceof Float);	//false
		
		System.out.println("\nequals():");
		System.out.println(n.equals(new Integer(5)));//true
		//System.out.println(n.equals(new Byte(5))); //No. constructor "Byte(int)" doesn't exist
		System.out.println(n.equals(new Byte("5"))); //false 
		
		Byte b = 127;
		Short s = 127;
		System.out.println("\n== equality operator");
		//System.out.println(b == s); //No. Incompatible operands: Byte, Short
		System.out.println((byte) b == s); //true. unwrap, compare
		System.out.println((byte) ++b == s); //false. unwrap, increment, compare
		System.out.println(b); //watch for wrap-around (-128)
		s = 300;
		
		System.out.println("\nHeap vs Constant Pool");
		Integer i = 300;
		//System.out.println(s == i); //No. Incompatible operands again.
		System.out.println((short) s == i); //true. unwrap, compare.
		Integer j = new Integer(300);
		Integer k = new Integer(300);
		Integer l = 300;
		System.out.println(i == j); //false
		System.out.println(k == j); //false
		System.out.println(i == l); //false
		
		Integer m = 127; //numeric literal in range of byte => Constant Pool
		Integer p = 127;
		System.out.println(m == p); //true
		m++; p++;	//unwrap, increment, wrap.
		System.out.println(m == p); //false - now outside of Constant Pool		
		
	}
	
	private void method1() {method2();}
	private void method2() {method3();}
	private void method3() {method4();}
	private void method4() {exceptions();}
	
	
	private void exceptions() {
		System.out.println("\nEXCEPTIONS\n");
		try {
			throw new CustomException("I'm throwing a CustomException");
//			throw new Exception("I'm throwing an Exception");
		}catch(CustomException ce) {
			System.out.println(ce);	//Throwables overridden toString() method
			ce.printStackTrace();	//Throwables printStackTrace() method
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("\nFinished Exceptions");
	}
	
}

class CustomException extends Exception{
	CustomException(){super();}
	CustomException(String msg){super(msg);}
}