package org.lucky.exceptions;

import java.io.*;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("nonexistent-file.txt");
            BufferedReader br = new BufferedReader(file);
        } catch (IOException e) {
            System.out.println("An IO Exception occurred: " + e.getMessage());
        }
        System.out.println("After Exception");
    }
}
