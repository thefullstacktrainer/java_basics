package org.lucky.io;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayExample {
    public static void main(String[] args) {
        try {
            // Create a CharArrayWriter to write characters to a character array
            CharArrayWriter writer = new CharArrayWriter();

            // Write characters to the CharArrayWriter
            writer.write("Hello, World!");
            writer.write(" This is a char array example.");

            // Get the character array
            char[] charArray = writer.toCharArray();

            // Create a CharArrayReader to read characters from the character array
            CharArrayReader reader = new CharArrayReader(charArray);

            // Read and display characters from the CharArrayReader
            int charData;
            while ((charData = reader.read()) != -1) {
                System.out.print((char) charData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
