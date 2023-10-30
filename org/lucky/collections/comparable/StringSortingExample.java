package org.lucky.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSortingExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Banana");
        stringList.add("Apple");
        stringList.add("Orange");
        stringList.add("Grapes");

        // Sorting the list of strings in lexicographical order
        Collections.sort(stringList);

        // Printing the sorted list
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
