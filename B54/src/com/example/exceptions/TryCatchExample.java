package com.example.exceptions;

public class TryCatchExample {
	
	static void divide(int x, int y){
		System.out.println("I am in Divide method");
		int z;
		try {
			System.out.println("I am in try block");
			z = x/y;
			System.out.println("Result of z: "+ z);
		} catch (ArithmeticException np) {
			System.err.println("I am in catch block: "+np.getMessage());
		}
	}
}
