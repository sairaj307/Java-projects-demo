package com.example.collections;

import java.util.HashSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import java.io.*;

@SuppressWarnings("serial")
class CustomHashSet<E> extends HashSet<E> {
    @Override
    public boolean add(E element) {
        // Custom behavior when adding elements to the HashSet
        System.out.println("Adding element: " + element);
        return super.add(element);
    }
}

public class HashSetExample {
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
        // Creating a HashSet
        Set<String> hashSet = new HashSet<>();

        // Adding elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");
        hashSet.add("Mango");
        hashSet.add(null);
        hashSet.add("Mango"); // adding twice

        System.out.println("hashSet: " + hashSet);
        System.out.println("hashCode value for hashSet: "+hashSet.hashCode());
        // Cloning the HashSet
        Collection<?> clonedSet = (Collection<?>) ((HashSet<String>) hashSet).clone();
        System.out.println("Cloned Set: " + clonedSet);

        System.out.println("Is clonedSet's all elements present in hashSet: "+ hashSet.containsAll(clonedSet));
        // Serialization and Deserialization
        try {
            // Serialization
            FileOutputStream fileOut = new FileOutputStream("hashSet.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(hashSet);
            objectOut.close();
            fileOut.close();            
            

            // Deserialization
            FileInputStream fileIn = new FileInputStream("hashSet.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Set<String> deserializedSet = (HashSet<String>) objectIn.readObject();
            objectIn.close();
            fileIn.close();

            System.out.println("Deserialized Set: " + deserializedSet);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Customizing Behavior
        Set<String> customHashSet = new CustomHashSet<>();
        customHashSet.add("Custom1");
        customHashSet.add("Custom2");
        System.out.println("Custom HashSet: " + customHashSet);

        // Resizing
        System.out.println("Initial Capacity: " + hashSet.size());
        hashSet.add("Watermelon");
        System.out.println("Updated Capacity: " + hashSet.size());
        /*
         * Please note that for the resizing part, 
         * the code only showcases the change in capacity before and after adding an element. 
         * The resizing process in HashSet is handled internally and automatically 
         * when the load factor exceeds a certain threshold.
         */

        

     // Demonstrating unsuitability for concurrent use by multiple threads
        Thread thread1 = new Thread(() -> {
            try {
                synchronized (hashSet) {
                    Iterator<String> iterator = hashSet.iterator();
                    while (iterator.hasNext()) {
                        String element = iterator.next();
                        System.out.println("Thread 1: " + element);
                        Thread.sleep(500);
                    }
                }
            } catch (ConcurrentModificationException e) {
                System.out.println("Thread 1: Concurrent Modification Exception occurred!");
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                synchronized (hashSet) {
                    hashSet.add("Pineapple");
                    Iterator<String> iterator = hashSet.iterator();
                    while (iterator.hasNext()) {
                        String element = iterator.next();
                        System.out.println("Thread 2: " + element);
                        Thread.sleep(500);
                    }
                }
            } catch (ConcurrentModificationException e) {
                System.out.println("Thread 2: Concurrent Modification Exception occurred!");
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
            thread1.start();
            thread2.start();
            try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println(hashSet);
            //hashSet.clear();
            System.out.println("Is hashSet empty: "+ hashSet.isEmpty());
    }
    
}
