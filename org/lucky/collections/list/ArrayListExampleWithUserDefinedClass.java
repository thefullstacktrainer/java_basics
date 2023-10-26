package org.lucky.collections.list;

import java.util.ArrayList;

public class ArrayListExampleWithUserDefinedClass {
    public static void main(String[] args) {
        // Create an ArrayList to store Course objects
        ArrayList<Course> courseList = new ArrayList<>();

        // Add Course objects to the ArrayList
        courseList.add(new Course("Java Programming", 40));
        courseList.add(new Course("Data Structures and Algorithms", 30));
        courseList.add(new Course("Machine Learning", 60));
        courseList.add(new Course("Web Development", 45));
        courseList.add(new Course("Artificial Intelligence", 50));

        // Access and print the Course objects
        System.out.println("List of Courses:");
        for (Course course : courseList) {
            System.out.println(course);
        }
    }
}

