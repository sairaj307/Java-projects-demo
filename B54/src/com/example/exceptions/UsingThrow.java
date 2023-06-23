package com.example.exceptions;

import java.util.Scanner;

public class UsingThrow {
	static int acceptNumber() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int per;
		System.out.println("Enter percentage: ");
		per = acceptNumber();
		try {
			if(per<0) {
				throw new ArithmeticException("Percentage should not be negetive");
			}
			else if(per>100){
				throw new ArithmeticException("Percentage should not be above 100");	
			}
			else {
				System.out.println("valid percentage: "+per);
			}
		}catch(ArithmeticException e) {
			System.err.println("Error.."+ e.getMessage());
		}

	}

}
