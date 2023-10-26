package org.lucky.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListCourses {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>(); // Creating an ArrayList to store learning courses

        // Adding learning courses to the ArrayList
        courses.add("Java Programming");
        courses.add("Data Structures and Algorithms");
        courses.add("Machine Learning");
        courses.add("Web Development");
        courses.add("Artificial Intelligence");

        // Traverse the ArrayList using a for-each loop
        System.out.println("List of Learning Courses (Traversed using for-each loop):");
        for (String course : courses) {
            System.out.println(course);
        }
        System.out.println("------------------------------");
        // Get an element from the ArrayList
        String course2 = courses.get(2); // Retrieve the element at index 2
        System.out.println("Course at index 2: " + course2);
        // Modify an element in the ArrayList
        courses.set(3, "Computer Graphics"); // Set a new course at index 3
        System.out.println("------------------------------");
        // Create an iterator to traverse the ArrayList
        Iterator<String> iterator = courses.iterator();

        // Traverse the ArrayList using the iterator
        System.out.println("List of Learning Courses (Traversed using Iterator):");
        while (iterator.hasNext()) {
            String course = iterator.next();
            System.out.println(course);
        }

        System.out.println("------------------------------");
        // Sorting the ArrayList of courses
        Collections.sort(courses);

        // Traversing the sorted ArrayList through the for-each loop
        System.out.println("Sorted List of Learning Courses:");
        for (String course : courses) {
            System.out.println(course);
        }
    }
}
