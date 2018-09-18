/** 
 *  Demo of java.util.Random
 *  - Create a Random object, with/out a seed
 *  - Use common methods of Random class: nextBoolean, nextInt, next<datatype>
 *  - Refer to API for more info, e.g.
 *  - - generates pseudo-random** values.
 *  - - can be extended to use other algorithms.
 *  - Alternatives to java.util.Random
 *  - - java.lang.Math.random() is simpler to use.
 *  - - java.util.concurrentThreadLocalRandom - consider for multithreaded apps.
 *  - - java.security.SecureRandom - consider for crypto apps.
 *  
 *  ** N.B. "If two instances of Random are created with the same seed, 
 *  and the same sequence of method calls is made for each, they 
 *  will generate and return identical sequences of numbers." - Java 8 API
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.jf.extras;

import java.util.Random; //Note java.util.Random - thus requires explicit import

public class RandomApp {
	public static void main(String[] args) {
		System.out.println("Hello Randomers");
		Random ran = new Random();
		System.out.println( ran.nextBoolean() );
		System.out.println( ran.nextInt() );
		System.out.println( ran.nextInt(100) );
		System.out.println( ran.nextLong() );
		System.out.println( ran.nextFloat() );
		System.out.println( ran.nextDouble() );	
		
		Random ran2 = new Random(123456789012L); //Can use a 'seed'
		System.out.println( ran2.nextBoolean() );
		System.out.println( ran2.nextInt() );
		System.out.println( ran2.nextInt(100) );
		System.out.println( ran2.nextLong() );
		System.out.println( ran2.nextFloat() );
		System.out.println( ran2.nextDouble() );	
	
		/*Exercise
		Create an array containing 5 ArrayLists.
		One ArrayList<> for each of Boolean, Integer, Long, Float, Double.
		Populate the 5 ArrayLists with 10 random value of the appropriate datatype.
		Output the contents of the 5 ArrayLists.
		Comment on the contents: dis/similar values, range of values, etc.
		Increase from 10 to 1000 values in each ArrayList, do not output values
		Do a statistical analysis of the values (min, max, mean, MAD, variance, std deviation)
		(You may exclude the ArrayList<Boolean> where appropriate)
		*/
	}
}
