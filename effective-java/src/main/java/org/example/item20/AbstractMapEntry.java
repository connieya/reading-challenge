package org.example.item20;

import java.util.Map;

public class AbstractMapEntry<K, V> implements Map.Entry<K, V> {

    // 변경 가능한 엔트리는 이 메서드를 반드시 재정의해야 한다.
    @Override
    public V setValue(V value) {
        throw new UnsupportedOperationException();
    }
    @Override
    public K getKey() {
        return null;
    }

    @Override
    public V getValue() {
        return null;
    }


}
