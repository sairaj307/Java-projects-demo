package com.example.polymorphism;

public class OverLoadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------method overloading-------");
		System.out.println(MethodOverLoading.addition(10,34));
		System.out.println(MethodOverLoading.addition(10.12f,34.23f));
		System.out.println(MethodOverLoading.addition(10,34.56f));
		System.out.println(MethodOverLoading.addition(10.34f,34));
		
		System.out.println("-----constructor overloading---------");
		Point p1 = new Point();
		System.out.println(p1);
		
		Point p2 = new Point(14.5f);
		System.out.println(p2);
		
		Point p3 = new Point(14.5f, 12.4f);
		System.out.println(p3);
	}

}
