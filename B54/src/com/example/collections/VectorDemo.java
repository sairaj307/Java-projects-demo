package com.example.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> animals = new Vector<>();
		animals.add("Dog");
		animals.add("Horse");
		animals.add("Cat");
		System.out.println("Initial Vector: "+ animals);
		//using get
		System.out.println("Elements at index 2: "+ animals.get(2));
		
		Iterator<String> it = animals.iterator();
		System.out.println("Vector: ");
		while(it.hasNext()) {
			System.out.print(it.next());
			System.out.print(", ");
		}
		System.out.println("Removed element: "+ animals.remove(1));
		System.out.println("New vector: "+ animals);
		
		animals.clear();
		System.out.println("Vector after clear: "+ animals);
		

	}

}
