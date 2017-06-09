
/** 
 *  Calculate Prime numbers
 *   - N.B. This is pre-optimised version
 *   1. Optimise this using smart Prime Number Candidate selection
 *   1.1. Check only odd numbers (even numbers divisible by 2)
 *   1.2. Rule out numbers ending with *5 (divisible by 5)
 *   1.3. Rule out numbers ending with *0 (divisible by 2, and 5)
 *   2. Optimise this using smart Factors Candidate selection
 *   2.1. Rule out even numbers
 *   2.2. Rule out numbers ending with *5
 *   2.3. Rule out numbers > sqrt(primeNumberCandidate)
 *   2.4. Numbers divisible by 3...
 *   3.
 *   3.1. Only check Prime Candidates e.g. up to Integer.MAX_VALUE.
 *   3.2. Reduce IO
 *   3.3. Use Threads...
 *   
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.codechallenge.misc;

public class PrimeNumberApp {

	public static void main(String[] args) {
		System.out.println("Prime Number Generator");
		new PrimeNumberApp().generatePrimeNumbers();			
	}
	
	private void generatePrimeNumbers() {
		// Loop through numbers to find primes
		for(int num = 2; num < 100; ++num){
			// Check if number is a prime number (does it have factors)
			if (isPrime(num)) System.out.print(num + " ") ;
		}
	}

	private boolean isPrime(int num){
		//Check for Factors
		for(int i = 2; i < num; ++i){
			if (num % i == 0)
				return false;
		}
		
		return true;
	}

}
