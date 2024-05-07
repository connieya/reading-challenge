package org.example.item13;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    static Comparator<Object> hashCodeOrder = new Comparator<Object>() {
        @Override
        public int compare(Object o1, Object o2) {
            return o1.hashCode() - o2.hashCode();
        }
    };

    private static class Thing {

    }

    private static final Thing[] PRIVATE_VALUES = new Thing[5];

    public static final Thing[] values() {
        return PRIVATE_VALUES.clone();
    }

    public static final List<Thing> VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));


}
