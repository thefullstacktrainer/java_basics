package org.lucky.io;

import java.io.*;

public class DataIOExample {
    public static void main(String[] args) {
        try {
            // Create a DataOutputStream for writing to a file
            FileOutputStream fos = new FileOutputStream("data_output.dat");
            DataOutputStream dos = new DataOutputStream(fos);

            // Write data to the file using DataOutputStream
            dos.writeInt(42);
            dos.writeDouble(3.14);
            dos.writeUTF("Data Example");

            // Close the DataOutputStream
            dos.close();

            // Create a DataInputStream for reading from the file
            FileInputStream fis = new FileInputStream("data_output.dat");
            DataInputStream dis = new DataInputStream(fis);

            // Read and display data from the file using DataInputStream
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            String stringValue = dis.readUTF();

            System.out.println("Int Value: " + intValue);
            System.out.println("Double Value: " + doubleValue);
            System.out.println("String Value: " + stringValue);

            // Close the DataInputStream
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
