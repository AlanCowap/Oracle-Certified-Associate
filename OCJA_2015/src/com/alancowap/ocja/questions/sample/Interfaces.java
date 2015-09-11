package com.alancowap.ocja.questions.sample;
//Thanks to AlexS for this question:
public class Interfaces implements RedHerring,AnglerFish{
	String name = "Catfish";
	public void fish(){
		System.out.print(name + ": This is a type of fish!");
	}
	public static void main(String[] poisson){
		try{
			Interfaces what = new Interfaces();
			what.fish();
		}catch(Exception fish){
			System.out.print("Exception thrown.");
		}
	}
}
interface RedHerring{
	String name = "RedHerring";
	void fish();
}
interface AnglerFish{
	String name = "AnglerFish";
	void fish() throws Exception;
}

/*
What is the output of this code?
A) Catfish
B) RedHerring
C) AnglerFish
D) Exception thrown.
E) Runtime error
F) Compiler error
*/