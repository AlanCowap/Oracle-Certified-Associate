/** 
 *  Demo of Wrapper classes
 *  - Integer Constant Pool
 *  - Wrapper objects on the Heap
 *  - Assigning literals to Wrapper objects
 *  - Ref JLS 5.2 Assignment Contexts 
 *  - - https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.2
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.stringsarrays;

public class WrapperClasses {

	public static void main(String[] args) {
		WrapperClasses wc = new WrapperClasses();
		int result = wc.add(3, new Integer(5));
		System.out.println("Result is " + result);
		
		//Integer literals: outside range of byte (-128:127 incl.) go the on Heap as new Object		
		//Wrappers on Heap
		Integer i = 2048; //
		Integer j = 2048; // applies to Byte, Short, Integer.
							//Char 0 .. 127 inclusive goes in Integer Pool
		//Watch out for precedence issues:
//		System.out.println( i==j + " "+ i.equals(j)); //Ooops precedence.
//		System.out.println( i== (j + " "+ i.equals(j)));//Same as above, now obvious problem
		System.out.println( (i==j) + " "+ i.equals(j)); //Clear precedence. false true

		//'Integer Pool'
		Integer m = 127;
		Integer n = 127;
		System.out.println((m==n) +" "+ m.equals(n)); //true true
		
		//Wrappers on Heap
		Integer o = new Integer(127); //force Wrapper onto Heap even if in range of Integer Pool
		Integer p = new Integer(127);
		System.out.println((o==p) +" "+ o.equals(p)); //false true
		
		//Comparing Double and Integer
		Double d = 127.0D;
//		System.out.println(p==d); //No. Can't compare Double and Integer wrapper references
		System.out.println(p.equals(d));
		
		//Test if .equals() is same Datatype AND same value
		Byte bPrim = 127;	//narrowing to byte, ok
		Byte bStr = new Byte("127"); //ok
//		Byte b = new Byte(127); //Not ok, because
		Short s = 127; //narrowing to short, ok
		System.out.println(((Number) bPrim == s) +" "+ bPrim.equals(s));
		//false - different datatype => different memory addresses, false (Different datatypes)
		
//		Long longWrap = 127; //can't narrow/widen from int to long 
		long longPrim = 127; //widening is ok for primitive
		
		Short sh = 32767; // narrowing to short, ok
		Character ch = '\uFFFF'; //narrowing to char, ok
		
		Short sho = (short) 127L; //explicit cast, watch for PLOP (Possible Loss of Precision)
		
		
	}
	
	private Integer add (Integer num1, int num2) {
		return num1++ * num2;
	}

}

