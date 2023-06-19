package com.example.strings;

public class StringOperationsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("  India  ");
		String s2 = s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.length());
		
		System.out.println(s1.substring(2,5));
		System.out.println(s1.substring(2));
		System.out.println(s1.trim());
		//System.out.println(s1.strip());
		//System.out.println(s1.stripTrailing());
		System.out.println(s1.isEmpty());
		
		String s3 = "Good morning";
		String s4 = new String(s3);
		System.out.println("s3 equals s4"+ s3.equals(s4));
		System.out.println("s3 == s4"+ s3==s4);

	}

}
