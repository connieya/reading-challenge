package org.example.chapter03;

import org.example.chapter02.FileDataReader;
import org.example.chapter02.SocketDataReader;

public class ByteSourceFactory {

    public ByteSource create() {
        if (useFile()) {
            return new FileDataReader();
        }
        return new SocketDataReader();
    }

    private boolean useFile() {
        String userFileVal = System.getProperty("useFile");
        return userFileVal != null && Boolean.parseBoolean(userFileVal);
    }

    private static ByteSourceFactory instance = new ByteSourceFactory();

    public static ByteSourceFactory getInstance() {
        return instance;
    }

    private ByteSourceFactory() {
    }
}
