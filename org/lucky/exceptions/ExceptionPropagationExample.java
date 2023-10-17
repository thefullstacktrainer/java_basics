package org.lucky.exceptions;

public class ExceptionPropagationExample {
    public static void main(String[] args) {
        method1();
    }

    static void method1() {
        method2();
    }

    static void method2() {
        int result = 10 / 0; // ArithmeticException
    }
}
