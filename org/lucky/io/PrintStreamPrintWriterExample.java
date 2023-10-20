package org.lucky.io;

import java.io.*;

public class PrintStreamPrintWriterExample {
    public static void main(String[] args) {
        try {
            // Create a PrintStream for writing to a file
            PrintStream psFile = new PrintStream(new FileOutputStream("print_stream_output.txt"));

            // Write formatted text to the file using PrintStream
            psFile.println("PrintStream Example");
            psFile.printf("Value: %d, Text: %s%n", 42, "Hello");

            // Close the PrintStream for the file
            psFile.close();

            // Create a PrintWriter for writing to the console
            PrintWriter pwConsole = new PrintWriter(System.out);

            // Write formatted text to the console using PrintWriter
            pwConsole.println("PrintWriter Example");
            pwConsole.printf("Value: %d, Text: %s%n", 99, "World");

            // Flush the PrintWriter (for console output, flushing is important)
            pwConsole.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
