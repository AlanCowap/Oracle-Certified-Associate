/** 
 *  OCJA Sample exam question
 *  Label, break and continue keywords
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.questions.sample;

public class Buddy {
	public static void main(String[] args) {
		def:
			for(short s = 1; s < 7; s++) {
				if(s == 4) break def;
				if(s == 1) continue;
				System.out.print(s + ".");
			}
	}
}
//What is the output?