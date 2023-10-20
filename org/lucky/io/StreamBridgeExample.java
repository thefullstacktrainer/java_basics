package org.lucky.io;

import java.io.*;

public class StreamBridgeExample {
    public static void main(String[] args) {
        try {
            // Create an OutputStreamWriter for writing characters to a file
            FileOutputStream fos = new FileOutputStream("output_stream_writer.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);

            // Write characters to the file using OutputStreamWriter
            osw.write("OutputStreamWriter Example");
            osw.write("\nCharacters are converted to bytes and written.");

            // Close the OutputStreamWriter
            osw.close();

            // Create an InputStreamReader for reading characters from the file
            FileInputStream fis = new FileInputStream("output_stream_writer.txt");
            InputStreamReader isr = new InputStreamReader(fis);

            // Read and display characters from the InputStreamReader
            int charData;
            while ((charData = isr.read()) != -1) {
                System.out.print((char) charData);
            }

            // Close the InputStreamReader
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
