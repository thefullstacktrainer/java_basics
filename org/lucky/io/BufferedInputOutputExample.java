package org.lucky.io;

import java.io.*;

public class BufferedInputOutputExample {
    public static void main(String[] args) {
        try {
            // Writing to a file using BufferedOutputStream
            FileOutputStream fos = new FileOutputStream("output2.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write("Hello, World!".getBytes());
            bos.close();

            // Reading from the file using BufferedInputStream
            FileInputStream fis = new FileInputStream("output2.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int data;
            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
