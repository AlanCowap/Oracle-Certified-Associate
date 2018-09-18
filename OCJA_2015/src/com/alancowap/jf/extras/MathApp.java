/** 
 *  Demo of java.lang.Math
 *  - Convenient constants, PI, E.
 *  - Other values of note: Double.Nan, Float.NaN, (NaN = Not a Number)
 *  - Use common methods of Random class: abs, ceil, floor, max, min, pow, round, sqrt
 *  - Refer to API for more info, e.g.
 *  - - static methods, access statically via e.g. Math.abs
 *  - - see also StrictMath
 *  - Alternatives to java.lang.Math.random() [Ref RandomApp.java in this package]
 *  - - java.util.Random() - less easy to use, more options.
 *  - - java.util.concurrentThreadLocalRandom - consider for multithreaded apps.
 *  - - java.security.SecureRandom - consider for crypto apps.
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.jf.extras;

import java.util.ArrayList;
import java.util.Collections;

public class MathApp {
	public static void main(String[] args) {
		// static fields
		System.out.printf("Math.E = %f", Math.E);
		System.out.printf("\nMath.PI = %f", Math.PI);
		
		// static methods
		// abs, ceil, floor, max, min, pow, random, round, sqrt
		
		//abs
		int minus = -10;
		System.out.printf("\nThe absolute value of %d is %d", minus, Math.abs(minus));
		
		//ceil
		double ceil = 9.001D;
		System.out.printf("\nThe ceiling of %f is %f", ceil, Math.ceil(ceil));
		double negCeil = -9.001D;
		System.out.printf("\nThe ceiling of %f is %f", negCeil, Math.ceil(negCeil));

		//floor
		double floor = 9.001D;
		System.out.printf("\nThe floor of %f is %f", floor, Math.floor(floor));
		double negFloor = -9.001D;
		System.out.printf("\nThe floor of %f is %f", negFloor, Math.floor(negFloor));
		
		//max
		int num1 = 1, num2 = 2;
		System.out.printf("\nThe max of %d and %d is %d", num1, num2, Math.max(num1, num2));
		
		//min
		int num11 = 1, num12 = 2;
		System.out.printf("\nThe min of %d and %d is %d", num11, num12, Math.min(num11, num12));


		//pow
		double mantissa = 10.0D, exponent = 2.0D;
		System.out.printf("\nThe result of %f raised to the power of %f is %f", mantissa, exponent, Math.pow(mantissa, exponent));
		
		//round()
		System.out.printf("\nRounding: %d", Math.round(3.14));
		System.out.printf("\nRounding: %d", Math.round(3.4999999));
		System.out.printf("\nRounding: %d", Math.round(3.5));
		
		//sqrt
		System.out.printf("\nRooting: %f", Math.sqrt(256));
		System.out.printf("\nRooting: %f\n", Math.sqrt(-256)); //NaN in Java. Complex num in Maths. 
		
		//random
		for(int i=0; i<10; ++i)
			System.out.printf("%f, ", Math.random());
		System.out.println();
		//range 0 to 100 inclusive
		for(int i=0; i<10; ++i)
			System.out.printf("%d, ", (int) (Math.random()*101));
		System.out.println();
		
		// ADVANCED:
		// Take 100 random values and check if max is 100, min is 0. (Not guaranteed)
		ArrayList<Integer> al = new ArrayList<Integer>(100);
		for(int i=0; i<100; ++i){
			int num = (int) (Math.random()*101);
			System.out.printf("%d, ", num);
			al.add(num);
		}
		//No need for this 'sort hack' to get min and max, use min & max methods, know your API.
//		Collections.sort(al); // Sort the arraylist
//		int max = al.get(al.size() - 1); //gets the last item, largest for an ascending sort (default)
//		int min = al.get(0); //gets the first item, smallest for an ascending sort (default)
		
		int min = Collections.min(al);
		int max = Collections.max(al);
		System.out.printf("\nMax random value is: %d \nMin random value is %d", max, min);
	}


}
