package com.example.array;

import java.util.Scanner;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] arr = new Student[5];
		arr[0] = new Student(1, "Getaa");
		arr[1] = new Student(2, "Akash");
		arr[2] = new Student(3,"Nidhi");
		arr[3] = new Student(4, "Lisha");
		Scanner sc = new Scanner(System.in);
		arr[0] = new Student(1, "Getaa");
		System.out.println("Enter STudent details:");
		int id = sc.nextInt();
		String name = sc.next();
		arr[4] = new Student(id, name);
		
		for(int i=0; i<arr.length; i++){
			System.out.println("Element at"+ i+ ":"+arr[i].getRollNo() +" "+arr[i].getName());
		}
				
		
	}

}
