package org.lucky.exceptions;

public class FinalVsFinallyVsFinalizeExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    @Override
    protected void finalize() {
        System.out.println("Finalize method called.");
    }
}
