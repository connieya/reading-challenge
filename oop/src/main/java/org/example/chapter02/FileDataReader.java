package org.example.chapter02;

import org.example.chapter03.ByteSource;

public class FileDataReader implements ByteSource {

    public FileDataReader() {
    }

    public FileDataReader(String fileName) {

    }

    public byte[] read() {
        return new byte[0];
    }
}
