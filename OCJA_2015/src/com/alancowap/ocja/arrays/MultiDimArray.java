public class MultiDimArray{
	public static void main(String[] args){
		System.out.println("Multi Dimensional Arrays");

		int[][] arr = new int[8][8];
			
		for(int i=0; i < arr.length; ++i){
			//System.out.println(arr[i]);
			for(int j=0; j <arr[i].length; ++j){
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}

		for(int i=0; i < arr[5].length; ++i)
			arr[5][i] = 5;

		int[] arr2 = arr[5];
		for(int i : arr2)
			System.out.print(i + "");

	}

}