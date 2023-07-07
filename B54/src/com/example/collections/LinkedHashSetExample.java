package com.example.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet of Strings
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Grape");
        linkedHashSet.add("Apple"); // Duplicate element, will not be added

        System.out.println("LinkedHashSet elements: " + linkedHashSet);

        // Size of the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

        // Removing an element from the LinkedHashSet
        linkedHashSet.remove("Orange");

        // Check if an element exists in the LinkedHashSet
        boolean containsBanana = linkedHashSet.contains("Banana");
        System.out.println("Contains Banana: " + containsBanana);

        // Iterating over the elements of LinkedHashSet
        System.out.println("Iterating over LinkedHashSet:");
        for (String element : linkedHashSet) {
            System.out.println(element);
        }

        // Clearing the LinkedHashSet
        linkedHashSet.clear();

        // Check if the LinkedHashSet is empty
        boolean isEmpty = linkedHashSet.isEmpty();
        System.out.println("Is LinkedHashSet empty: " + isEmpty);
    }
}
