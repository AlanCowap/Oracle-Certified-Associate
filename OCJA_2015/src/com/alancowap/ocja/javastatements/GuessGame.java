/** 
 *  Demo iteration statements (e.g. do-while loop)
 *  Demo use of random number generation using java.util.Random
 *  A random number generator tries to guess a randomly generated number (1..20)
 *  
 *  Could you improve the program?
 *   1) how about getting the human to guess each number no more than once?
 *   2) how about keeping track of how many guesses were taken
 *   3) compare the number of guesses required before and after implementing (1) above
 *	 
 *
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies none
 *  
 *  
 */

package com.alancowap.ocja.javastatements;

import java.util.Random;

public class GuessGame {

	public static void main(String[] args) {
		int answer=0, guess=0, count=0;
		
		Random robot = new Random();
		answer = robot.nextInt(20) +1; //add 1 because we want 1..20 (not 0..19)
		Random human = new Random();

		do{			
			guess = human.nextInt(20) +1;
			++count;
			System.out.println("Guess #"+ count +": " + guess);
		}while(guess != answer);
		
		System.out.println("YES, it was " + answer);
		System.out.println("Number of guesses " + count);
	}

}
