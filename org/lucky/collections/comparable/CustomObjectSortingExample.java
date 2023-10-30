package org.lucky.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomObjectSortingExample {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", 25));
        personList.add(new Person("Bob", 30));
        personList.add(new Person("Charlie", 20));

        // Sorting the list of Person objects by age
        Collections.sort(personList);

        // Printing the sorted list
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}