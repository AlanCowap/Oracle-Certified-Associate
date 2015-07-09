/** 
 *  Simple class to demonstrate while loop.
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.javastatements;

public class GameApp {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		int lives = 3;
		while(lives > 0){
			System.out.println("Playing game...");
			lives--;
		}
		System.out.println(lives + " lives left, Game over");

	}

}
