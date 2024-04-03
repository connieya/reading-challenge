package org.example.chapter02;

import org.example.chapter03.ByteSource;

public class SocketDataReader implements ByteSource {
    @Override
    public byte[] read() {
        return new byte[0];
    }
}
