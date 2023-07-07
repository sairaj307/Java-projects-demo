package com.example.collections;
import java.util.*;

import com.example.multithreading.Consumer;

public class ArrayListDemo {

	//@SuppressWarnings("removal")
	public static void main(String[] args) {
		List<Object> l = new ArrayList<>();
		l.add(10);
		l.add(new String("Gayatri"));
		l.add(new Consumer());
		l.add('s');
		l.add(new String("Gayatri"));
		l.add(new String("Gayatri"));
		l.add(new String("Gayatri"));
		l.add(new String("Gayatri"));
		l.add(new String("Gayatri"));
		l.add(new String("Gayatri"));
		l.add(4, new String("SAIRAJ"));
		System.out.println(l.size());
		Iterator<Object> i = l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		ArrayList<Object> l1 = new ArrayList<>();
		l1.addAll(l);
		System.out.println(l1);
	}
}
