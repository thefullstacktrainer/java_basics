package org.lucky.io;

import java.io.*;

public class PushbackExample {
    public static void main(String[] args) {
        try {
            // Create a PushbackInputStream for reading bytes
            FileInputStream fis = new FileInputStream("pushback_input.txt");
            PushbackInputStream pushbackInputStream = new PushbackInputStream(fis);

            int firstByte = pushbackInputStream.read();
            System.out.println("First Byte: " + (char) firstByte);

            // Push the first byte back into the stream
            pushbackInputStream.unread(firstByte);

            // Now read and display the first byte again
            int readAgain = pushbackInputStream.read();
            System.out.println("Read Again: " + (char) readAgain);

            // Create a PushbackReader for reading characters
            FileReader fileReader = new FileReader("pushback_input.txt");
            PushbackReader pushbackReader = new PushbackReader(fileReader);

            int firstChar = pushbackReader.read();
            System.out.println("First Character: " + (char) firstChar);

            // Push the first character back into the stream
            pushbackReader.unread(firstChar);

            // Now read and display the first character again
            int readAgainChar = pushbackReader.read();
            System.out.println("Read Again Character: " + (char) readAgainChar);

            pushbackInputStream.close();
            pushbackReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
