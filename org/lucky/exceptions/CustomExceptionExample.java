package org.lucky.exceptions;

class AgeValidationException1 extends Exception {
    public AgeValidationException1(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            int age = -5;
            if (age < 0) {
                throw new AgeValidationException1("Age cannot be negative.");
            }
        } catch (AgeValidationException1 e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
