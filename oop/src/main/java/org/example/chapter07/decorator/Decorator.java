package org.example.chapter07.decorator;

public abstract class Decorator implements FileOut {

    private FileOut delegate;

    public Decorator(FileOut delegate) {
        this.delegate = delegate;
    }

    protected void doDelegate(byte[] data) {
        delegate.write(data);
    }
}
