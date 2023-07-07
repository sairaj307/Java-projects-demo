package com.example.collections;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // Create an ArrayDeque
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Add elements to the front of the dequeue
        deque.addFirst("Element 1");
        deque.addFirst("Element 2");
        deque.addFirst("Element 3");

        // Add elements to the end of the dequeue
        deque.addLast("Element 4");
        deque.addLast("Element 5");
        deque.addFirst(null);

        // Display the elements in the dequeue
        System.out.println("Deque: " + deque);

        // Retrieve and remove elements from the front of the dequeue
        String firstElement = deque.pollFirst();
        System.out.println("Removed First Element: " + firstElement);

        // Retrieve and remove elements from the end of the dequeue
        String lastElement = deque.pollLast();
        System.out.println("Removed Last Element: " + lastElement);

        // Display the elements in the dequeue after removal
        System.out.println("Deque after removal: " + deque);

        // Retrieve the first element in the dequeue without removing it
        String peekedFirstElement = deque.peekFirst();
        System.out.println("Peeked First Element: " + peekedFirstElement);

        // Retrieve the last element in the dequeue without removing it
        String peekedLastElement = deque.peekLast();
        System.out.println("Peeked Last Element: " + peekedLastElement);
        System.out.println(deque);
    }
}
