package org.lucky.io;

import java.io.*;

public class PipeCommunicationExample {
    public static void main(String[] args) {
        try {
            PipedWriter writer = new PipedWriter();
            PipedReader reader = new PipedReader();

            // Connect the writer and reader
            writer.connect(reader);

            // Create a thread for writing data
            Thread writerThread = new Thread(() -> {
                try {
                    writer.write("Data sent from the writer to the reader.");
                    writer.close();  // Close the writer when done
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // Create a thread for reading data
            Thread readerThread = new Thread(() -> {
                try {
                    int data;
                    while ((data = reader.read()) != -1) {
                        System.out.print((char) data);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // Start the writer and reader threads
            writerThread.start();
            readerThread.start();

            // Wait for both threads to finish
            writerThread.join();
            readerThread.join();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
