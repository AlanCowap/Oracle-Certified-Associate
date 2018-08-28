/** 
 *  Demo of labelled, unlabelled statements
 *  - break, continue
 *  - 
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.flowcontrolexceptions;

public class Labels {

	public static void main(String[] args) {
		
	Labels l = new Labels();
	l.doUnlabelledBreak();
	l.doLabelledBreak();
	l.doUnlabelledContinue();
	System.out.println("\n");
	l.doLabelledContinue();
		
	}
	
	private void doUnlabelledContinue() {
		//unlabelled continue
		int[][] arr = { {1,2,3}, {4,5,6}, {6,7,9,10} };
		for(int i = 0; i < arr.length; ++i) {
			for(int j = 0; j < arr[i].length; ++j) {
				System.out.print(arr[i][j]);
				if (6 == arr[i][j]) {
					System.out.println("Found 6");
					continue; //unlabelled continue, will continue next iteration of innermost loop
				}
				System.out.print(".");
			}
		}		
	}
	
	private void doLabelledContinue() {
		//labelled continue
		int[][] arr = { {1,2,3}, {4,5,6}, {6,7,9,10}, {11}, {12,13} };
		outer:
		for(int i = 0; i < arr.length; ++i) {
			System.out.print("O");
			for(int j = 0; j < arr[i].length; ++j) {
				System.out.print(arr[i][j]);
				if (6 == arr[i][j]) {
					System.out.print("-Found 6-\n");
					continue outer; //labelled continue, will continue next iteration of labelled loop
					//break - can be functionally equivalent to continue up one level
				}
				System.out.print("i");
			}
			System.out.print("o\n");
		}		
		System.out.println("Finished");
	}
	

	private void doUnlabelledBreak() {
		//unlabelled break
		int[][] arr = { {1,2,3}, {4,5,6}, {7,8,9,10} };
		for(int i = 0; i < arr.length; ++i) {
			for(int j = 0; j < arr[i].length; ++j) {
				System.out.print(arr[i][j]);
				if (6 == arr[i][j]) {
					System.out.println("Found 6");
					break; //unlabelled break, will break out of innermost loop
				}
			}
		}		
	}

	private void doLabelledBreak() {
		//labelled break
		int[][] arr = { {1,2,3}, {4,5,6}, {7,8,9,10} };
		outer:
		for(int i = 0; i < arr.length; ++i) {
			for(int j = 0; j < arr[i].length; ++j) {
				System.out.print(arr[i][j]);
				if (6 == arr[i][j]) {
					System.out.println("Found 6");
					break outer; //labelled break, will break out of labelled loop
				}
			}
		}
		System.out.println("Finished");
	}
	
}
