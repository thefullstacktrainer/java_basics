package org.lucky.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSortingExample {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(50);
        integerList.add(20);
        integerList.add(80);
        integerList.add(10);

        // Sorting the list of integers in natural order
        Collections.sort(integerList);

        // Printing the sorted list
        for (Integer num : integerList) {
            System.out.println(num);
        }
    }
}
