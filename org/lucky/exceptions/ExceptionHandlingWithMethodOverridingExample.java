package org.lucky.exceptions;

class Parent {
    void display() throws Exception {
        System.out.println("Parent's display method");
    }
}

class Child extends Parent {
    @Override
    void display() throws RuntimeException {
        System.out.println("Child's display method");
    }
}

public class ExceptionHandlingWithMethodOverridingExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        try {
            parent.display();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
