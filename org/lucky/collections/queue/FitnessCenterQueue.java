package org.lucky.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

class FitnessCenterVisitor {
    String name;
    int age;

    public FitnessCenterVisitor(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class FitnessCenterQueue {
    public static void main(String[] args) {
        Deque<FitnessCenterVisitor> fitnessQueue = new ArrayDeque<>();

        // Simulate visitors at a fitness center in India
        fitnessQueue.addLast(new FitnessCenterVisitor("Amit", 25));
        fitnessQueue.addLast(new FitnessCenterVisitor("Priya", 30));
        fitnessQueue.addLast(new FitnessCenterVisitor("Rahul", 28));
        fitnessQueue.addLast(new FitnessCenterVisitor("Sneha", 22));

        System.out.println("Visitors in the fitness center queue:");

        Iterator<FitnessCenterVisitor> iterator = fitnessQueue.iterator();
        while (iterator.hasNext()) {
            FitnessCenterVisitor visitor = iterator.next();
            System.out.println(visitor.name + " - Age: " + visitor.age);
        }

        // Serve the next visitor in the queue
        FitnessCenterVisitor nextVisitor = fitnessQueue.pollFirst();

        System.out.println("\nServed the next visitor:");
        System.out.println("Served: " + nextVisitor.name);

        System.out.println("\nRemaining visitors in the queue:");

        Iterator<FitnessCenterVisitor> iterator2 = fitnessQueue.iterator();
        while (iterator2.hasNext()) {
            FitnessCenterVisitor visitor = iterator2.next();
            System.out.println(visitor.name + " - Age: " + visitor.age);
        }
    }
}
