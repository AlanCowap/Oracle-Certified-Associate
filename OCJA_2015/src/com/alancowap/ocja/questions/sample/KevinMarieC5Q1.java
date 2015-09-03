package com.alancowap.ocja.questions.sample;

public class KevinMarieC5Q1 {
	public static void main (String[] s) {
		System.out.println (new Y(1).b);
		int num = Y.b;
	}
}

class X {
	static int b;
	X () { b++;}
}

class Y extends X {
	int c;
	Y (int a) { c = b--;}
	int b () { return -1;}
}

/*
What will be the result of trying to compile and run the above code?

A) 0
B) -1
C) 1
D) Compiler error
*/