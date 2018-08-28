/** 
 *  Demo of Exceptions
 *  - you can recover from OutOfMemoryError, and StackOverflowError => impressive!
 *  - try-catch, with multiple catch clauses (most specific - to most general)
 *  - finally is always (almost) executed, even with a return in a catch
 *  - N.B. a return in a finally clause will obliterate your Exception - it won't propagate!
 *  - checked Exceptions must be caught and/or declared
 *  - checked Exceptions extend java.lang.Exception (excluding RuntimeException)
 *  - - REF: https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html
 *  - unchecked Exceptions are RuntimeException and it's subclasses
 *  - - REF: https://docs.oracle.com/javase/8/docs/api/java/lang/RuntimeException.html
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */

package com.alancowap.ocja.flowcontrolexceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class Exceptional {
	private static int count = 0;
	
	//The main method can throw Exceptions, the program will end though.
	public static void main(String[] args) {// throws FileNotFoundException{
		// 
		System.out.println("Heap o' Trouble");
		Exceptional ex = new Exceptional();
		ex.heapOfTrouble();
		ex.stackOfTrouble();
		ex.checkedException();

		try {
			ex.tryFinally();
		} catch (FileNotFoundException e) {			
			System.out.println("Oops a FNF was thrown");
		}
		
		int result = -1;
		result = ex.tryReturns();
		System.out.println("tryReturns result " + result);
		
		try {
			ex.throwExceptions();
		} catch (FileNotFoundException e) {
			System.out.println("Caught a FNF Exception");
		}
		
		System.out.println("Finished.");
	}

	//Create an OutOfMemory Error
	private void heapOfTrouble(){
		try{
			long[][][] arr = new long[1000][1000][1000];
		}catch(OutOfMemoryError oome) {
			System.out.println("Oops Ran out of Memory, try again!");
		}
		System.out.println("Some really important task...");
	}

	//Create a Stack Overflow
	private void stackOfTrouble(){
		System.out.println("Stack o' Trouble");
		try {
			int[] arr = {1};
			int num = arr[1];			
			if (true) throw new NullPointerException();			
			a();			
			System.out.println("This won't execute if an Exception is thrown");
		//You can catch multiple Exceptions
		} catch (StackOverflowError soe) { //not a checked exception
			System.out.println("Oops, Stack Overflow");
		} catch (NullPointerException npe) { //not a checked exception
			System.out.println("Oops NPE");
		} catch(Exception ex) {
			System.out.println("An Exception occurred");
			ex.printStackTrace();
		}
		System.out.println("Finished Stack " + count);
	}	
	private void a() {++count; b();}
	private void b() {++count; a();}

	//Use Checked Exceptions i.e. those that are children of Exception (but not RuntimeException)
	private void checkedException()  {
		try {
			FileReader f = new FileReader("test.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("Oops, a FileNotFoundException ocurred");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();			
		}
		System.out.println("Finished Checked Exception");
	}
	
	//add a finally clause to a try block, duck an Exception
	private void tryFinally() throws FileNotFoundException {
		PrintStream p = null;
		try {
			p = new PrintStream("test.txt");//creates test.txt if it does not exist
			p.append("Hello World\n");
			System.out.println("PrintStream opened");
			return; //finally will still be executed, even with a return in the try!
		} finally { //finally clause is executed regardless of Exception thrown or not
			System.out.println("Finally");
			p.close();			
		}
	}
	
	//return statements in the try and finally blocks can be interesting!
	private int tryReturns() { // No FileNotFoundException declared as thrown!
		PrintStream p = null;
		try {
			p = new PrintStream("test.txt"); //may throw a FileNotFoundException
			return 1;//finally will still execute, even after a return statement (unless finally contains a return)
		}finally {
			return 2; //N.B.'return' in finally => Exception is not propagated!
		}
	}
	
	//explicitly throw some Exceptions, duck an Exception
	private void throwExceptions() throws FileNotFoundException{
//		throw new NullPointerException();
		try {
			int num = 0;
			if (num < 1) throw new FileNotFoundException();
		} finally{
			System.out.println("Finally doesn't handle Exceptions");
		}
	}
	
}
