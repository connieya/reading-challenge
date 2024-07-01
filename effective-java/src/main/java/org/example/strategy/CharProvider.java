package org.example.strategy;

import java.util.HashMap;
import java.util.Map;

public class CharProvider {
    private final Map<Character, CharStrategy> strategyMap;

    public CharProvider() {
        this.strategyMap = new HashMap<>();
        this.strategyMap.put('a', new AStrategy());
        this.strategyMap.put('b', new BStrategy());
        this.strategyMap.put('c', new CStrategy());
        this.strategyMap.put('q', new QStrategy());
    }

    public CharStrategy getStrategy(char c) {
        return this.strategyMap.get(c);
    }
}
