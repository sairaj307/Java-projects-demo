package com.example.polymorphism;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RBI rbi;
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());
		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterest());
		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterest());
	}

}
