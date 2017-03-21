/** 
 *  Demo overloading and how to choose overloaded method:
 *   - exact match
 *   - widening
 *   - auto-un/boxing
 *   - var-args
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.methodsscope;

public class Overloading {

	public static void main(String[] args) {
		System.out.println("Program to demo overloading");
		new Loaded().load();
		new MoreLoaded().load();
		new EvenMoreLoaded().load();
		new MostLoaded().load();
	}
}

class Loaded{
	public void add(int num){System.out.println("int");}
	public void add(long num){System.out.println("long");}
	public void add(Integer num){System.out.println("Integer");}
	public void add (int... num){System.out.println("int...");}
	public void add(Double num){System.out.println("Double");}
	public void add(Object obj){System.out.println("Object");}
	public void add(double... num){System.out.println("double...");}
	
	public void load(){
		add(1);					// int - exact match
		long l = 1;
		add(l);					// long - exact match
		add(new Integer(1));	// Integer - exact match
		add(1,2);				// int... - exact match
		
		System.out.println("");
		add(new Integer(1), new Integer(1));	// int... - Autobox -> var-args
		add(1.0F);				// Object - Autobox -> Widen
		add(new Float(1.0));	// Object - Widen
		add(1.0F, 1.0F);		// double... - Widen -> var-args
		
	}	
}

class MoreLoaded{
	public void add(Double num){System.out.println("Double");}
	

	public void load(){
//		add(1);					// Widen -> Autobox not allowed
								// Widen -> Autobox -> var-args not allowed
	}	
}

class EvenMoreLoaded{
	public void add(double... num){System.out.println("double...");}
	public void add(Object... obj){System.out.println("Object");}	

	public void load(){
//		add(new Integer(1),new Integer(1));	//Autobox -> widen -> var-args //double...
//											//widen -> var-args //Object...
//		//ambiguous - because both are valid
	}
}

class MostLoaded{
	public void add(Object... obj){System.out.println("Object");}

	public void load(){
		add(1);					//Object: Autobox -> Widen ->  var-args
	}
}
