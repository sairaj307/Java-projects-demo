package com.example.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(40);
		l.addFirst(5);
		l.add(2, 60);
		l.addLast(30);
		
		System.out.println("Number list is "+ l);
		System.out.println("First element is " + l.getFirst());
		System.out.println("Last element is "+ l.getLast());
		l.removeFirst();
		l.removeLast();
		
		System.out.println("Number List after removing tirst and last element is " + 11);
		ListIterator<Integer> li= l.listIterator(); 
		while (li.hasNext()) 
			System.out.print(li.next() + "\t");
		li = l.listIterator(l.size());
		while (li.hasPrevious ()) {
		int n = li.previous();
		System.out.print(n + "\t");
		if (n == 20)
			li.add(99999);
		if (n==60) 
			li.set(5555);
		}
		System.out.println("\nNumber List is " + l);
		Collections.sort(l);
		System.out.println("Number List in Ascending order is " + l);
		Collections.reverse(l);
		System.out.println("Number List in Descending order is " + l);
	}

}
