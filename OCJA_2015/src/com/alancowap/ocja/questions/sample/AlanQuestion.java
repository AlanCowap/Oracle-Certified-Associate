package com.alancowap.ocja.questions.sample;
public class AlanQuestion {
	public static void main(String[] args) {
		Class cla55 = new SheerClass();
		((SheerClass)cla55)._=7;
		System.out.println(++((SheerClass)cla55)._);
	}
}
abstract class Class{
	Class(){}
	final static int _= (int) 5.0;	
}
final class SheerClass extends Class{
	SheerClass(){_++;}
	int _= new Integer("6");
}

/* What is the result of running this code:
a) 0
b) 1
b) 5
d) 6
e) 7
f) Compilation Fails
g) An Exception or Error occurs at Runtime
*/