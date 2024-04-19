package org.example.item3.ex;

import java.lang.reflect.Constructor;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton1 singleton = Singleton1.instance;
        Singleton2 instance = Singleton2.getInstance();

    }
}
