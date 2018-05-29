package com.alancowap.ocja.basics;

class Primitives{

	static float floaty;
	static char ch;
	static boolean isOn;
	static Person bob;

	public static void main(String[] args){
		System.out.println("Hello World");

		byte number;
		number = 120;
		System.out.println(number);
		for(int i=0; i < 10; i++){
			number += 1;
		}
		System.out.println(number); //-126

		short shorty=32767;
		shorty++;
		System.out.println(shorty);
		
		int result = 10/3; //rounding occurs
		result *= 3;
		System.out.println(result); //9, 10% error

		new Person(); //create a Person object
		Person student;//create a Person ORV
		student = new Person();//assign new Object to an ORV
		System.out.println(student);

		System.out.println(floaty);
		floaty = 3.14F; //FP literals are Double
		System.out.println(floaty);
		
		//Default value for ch is 0 or ''
		System.out.println(">" + ch + "<");
		System.out.println(5 + ch +"<");

		System.out.println(isOn);	//false
		System.out.println(!isOn);	//true
		boolean isOff = true;
		System.out.println(isOff && isOn);//false
		System.out.println(isOff || isOn);//true

		System.out.println(bob + " oops");
		bob = new Person();
		System.out.println(bob.toString() + ":)");
	}
}

class Person{
	private static int count = 0;
	Person(){++count;}
}