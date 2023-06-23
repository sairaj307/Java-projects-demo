package com.example.exceptions;

public class NestedTryCatch {

	public static void check() {
		String str = "TNS";
		int slen = str.length();
		System.out.println("String len: "+slen);
		String anotherString = null;
		int y=6;
		try {
			try {
				System.out.println(str.charAt(y));
			}catch(StringIndexOutOfBoundsException se){
				System.out.println("index is out of bound exception"+ se.getMessage());
			}
			System.out.println("string length"+ anotherString.length());

		}catch(NullPointerException npe) {
			System.err.println("Exceptionis thrown: "+ npe.getMessage());
		}
	}
}
