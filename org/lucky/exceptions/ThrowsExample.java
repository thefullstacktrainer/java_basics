package org.lucky.exceptions;

import java.io.IOException;

public class ThrowsExample {
    public static void main(String[] args) throws IOException {
        readFile("nonexistent-file.txt");
    }

    static void readFile(String filename) throws IOException {
        // Code to read a file
        throw new IOException("File not found.");
    }
}
