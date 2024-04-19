package org.example.item3.ex;

import java.io.Serializable;

public class Singleton3 implements Serializable {

    private static final transient Singleton3 instance = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}
