package com.example.array;

public class RotateArray {

	static int[] anti_Clockwise_Rotate(int[] a){
		int t = a[0];
		for(int i=0; i<a.length-1; i++){
			a[i] = a[i+1];
		}
		a[a.length-1] = t;
		return a;
		}
	static int[] clockwise_Rotate(int[] a){
		int t1 = a[a.length-1];
		for(int i=a.length-1; i>0; --i){
			a[i] = a[i-1];
		}
		a[0] = t1;
		return a;
		}
	static void print(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		System.out.println("Array Before Rotation:");
		print(a);
		anti_Clockwise_Rotate(a);
		System.out.println("Array After Anti-clockwise Rotation:");
		print(a);
		
		clockwise_Rotate(a);
		System.out.println("Array After Clockwise Rotation:");
		print(a);
	}

}
