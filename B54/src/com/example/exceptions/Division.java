package com.example.exceptions;
import java.util.*;
public class Division {

	public static void divide() {
		int a,b,c;
		int[] arr = {40, 60};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 no: ");
		try {
			a = sc.nextInt();
			b = sc.nextInt();
			c=a/b;
			System.out.println("Division is c"+ c);
			System.out.println(arr[c]);
		} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Error occured.."+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Error occured.."+e.getMessage());
			sc.close();
		}
		
	}

}
