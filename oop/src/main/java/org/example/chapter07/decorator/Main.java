package org.example.chapter07.decorator;

public class Main {

    byte[] data = new byte[0];

    public static void main(String[] args) {
        byte[] data = new byte[0];
        FileOut delegate = new FileOutImpl();
        FileOut fileOut = new EncryptionOut(delegate);
        fileOut.write(data);
    }
}
