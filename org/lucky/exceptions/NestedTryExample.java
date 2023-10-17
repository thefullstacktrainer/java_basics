package org.lucky.exceptions;

public class NestedTryExample {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };
            try {
                int value = numbers[3]; // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch block: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Outer catch block: " + e.getMessage());
        }
    }
}
