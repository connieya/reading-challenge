package org.example.item44;

import java.util.Map;

public @FunctionalInterface interface EldestEntryRemovalFunction<K,V> {

    boolean remove(Map<K,V> map ,Map.Entry<K,V> eldest);
}
