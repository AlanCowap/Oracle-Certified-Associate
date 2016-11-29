/** 
 *  Demo arrays - Declaration, Construction, Initialization
 *  Array of Primitives and Array of Wrappers, and how they work
 *  Auto Un/Boxing wrt 'null' values => NullPointerException
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.arrays;



public class ArrayApp{
	static public void main(String[] args){
		System.out.println("Arrays");
		int[] arr = new int[10]; //Array of object ref variables init value of null
		int[] arr2 = null;

		System.out.println("Print zero for all elements in array or int");
		for(Integer i : arr)
			System.out.println(arr[i]);

		System.out.println("Auto-unwrapping a wrapper that refers to null => NullPointerException");
		Integer[] arr3 = new Integer[10];
		for(int i : arr3)
			System.out.println(arr3[i]);


		System.out.println("Can't use null as an array index => NullPointerExcception");
		System.out.println("arr2 is " + arr2);
		Integer[] arr4 = new Integer[10];
		for(Integer i : arr4)
			System.out.println(arr4[i]); //equivalent to arr4[null]

		for(Integer i : arr4)
			System.out.println(arr4[2]); //print 'null' 10 times

		for(Integer i : arr4)
			System.out.println(i); //print 'null' 10 times


		Book[] books = new Book[10];
		for(Book b : books)
			System.out.println(b);

	}
}

class Book{}
