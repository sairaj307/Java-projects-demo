package com.example.strings;
import java.util.*;
public class CharDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s);
		char c[] = {'a', 'b', 'c'};
		String s1 = new String(c);
		String s2 = new String(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		
		String longstr = "hey, " + "Sairaj " + "How are you";
		System.out.println(longstr);
		sc.close();

	}

}
