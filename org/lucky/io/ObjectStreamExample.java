package org.lucky.io;

import java.io.*;

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class ObjectStreamExample {
    public static void main(String[] args) {
        try {
            // Create and write objects to a file using ObjectOutputStream
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.dat"));
            oos.writeObject(new Person("Alice", 30));
            oos.writeObject(new Person("Bob", 25));
            oos.close();

            // Read and display objects from the file using ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.dat"));
            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();
            ois.close();

            System.out.println("Person 1: " + person1);
            System.out.println("Person 2: " + person2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
