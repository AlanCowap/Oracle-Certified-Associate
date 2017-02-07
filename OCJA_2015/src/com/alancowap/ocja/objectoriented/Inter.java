/** 
 *  Demo use of interfaces and class implementing an interface
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.objectoriented;
public class Inter{
	public static void main(String[] args){
		Edible e = new Fruit();
		e.eat(3 * Edible.NUM_MEALS);
	}
}

class Fruit implements Edible{
	public void eat(int num){
		System.out.println("Fruit is " + num);
	}
}