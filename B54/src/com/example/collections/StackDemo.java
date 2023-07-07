package com.example.collections;

import java.util.*;

import com.example.array.Student;

public class StackDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		st.push(new Float(12.34f));
		st.push(new Integer(234));
		st.push(new Student(12, "sai"));
		st.push(new Float(22.34f));
		st.push(new Integer(734));
		st.push(new Student(122, "sai"));
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
		ListIterator li = st.listIterator();
		while(li.hasNext()) {
			Object o = li.next();
			System.out.println(o);
		}
		
		
		
		
		

	}

}
