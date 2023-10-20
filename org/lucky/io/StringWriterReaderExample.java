package org.lucky.io;

import java.io.*;

public class StringWriterReaderExample {
    public static void main(String[] args) {
        try {
            // Create a StringWriter for writing characters to a string
            StringWriter writer = new StringWriter();

            // Write characters to the StringWriter
            writer.write("StringWriter Example");
            writer.write("\nCharacters are written to a string.");

            // Get the string from the StringWriter
            String writtenString = writer.toString();
            System.out.println(writtenString);

            // Create a StringReader for reading characters from the string
            StringReader reader = new StringReader(writtenString);

            // Read and display characters from the StringReader
            int charData;
            while ((charData = reader.read()) != -1) {
                System.out.print((char) charData);
            }

            // Close the StringReader (no need to close StringWriter)
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
