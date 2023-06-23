package com.example.exceptions;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[];
		try {
			x = new int[] {1,2,3,4};
			System.out.println(x[6]);
		} catch(ArrayIndexOutOfBoundsException np){
			System.err.println("Index not exist: "+ np.getMessage());
		}

	}

}
