package org.example.item37;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
//        Set<Plant> garden = new HashSet<>();
//        Set<Plant> [] plantsByLifeCycle = (Set<Plant>[]) new Set[Plant.LifeCycle.values().length];
//        for (int i = 0; i < plantsByLifeCycle.length; i++) {
//            plantsByLifeCycle[i] = new HashSet<>();
//
//        }
//        for (Plant p : garden) {
//            plantsByLifeCycle[p.lifeCycle.ordinal()].add(p);
//        }
//
//        for (int i = 0; i < plantsByLifeCycle.length; i++) {
//            System.out.printf("%s : %s%n", Plant.LifeCycle.values()[i], plantsByLifeCycle[i]);
//        }

        Set<Plant> garden = new HashSet<>();
        Map<Plant.LifeCycle , Set<Plant>> plantsByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);

        for (Plant.LifeCycle lc : Plant.LifeCycle.values()) {
            plantsByLifeCycle.put(lc,new HashSet<>());
        }
        for (Plant p : garden) {
            plantsByLifeCycle.get(p.lifeCycle).add(p);
        }

        System.out.println(plantsByLifeCycle);
    }
}
