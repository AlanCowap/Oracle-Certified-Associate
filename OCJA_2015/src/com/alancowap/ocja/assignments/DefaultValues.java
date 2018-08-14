/** 
 *  Demo of Default values of variables
 *   - primitive and non-primitive (object reference variables) default values *   
 *   
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.assignments;

public class DefaultValues {
	byte b;	//0
	short s;//0
	int i;	//0
	long l;	//0
	float f;//0.0
	double d;//0.0
	boolean bool;
	char c;	//'\u0000' i.e. numeric 0, or '' (NUL)
	String str;
	
	public static void main(String[] args) {
		DefaultValues dv = new DefaultValues();
		dv.doStuff();
	}
	
	private void doStuff() {
		System.out.printf("%d,%d,%d,%d,", b,s,i,l);
		System.out.printf("\n%.1f,%.1f", f,d);
		System.out.printf("\n%s\n", bool);
		System.out.println(c + c + " char is >" + c + "<");
		System.out.printf("String is %s", str);
	}
}
