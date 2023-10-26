package org.lucky.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        // Adding elements to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Creating a ListIterator for the ArrayList
        ListIterator<String> listIterator = colors.listIterator();

        System.out.println("Traversing forward:");
        while (listIterator.hasNext()) {
            int index = listIterator.nextIndex();
            String color = listIterator.next();
            System.out.println("Index " + index + ": " + color);

            // Modify the element while traversing forward
            if (color.equals("Green")) {
                listIterator.set("Orange"); // Replaces "Green" with "Orange"
            }
        }

        System.out.println("\nTraversing backward:");
        while (listIterator.hasPrevious()) {
            int index = listIterator.previousIndex();
            String color = listIterator.previous();
            System.out.println("Index " + index + ": " + color);

            // Add an element while traversing backward
            if (color.equals("Red")) {
                listIterator.add("Purple"); // Adds "Purple" before "Red"
            }
        }

        // Display the modified ArrayList
        System.out.println("\nModified ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
