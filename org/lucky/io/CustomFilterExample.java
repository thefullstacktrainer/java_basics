package org.lucky.io;

import java.io.*;

class UppercaseFilterInputStream extends FilterInputStream {
    UppercaseFilterInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int data = super.read();
        if (data != -1) {
            data = Character.toUpperCase((char) data);
        }
        return data;
    }
}

class UppercaseFilterOutputStream extends FilterOutputStream {
    UppercaseFilterOutputStream(OutputStream out) {
        super(out);
    }

    @Override
    public void write(int b) throws IOException {
        super.write(Character.toUpperCase((char) b));
    }
}

public class CustomFilterExample {
    public static void main(String[] args) {
        try {
            // Create a FileInputStream to read from the source file
            FileInputStream sourceFile = new FileInputStream("output.txt");

            // Create a UppercaseFilterInputStream to filter data
            UppercaseFilterInputStream filterInputStream = new UppercaseFilterInputStream(sourceFile);

            // Create a FileOutputStream to write to the destination file
            FileOutputStream destinationFile = new FileOutputStream("destination.txt");

            // Create a UppercaseFilterOutputStream to write filtered data
            UppercaseFilterOutputStream filterOutputStream = new UppercaseFilterOutputStream(destinationFile);

            int byteData;
            while ((byteData = filterInputStream.read()) != -1) {
                filterOutputStream.write(byteData);
            }

            filterInputStream.close();
            filterOutputStream.close();

            System.out.println("Data filtered and written to destination.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
