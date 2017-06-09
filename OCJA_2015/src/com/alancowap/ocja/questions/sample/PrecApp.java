/** 
 *  Demo operator precedence.
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.questions.sample;

public class PrecApp{
	public static void main(String[] args){
		// Which lines of code give an answer of 14
		int a = 4;
		int b = 6;
		int c = 1;
		int ans = a * b - ++c * b;
		System.out.println(ans + " a * b - ++c * b");	// 12

		a = 4;
		b = 6;
		c = 1;
		ans = ++c + b % a - (c - b * c);
		System.out.println(ans + " ++c + b % a - (c - b * c)"); // 14

		a = 4;
		b = 6;
		c = 1;
		ans = (-c * b++ * (a - b)) - 4;
		System.out.println(ans + " (-c * b++ * (a - b)) - 4");	// 14


		a = 4;
		b = 6;
		c = 1;
		ans = ++c + b % a - c - b *c;
		System.out.println(ans + " ++c + b % a - c - b *c");	// -10


		a = 4;
		b = 6;
		c = 1;
		ans = (c - b) * (a / ++c);
		System.out.println(ans + " (c - b) * (a / ++c);");	// -10?

		a = 4;
		ans = a++ + ++a;
		System.out.println(ans + " a++ + ++a");	//10 = 4 + 6

		a = 4;
		ans = ++a + a++;
		System.out.println(ans + " ++a + a++");	//10 = 6 + 4

		a = 4;
		System.out.println(++a + a++);	//10 = 6 + 4

		a = 4;
		System.out.println(a++);	//4
		System.out.println(++a);	//?

	}
}