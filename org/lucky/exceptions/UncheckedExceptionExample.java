package org.lucky.exceptions;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int result;
        int divisor = 0;
        try {
            result = 10 / divisor; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("An Arithmetic Exception occurred: " + e.getMessage());
        }
    }
}
