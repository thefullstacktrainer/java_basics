package org.lucky.io;

import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.println("Console is not available.");
            System.exit(1);
        }

        String name = console.readLine("Enter your name: ");
        char[] password = console.readPassword("Enter your password: ");

        console.printf("Hello, %s! Your password is %s%n", name, new String(password));

        // Clear the password from memory for security
        for (int i = 0; i < password.length; i++) {
            password[i] = ' ';
        }
    }
}
