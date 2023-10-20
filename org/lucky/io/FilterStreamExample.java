package org.lucky.io;

import java.io.*;

public class FilterStreamExample {
    public static void main(String[] args) {
        try {
            // FilterOutputStream example
            FileOutputStream fos = new FileOutputStream("output.txt");
            PrintStream ps = new PrintStream(fos);

            // Use PrintStream to write formatted data to the file
            ps.println("Hello, World!");
            ps.println("This is a formatted line.");

            // Close the PrintStream
            ps.close();

            // FilterInputStream example
            FileInputStream fis = new FileInputStream("output.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            // Read and display data from the file using BufferedInputStream
            int byteData;
            while ((byteData = bis.read()) != -1) {
                System.out.print((char) byteData);
            }

            // Close the BufferedInputStream
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
