package com.alancowap.ocja.questions.sample;

public class AlansQuestion {

	public static void main(String[] args) {
		int[] arr = {1,23};
		int[] arr2[] = {{1}, {2}, {3}};
		
		for(int i : arr) System.out.println(i);
		
		for(int[] i :arr2 )
			for(int j : arr )
				System.out.print(j + " ");
			
		
	}

}
