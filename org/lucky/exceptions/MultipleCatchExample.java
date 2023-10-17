package org.lucky.exceptions;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length(); // NullPointerException
            int result = 10 / 0; // ArithmeticException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }
    }
}
