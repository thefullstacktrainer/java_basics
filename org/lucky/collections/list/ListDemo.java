package org.lucky.collections.list;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListDemo {
    public static void main(String[] args) {
        // ArrayList with Indian names
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Amit");
        arrayList.add("Priya");
        arrayList.add("Rajesh");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList with Indian names
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Sunita");
        linkedList.add("Manoj");
        linkedList.add("Deepika");
        System.out.println("LinkedList: " + linkedList);

        // Vector with Indian names
        List<String> vector = new Vector<>();
        vector.add("Arun");
        vector.add("Neha");
        vector.add("Vikram");
        System.out.println("Vector: " + vector);

        // CopyOnWriteArrayList with Indian names
        List<String> copyOnWriteList = new CopyOnWriteArrayList<>();
        copyOnWriteList.add("Ravi");
        copyOnWriteList.add("Sneha");
        copyOnWriteList.add("Harish");
        System.out.println("CopyOnWriteArrayList: " + copyOnWriteList);

        // Stack with Indian names
        Stack<String> stack = new Stack<>();
        stack.push("Shreya");
        stack.push("Rahul");
        stack.push("Anita");
        System.out.println("Stack: " + stack);

        // Immutable List with Indian names
        List<String> originalList = Arrays.asList("Vijay", "Pooja", "Anand");
        List<String> immutableList = Collections.unmodifiableList(originalList);
        System.out.println("Immutable List: " + immutableList);

        // Custom List with Indian names
        List<String> customList = new CustomList<>();
        customList.add("Kiran");
        customList.add("Swati");
        customList.add("Prakash");
        System.out.println("Custom List: " + customList);
    }

    static class CustomList<E> extends AbstractList<E> {
        private List<E> internalList = new ArrayList<>();

        @Override
        public E get(int index) {
            return internalList.get(index);
        }

        @Override
        public E set(int index, E element) {
            return internalList.set(index, element);
        }

        @Override
        public void add(int index, E element) {
            internalList.add(index, element);
        }

        @Override
        public E remove(int index) {
            return internalList.remove(index);
        }

        @Override
        public int size() {
            return internalList.size();
        }
    }
}
