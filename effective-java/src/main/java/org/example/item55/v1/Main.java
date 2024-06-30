package org.example.item55.v1;

import java.util.Collection;
import java.util.Objects;

public class Main {

    public static <E extends Comparable<E>> E max(Collection<E> c ) {
        if (c.isEmpty()) {
            throw new IllegalArgumentException("빈 컬렉션");
        }
        E result = null;
        for (E e : c) {
            if (result == null || e.compareTo(result) < 0) {
                result = Objects.requireNonNull(e);
            }
        }
        return result;
    }


}
