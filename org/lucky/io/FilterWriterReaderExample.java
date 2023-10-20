package org.lucky.io;

import java.io.*;

class UppercaseFilterWriter extends FilterWriter {
    UppercaseFilterWriter(Writer out) {
        super(out);
    }

    @Override
    public void write(int c) throws IOException {
        if (Character.isLowerCase(c)) {
            c = Character.toUpperCase(c);
        }
        super.write(c);
    }
}

class CharacterCountFilterReader extends FilterReader {
    private int characterCount = 0;

    CharacterCountFilterReader(Reader in) {
        super(in);
    }

    public int getCharacterCount() {
        return characterCount;
    }

    @Override
    public int read() throws IOException {
        int data = super.read();
        if (data != -1) {
            characterCount++;
        }
        return data;
    }
}

public class FilterWriterReaderExample {
    public static void main(String[] args) {
        try {
            // Create a FileWriter for writing to a file
            FileWriter fileWriter = new FileWriter("filtered_output.txt");

            // Create an UppercaseFilterWriter to write uppercase text
            UppercaseFilterWriter writer = new UppercaseFilterWriter(fileWriter);

            // Write text using the UppercaseFilterWriter
            writer.write("FilterWriter Example");
            writer.write("\nText is converted to uppercase.");

            // Close the UppercaseFilterWriter
            writer.close();

            // Create a FileReader for reading from the file
            FileReader fileReader = new FileReader("filtered_output.txt");

            // Create a CharacterCountFilterReader to count characters while reading
            CharacterCountFilterReader reader = new CharacterCountFilterReader(fileReader);

            // Read and display text from the CharacterCountFilterReader
            int charData;
            while ((charData = reader.read()) != -1) {
                System.out.print((char) charData);
            }

            System.out.println("\nCharacter Count: " + reader.getCharacterCount());

            // Close the CharacterCountFilterReader (no need to close UppercaseFilterWriter)
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
