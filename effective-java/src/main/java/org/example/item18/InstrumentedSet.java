package org.example.item18;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class InstrumentedSet<E> extends ForwardingSet<E> {

    // 추가된 원소의 수
    private int addCount = 0;

    public InstrumentedSet(Set<E> s) {
        super(s);
    }


    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
