package org.lucky.collections.set;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getName() {
        return this.name;
    }
}

public class SetDemo {
    public static void main(String[] args) {
        // HashSet with Indian Employee names
        Set<Employee> hashSet = new HashSet<>();
        hashSet.add(new Employee("Amit", 101));
        hashSet.add(new Employee("Priya", 102));
        hashSet.add(new Employee("Rajesh", 103));

        // LinkedHashSet with Indian Employee names
        Set<Employee> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Employee("Sunita", 104));
        linkedHashSet.add(new Employee("Manoj", 105));
        linkedHashSet.add(new Employee("Deepika", 106));

        // TreeSet with Indian Employee names
        Set<Employee> treeSet = new TreeSet<>(Comparator.comparing(Employee::getName));
        treeSet.add(new Employee("Arun", 107));
        treeSet.add(new Employee("Neha", 108));
        treeSet.add(new Employee("Vikram", 109));

        // ConcurrentSkipListSet with Indian Employee names
        Set<Employee> concurrentSkipListSet = new ConcurrentSkipListSet<>(Comparator.comparing(Employee::getName));
        concurrentSkipListSet.add(new Employee("Ravi", 110));
        concurrentSkipListSet.add(new Employee("Sneha", 111));
        concurrentSkipListSet.add(new Employee("Harish", 112));

        // Display the contents of each set
        displaySet("HashSet:", hashSet);
        displaySet("LinkedHashSet:", linkedHashSet);
        displaySet("TreeSet:", treeSet);
        displaySet("ConcurrentSkipListSet:", concurrentSkipListSet);
    }

    private static void displaySet(String setName, Set<Employee> set) {
        System.out.println(setName);
        for (Employee employee : set) {
            System.out.println(employee);
        }
        System.out.println();
    }
}
