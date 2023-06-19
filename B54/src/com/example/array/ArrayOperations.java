package com.example.array;

class ArrayDemo{
	static void printArray(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	public static int getSum(int... n){
		int sum=0;
		for(int no:n){
			sum+= no;
		}
		return sum;
	}
	public static int getOddCount(int b[]){
		int count=0;
		for(int i=0; i<b.length; i++){
			if(b[i]%2!=0){
				count++;
			}
		}
		return count;
	}
	public static int getEvenCount(int b[]){
		return b.length-getOddCount(b);	
	}
}

public class ArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n = 10;
			int a[]; // declaration 
			a = new int[n]; // instantiation
			// displaying the array 
			ArrayDemo.printArray(a);
			// assigning values in array a
			for (int i = 0; i <a.length; i++) 
				a[i]=5*i;
			ArrayDemo.printArray(a);
			int b[] = {10, 20, 30, 40, 50}; // initialization at the time of declaration ArrayOperations.printArray(b);
			//calling variable argument function
			System.out.println("sum of array elements is: "+ArrayDemo.getSum(b)); 
			System.out.println("sum of array elements is : "+ ArrayDemo.getSum(10,20));
			b[2] = 999; // assigning single element
		
	}
}
