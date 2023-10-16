package org.lucky.classes.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read from the console

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read a line of text

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read an integer

        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble(); // Read a double

        // Display the user's input
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your height is " + height + " meters.");

        // Don't forget to close the Scanner when done to release system resources
        scanner.close();
    }
}
