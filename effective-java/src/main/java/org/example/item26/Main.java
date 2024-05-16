package org.example.item26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Main {

//    private final Collection<Stamp> stams = ...;

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings,Integer.valueOf(42));
        String s = strings.get(0);
    }

    private static void unsafeAdd(List list , Object o){
        list.add(o);
    }

    static int numElementsInCommon(Set<?> s1 ,Set<?> s2) {
        int result = 0;
        for (Object o1 : s1){
            if (s2.contains(o1))
                result++;
        }
        return result;
    }
}
