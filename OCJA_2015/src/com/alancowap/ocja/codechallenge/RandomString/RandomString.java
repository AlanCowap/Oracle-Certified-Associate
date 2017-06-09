/** 
 *  Demo java.util.Random
 *  Demo int to char to unicode conversion using casting
 *  
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.codechallenge.RandomString;

import java.util.Random;

/**
 * @author user
 *
 */
public class RandomString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("RandomStringApp");
		Random rnd = new Random();
		
		for (int i = 0; i < 50; i++) {
			int num = rnd.nextInt(25);
			char ch = (char) (num + 'a');
			System.out.printf("%d<%c>", num, ch);
		}
	}

}












