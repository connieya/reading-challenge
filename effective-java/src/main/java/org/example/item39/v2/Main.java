package org.example.item39.v2;

public class Main {

    @ExceptionTest(IndexOutOfBoundsException.class)
    @ExceptionTest(NullPointerException.class)
    public static void doublyBad() {//...
    }
}
