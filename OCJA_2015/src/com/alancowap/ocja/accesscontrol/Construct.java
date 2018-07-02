/** 
 *  Demo of Constructors
 *  Demo of Variables
 *   - instance variables, local variables, array variable declarations
 *   - variable modifiers - final, transient, volatile, static
 *      
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.accesscontrol;

public class Construct {
	//Instance variables
	int n=1, m=3;
	int a=1, b, c=1; // non initialized variables will be initialized with default values
	String str;		// initialized to null
	int[] arr;		// This is an ORV (not an array object), initialized to null
	final int doNotChange = 10;	//final variable cannot be reassigned.
	final StringBuilder builder = new StringBuilder();
	private static final int MAX_SCORE = 100; //Class variable, static variable.
	
	//The following keywords need to be known about, but not much else for OCJA
	transient String sessionId;	//objects referred to by transient variables not Serialized
	volatile int currentValue = 2; //volatile variables are updated when used
	
	
	//Constructors
	//Any access modifier is legal for a constructor
	private Construct(int num) {}
	protected Construct (int num, int num2){}
	
	void Construct(int[] args) {}	//poorly named method, NOT a constructor
	//abstract Construct() {} //invalid modifers - abstract, final, static, 
	
	public static void main(String[] args) {
		Construct con = new Construct(5);
		System.out.printf("a %d, b %d, c %d", con.a, con.b, con.c);
		System.out.println(con.str);
		
		//Local variables 
		int num;	//not initialized because it's a local variable
		//num += 0;	//can't use uninitialized local variable
		//char c = (char) num; //can't use uninitialized local variable
		//new Construct(num); //can't use uninitialized local variable
		//if(args.length > 3) {num += 2;}//can't use uninitialized local variable
		num = 0;

		//Array
		con.arr = null;
		con.arr = new int[]{1,2,3};	//instantiate an array, initialize with specified values
		for(int num2 : con.arr)
			System.out.println(num2);
		
		con.arr = new int[4];	//instantiate an array, initialize with default values
		for(int num2 : con.arr)
			System.out.println(num2);
		
		String[] strs = new String[3];	//instantiate an array, initialize with default values
		String[] strExplicit = {"hello","world"};
		
		for(String str : strs)
			System.out.println(str);
		
		//final
		//con.doNotChange = 5;	//doNotChange is final - cannot be reassigned.
		//con.construct = new Construct(5); // construct is final - cannot be reassigned.
				
		//Use static variable
		System.out.println(Construct.MAX_SCORE);	//Good practice.
		System.out.println(con.MAX_SCORE);	// Not good practice. Should use Class name for static
		
	}
	
}

class TestConstruct{
	private void test() {
		Construct con;
		//con = new Construct();		//no no-args constructor created
		//con = new Construct(10);	// Construct(int) constructor is private
		
	}
}