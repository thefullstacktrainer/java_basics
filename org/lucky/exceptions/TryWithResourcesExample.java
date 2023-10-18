package org.lucky.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        // Define the path to the file you want to read
        String filePath = "example.txt";

        // Using try-with-resources to open and read a file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read and print each line from the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle any IOException that may occur
            e.printStackTrace();
            System.out.println("catch block");
        }
        System.out.println("outside catch block");
    }
}
