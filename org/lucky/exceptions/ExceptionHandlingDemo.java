package org.lucky.exceptions;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        // Scenario 1: ArithmeticException
        int num1 = 10;
        int num2 = 0;
        try {
            int result = num1 / num2; // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        // Scenario 2: NullPointerException
        String text = null;
        try {
            int length = text.length(); // Attempt to access a method on a null object
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("Error: The string is null.");
        }

        // Scenario 3: ArrayIndexOutOfBoundsException
        int[] numbers = { 1, 2, 3 };
        try {
            int value = numbers[3]; // Accessing an index that is out of bounds
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds.");
        }

        // Scenario 4: FileNotFoundException
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream("nonexistent-file.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }

        // Scenario 5: Custom Exception
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

class AgeValidationException extends Exception {
    public AgeValidationException(String message) {
        super(message);
    }
}
