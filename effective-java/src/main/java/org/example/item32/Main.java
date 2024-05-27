package org.example.item32;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    static void dangerous(List<String>... stringLists) {
        List<Integer> intList = List.of(42);
        Object[] objects = stringLists;
        objects[0] = intList; // 힙 오염
        String s = stringLists[0].get(0); // ClassCastException
    }

    static <T> T[] pickTwo(T a, T b, T c) {
        switch (ThreadLocalRandom.current().nextInt(3)) {
            case 0:
                return toArray(a, b);
            case 1:
                return toArray(a, c);
            case 2:
                return toArray(b,c);
        }
        throw new AssertionError(); // 도달 할 수 없다.
    }

    private static <T> T[] toArray(T a, T b) {
        return null;
    }

    public static void main(String[] args) {
        String [] attributes = pickTwo("좋은","빠른","저렴한");
    }
}
