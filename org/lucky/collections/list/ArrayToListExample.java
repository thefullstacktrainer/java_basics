package org.lucky.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListExample {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "cherry", "date"};

        List<String> list = Arrays.asList(array);

        // The resulting list is a fixed-size list backed by the original array.
        System.out.println("List created from array: " + list);


        // Approach 2: Creating an ArrayList from the array (Modifiable list)
        List<String> list2 = new ArrayList<>(Arrays.asList(array));

        System.out.println("Approach 2: List created from array (Modifiable): " + list2);

        // Add a new element to the ArrayList
        list2.add("fig");
        System.out.println("Added 'fig' to the list: " + list2);

        // Remove an element from the ArrayList
        list2.remove("banana");
        System.out.println("Removed 'banana' from the list: " + list2);

        // Modify an element in the ArrayList
        list2.set(0, "apricot");
        System.out.println("Modified the first element to 'apricot': " + list2);
    }
}
