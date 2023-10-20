package org.lucky.io;

import java.io.*;

public class SequenceInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis1 = new FileInputStream("output1.txt");
            FileInputStream fis2 = new FileInputStream("output2.txt");

            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

            int data;
            while ((data = sis.read()) != -1) {
                System.out.print((char) data);
            }

            sis.close();
            fis1.close();
            fis2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
