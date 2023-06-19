package com.example.array;

class MLArray{
	static void printArray(int c[][]){
		System.out.println("Array elements are: ");
		for(int i=0; i<c.length; i++){
			for(int j=0; j<c[i].length; j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class MultiDimenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[][] = {{12,45}, {10,40},{34,45}};
		System.out.println("No of rows of C array: "+ c.length);
		MLArray.printArray(c);
		

	}

}
