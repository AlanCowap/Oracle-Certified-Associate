/** 
 *  Demo of 1D and 2D arrays
 *  - see also com.alancowap.ocja.flowcontrolexceptions.Labels
 *  - Only first Dimension _must_ be assigned a size in Array creation 
 *  - Dimensionality must be preserved
 *  - Array references:
 *  - - polymorphic for references to Arrays of Object Reference Variables (incl. Interfaces)
 *  - - 'widening' does not apply for references to Arrays of primitives 
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.stringsarrays;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ArrayApp {

	public static void main(String[] args) {
		// 
		int[][] arr = new int[5][];
		int[] ar = new int[3];
		arr[0] = ar;
		arr[1] = new int[]{1,2,3};
		arr[2] = arr[0];
		arr[3] = arr[2];
		arr[4] = arr[3];
		
		for(int i=0; i < arr.length; ++i) {
			for(int j=0; j < arr[i].length; ++j) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
//		ar = arr; //No. dimensionality must be equal in assignments
		
		//usual Polymorphic rules apply to Arrays of ORVs
		Object[] objectArr = new Object [10];
		objectArr[0] = "String IS-A Object"; 
		objectArr[1] = ChronoUnit.CENTURIES;
		objectArr[2] = DateTimeFormatter.ofPattern("ddMMMyyyy");
		objectArr[3] = 1; //Boxed to Integer
		objectArr[4] = new Object() {public String toString() {return "AIC";}};
		System.out.println(objectArr[4]);
		
		//Array references can use Polymorphic references i.e. type-compatible
		String[] stringArr = new String[5];
		objectArr = stringArr;

		//Array of Interface
		Arrayable[] arrayableArr = new Arrayable[5];
//		arrayableArr[0] = new Object(); //No. Object fails IS-A Arrayable 
		arrayableArr[1] = new Book(); //OK, Book IS-A Arrayable
		arrayableArr[2] = new Song(); //OK, Song IS-A Arrayable
		
		//There is no 'widening' with references to Arrays of Primitives
		int[] arrInt = new int[5];
		byte[] arrByte = new byte[5];
//		arrInt = arrByte; //No. can't do this
		arrByte[0] = (byte) 1D; //Careful now! Truncation. 
		
		// There is widening/promotion of primitive elements
		double[] arrDouble = new double[5];
		arrDouble[0] = 1; //this is equivalent to below wrt widening
		double dub4 = 1;
	}

}

interface Arrayable{}

class Book implements Arrayable{}
class Song implements Arrayable{}