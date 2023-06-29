package com.example.exceptions;

import java.util.Scanner;

public class AgeTestDemo {
	static boolean validate(int age) {
		if(age < 18) {
			return false;
		}
		else {
			return true;
		}
	}
	public static void main(String[] sai) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		try {
			if (validate(age)) {
				System.out.println("Welcome to vote");	
			}
			else {
				throw new InvalidAgeException("Invalid age, You are not eligible to vote");
			}}catch(InvalidAgeException e) {
				System.err.println("Caught an exception: \n\t\t"+ e.getMessage());
			}finally {
				sc.close();
			}
		}
		
		
		
	}

