package org.lucky.io;

import java.io.*;

public class BufferedWriterReaderExample {
    public static void main(String[] args) {
        try {
            // Create a BufferedWriter for writing to a file
            FileWriter fileWriter = new FileWriter("buffered_text.txt");
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // Write text to the file using BufferedWriter
            writer.write("Hello, World!\n");
            writer.write("This is a buffered text file example.");

            // Close the BufferedWriter
            writer.close();

            // Create a BufferedReader for reading from the file
            FileReader fileReader = new FileReader("buffered_text.txt");
            BufferedReader reader = new BufferedReader(fileReader);

            // Read and display text from the file using BufferedReader
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the BufferedReader
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
