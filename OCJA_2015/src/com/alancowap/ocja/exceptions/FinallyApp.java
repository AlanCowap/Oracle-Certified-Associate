/** 
 *  Demo try-catch-finally, finally is always* executed
 *  *unless there is e.g. a System.exit() call
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.exceptions;

import java.io.IOException;

public class FinallyApp{
	public static void main(String[] args){
		System.out.println("Hello world");
		new FinallyApp().tryFinally();
	}

	private void tryFinally(){
		try{
			System.out.println("This is very trying...");
			//System.exit(0);			//finally will not be executed
			//throw new NumberFormatException();	//unchecked. finally is executed
			if (true) throw new IOException();	//checked.  finally is executed
			return;
		}catch(IOException io){
			System.out.println("Oops IOException");
			return;					// finally is executed.
			//System.out.println("After the return...");
		}finally{
			System.out.println("...finally");			
		}
		// System.out.println("End of method.");	// unreachable code
	}
}