/** 
 *  Demo try-catch-finally, order of execution
 *  
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.exceptions;


public class Except{
	public static void main(String[] args) throws InvalidNameException{
		System.out.println("Hello World");
		String name = "Bill Joy";
		try{
			System.out.println("Start try");
			if (name == null)
				throw new InvalidNameException();
			System.out.printf("Hello %s, your name is %d char(s)", name, name.length());
			System.out.println("End try");
		}catch(InvalidNameException ine){
			System.out.println("Please use a valid name");			
		}catch(Exception ex){
			System.out.println("An Exception Occurred. This program will now close");			
		}

		new Except().someMethod();
	}
	public void someMethod() throws InvalidNameException{
		//throw new SomeRuntimeException();
/*		try{
			throw new InvalidNameException();
		}catch(InvalidNameException ine){
			System.out.println("Please use a valid name : someMethod()");			
		}
*/	}
}
class InvalidNameException extends Exception{}
class SomeRuntimeException extends RuntimeException{}
