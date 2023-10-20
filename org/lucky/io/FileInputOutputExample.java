package org.lucky.io;

import java.io.*;

public class FileInputOutputExample {
    public static void main(String[] args) {
        try {
            // Writing to a file
            FileOutputStream fos = new FileOutputStream("output1.txt");
            fos.write("Hello, World!".getBytes());
            fos.close();

            // Reading from the file
            FileInputStream fis = new FileInputStream("output1.txt");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
