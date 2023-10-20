package org.lucky.io;

import java.io.*;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        try {
            // Create a File object for the file
            File file = new File("random_access_file.txt");

            // Create a RandomAccessFile in read-write mode
            RandomAccessFile raf = new RandomAccessFile(file, "rw");

            // Write data to the file at a specific position
            raf.seek(10);  // Move the file pointer to position 10
            raf.write("RandomAccess".getBytes());

            // Read data from the file at a specific position
            raf.seek(10);  // Move the file pointer to position 10
            byte[] buffer = new byte[12];
            raf.read(buffer);

            // Close the RandomAccessFile
            raf.close();

            // Display the data read from the file
            String data = new String(buffer);
            System.out.println("Data read from position 10: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
