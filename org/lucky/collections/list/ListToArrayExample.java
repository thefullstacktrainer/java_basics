package org.lucky.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // Approach 1: Using the toArray() method
        String[] array1 = list.toArray(new String[list.size()]);

        System.out.println("Approach 1: Using toArray() method to convert List to Array:");
        for (String element : array1) {
            System.out.println(element);
        }

        // Approach 2: Creating an array manually
        String[] array2 = new String[list.size()];
        list.toArray(array2);

        System.out.println("\nApproach 2: Creating an array manually to convert List to Array:");
        for (String element : array2) {
            System.out.println(element);
        }
    }
}
