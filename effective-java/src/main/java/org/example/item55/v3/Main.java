package org.example.item55.v3;

import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;

public class Main {

    public static <E extends Comparable<E>> Optional<E> max(Collection<E> c ) {
        return c.stream().max(Comparator.naturalOrder());
    }


}
