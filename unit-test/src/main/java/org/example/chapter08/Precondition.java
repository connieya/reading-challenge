package org.example.chapter08;

public class Precondition {
    public static void Requires(boolean precondition, String message) throws Exception {
        if (precondition == false)
            throw new Exception(message);
    }
}
