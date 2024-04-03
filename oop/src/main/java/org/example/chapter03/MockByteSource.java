package org.example.chapter03;

public class MockByteSource implements ByteSource {
    @Override
    public byte[] read() {
        return new byte[128];
    }
}
