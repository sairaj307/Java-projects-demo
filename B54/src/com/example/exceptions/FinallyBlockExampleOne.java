package com.example.exceptions;

public class FinallyBlockExampleOne {

	public static void divide(int a, int b) {
		int c;
		try {
			System.out.println("------within try block--------");
			c = a/b;
			System.out.println("Result: "+ c);
		}catch(ArithmeticException a1){
			System.out.println("Exception caught: "+ a1);
		}finally {
			System.out.println("Finally block..");
		}
		System.out.println("Statement after finally block");
	}
}
