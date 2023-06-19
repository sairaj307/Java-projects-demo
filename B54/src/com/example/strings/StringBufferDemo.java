package com.example.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer b = new StringBuffer("Hello!");
		
		System.out.println("b= "+ b);
		System.out.println("lenght= "+ b.length());
		System.out.println("capacity= "+ b.capacity());
		
		String s;
		int a = 42;
		b = new StringBuffer(40);
		s = b.append("a= ").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(b);
		
		b = new StringBuffer("I Java!");
		b.insert(2, "like  ");
		System.out.println(b);
		
		b.delete(7, 10);
		System.out.println(b);
		System.out.println(b.reverse());

	}

}
