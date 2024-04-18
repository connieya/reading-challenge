package org.example.chapter07.decorator;

public class EncryptionOut extends Decorator {
    public EncryptionOut(FileOut delegate) {
        super(delegate);
    }


    private byte[] encrypt(byte[] data) {
        return new byte[0];
    }

    @Override
    public void write(byte[] data) {
        byte[] encryptedData = encrypt(data);
        super.doDelegate(encryptedData);
    }
}

