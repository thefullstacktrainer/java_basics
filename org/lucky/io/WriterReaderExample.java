package org.lucky.io;

import java.io.*;

public class WriterReaderExample {
    public static void main(String[] args) {
        try {
            // Create a FileWriter for writing to a file
            FileWriter writer = new FileWriter("text.txt");

            // Write text to the file using FileWriter
            writer.write("Hello, World!\n");
            writer.write("This is a text file example.");

            // Close the FileWriter
            writer.close();

            // Create a FileReader for reading from the file
            FileReader reader = new FileReader("text.txt");

            // Read and display text from the file using FileReader
            int charData;
            while ((charData = reader.read()) != -1) {
                System.out.print((char) charData);
            }

            // Close the FileReader
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
