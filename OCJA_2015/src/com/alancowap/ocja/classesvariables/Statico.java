/** 
 *  Demo static, and non-static variables
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.classesvariables;

class Statico{
	public static void main(String[] args){
		System.out.println("Hello Static");		
		System.out.println(Triangle.numTriangles);
		Triangle.numTriangles = 1;
		System.out.println(Triangle.numTriangles);
		Triangle myTriangle = new Triangle();
		myTriangle.area = 100.0D;
		System.out.println(myTriangle.area);
		
		//Avoid accessing static variables through ORV
		myTriangle.numTriangles = Integer.MAX_VALUE - 20; //not good practice
		System.out.println(Triangle.numTriangles);

		for(int i=0; i < 100; ++i){
			new Triangle();
			System.out.print(".");
		}
		System.out.println("Triangles created: " + Triangle.numTriangles);
	}
}

class Triangle{
	static int numTriangles;
	double area;

	Triangle(){
		//validate before increment
		if (numTriangles >= 0 && numTriangles < Integer.MAX_VALUE){
			numTriangles++;				//valid, consider renaming variable sNumTriangles
			//this.numTriangles = 2;	//valid but misleading
			//Triangle.numTriangles = 3;//valid, possibly verbose
		}
	}

	public void finalize(){
		--numTriangles;
	}

}