/** 
 *  Demo casting of primitives
 *   - danger of casting how does 255 become -1,
 *   - how does 128 become -128
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.objectoriented;

public class Casting{
	public static void main(String[] args){
		System.out.println("Casting");
		int originalNum = 255;
		byte castNum = (byte) originalNum;
		System.out.printf("int is %d, byte is %d", originalNum, castNum);
		for(int i = -130; i < 131; ++i){
			castNum = (byte) i;
			System.out.printf("\nint is %d, byte is %d", i, castNum);
		}
	
	}
}