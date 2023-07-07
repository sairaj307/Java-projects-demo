package com.example.collections;
import java.util.HashSet;
import java.util.Set;

import com.example.array.Student;

public class HashSetDemo1 {
	public static void main(String args[]) {
		Set<Student> studentSet = new HashSet<Student>();
		addElements(studentSet);
		System.out.println(studentSet);		
	}

	static void addElements(Set<Student> studentSet) {

		Student s1 = new Student(78,"Pooja");
		studentSet.add(s1);
		s1 = new Student(66,"Nikita");
		studentSet.add(s1);
		s1 = new Student( 73,"Deepa");
		studentSet.add(s1);
		s1 = new Student(81,"Neha");
		studentSet.add(s1);
		s1 = new Student(81,"Neha"); 
		studentSet.add(s1); //duplicate element can't insert

	}
}