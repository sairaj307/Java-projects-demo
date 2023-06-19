package com.example.array;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {10,20,30,40,50};
		int t = a[0];
		for(int i=0; i<a.length-1; i++){
			a[i] = a[i+1];
		}
		a[a.length-1] = t;
		
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		/*int t1 = a[0];
		for(int i=0; i<a.length-1; i++){
			a[i+1] = a[i];
		}
		a[a.length-1] = t;*/
	}

}
