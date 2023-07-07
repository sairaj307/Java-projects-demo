package com.example.collections;

//import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Create a priority queue of integers
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the priority queue
        priorityQueue.offer(5);
        priorityQueue.offer(3);
        priorityQueue.offer(8);
        priorityQueue.offer(1);
        priorityQueue.offer(10);
 //  PriorityQueue is typically implemented as a binary heap
/*binary min-heap representation
        1
       / \
      3   8
     / \
    5   10
*/

        // Display the elements in the priority queue
        System.out.println("Priority Queue: " + priorityQueue);

        // Peek the head of the priority queue (the smallest element)
        Integer peekedElement = priorityQueue.peek();
        System.out.println("Peeked Element: " + peekedElement);

        // Remove the head of the priority queue (the smallest element)
        Integer removedElement = priorityQueue.poll();
        System.out.println("Removed Element: " + removedElement);

        // Display the elements in the priority queue after removal
        System.out.println("Priority Queue after removal: " + priorityQueue);

        // Check if the priority queue contains a specific element
        boolean containsElement = priorityQueue.contains(8);
        System.out.println("Priority Queue contains 8: " + containsElement);

        // Retrieve and remove the head of the priority queue (alternative to poll)
        Integer element = priorityQueue.remove();
        System.out.println("Removed Element using remove(): " + element);

        // Clear the priority queue
        priorityQueue.clear();
        System.out.println("Priority Queue after clearing: " + priorityQueue);

        // Check if the priority queue is empty
        boolean isEmpty = priorityQueue.isEmpty();
        System.out.println("Priority Queue is empty: " + isEmpty);
    }
}
