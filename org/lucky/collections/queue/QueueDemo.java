package org.lucky.collections.queue;

import java.util.*;
import java.util.concurrent.*;

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

    public String getName() {
        return name;
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        // LinkedList as Queue with Indian Employee names
        Queue<Employee> linkedListQueue = new LinkedList<>();
        linkedListQueue.add(new Employee("Amit", 101));
        linkedListQueue.add(new Employee("Priya", 102));
        linkedListQueue.add(new Employee("Rajesh", 103));

        // PriorityQueue with Indian Employee names
        Queue<Employee> priorityQueue = new PriorityQueue<>(Comparator.comparing(Employee::getName));
        priorityQueue.add(new Employee("Sunita", 104));
        priorityQueue.add(new Employee("Manoj", 105));
        priorityQueue.add(new Employee("Deepika", 106));

        // ArrayDeque as Queue with Indian Employee names
        Queue<Employee> arrayDequeQueue = new ArrayDeque<>();
        arrayDequeQueue.add(new Employee("Arun", 107));
        arrayDequeQueue.add(new Employee("Neha", 108));
        arrayDequeQueue.add(new Employee("Vikram", 109));

        // ConcurrentLinkedQueue with Indian Employee names
        Queue<Employee> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        concurrentLinkedQueue.add(new Employee("Ravi", 110));
        concurrentLinkedQueue.add(new Employee("Sneha", 111));
        concurrentLinkedQueue.add(new Employee("Harish", 112));

        // BlockingQueue (LinkedBlockingQueue) with Indian Employee names
        BlockingQueue<Employee> linkedBlockingQueue = new LinkedBlockingQueue<>();
        linkedBlockingQueue.add(new Employee("Vijay", 113));
        linkedBlockingQueue.add(new Employee("Pooja", 114));
        linkedBlockingQueue.add(new Employee("Anand", 115));

        // PriorityBlockingQueue with Indian Employee names
        Queue<Employee> priorityBlockingQueue = new PriorityBlockingQueue<>(3, Comparator.comparing(Employee::getName));
        priorityBlockingQueue.add(new Employee("Kiran", 116));
        priorityBlockingQueue.add(new Employee("Swati", 117));
        priorityBlockingQueue.add(new Employee("Prakash", 118));

        // Display the contents of each queue
        displayQueue("LinkedList Queue:", linkedListQueue);
        displayQueue("PriorityQueue:", priorityQueue);
        displayQueue("ArrayDeque Queue:", arrayDequeQueue);
        displayQueue("ConcurrentLinkedQueue:", concurrentLinkedQueue);
        displayQueue("LinkedBlockingQueue:", linkedBlockingQueue);
        displayQueue("PriorityBlockingQueue:", priorityBlockingQueue);
    }

    private static void displayQueue(String queueName, Queue<Employee> queue) {
        System.out.println(queueName);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println();
    }
}
