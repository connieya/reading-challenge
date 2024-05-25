package org.example.item30;

import java.util.HashSet;
import java.util.Set;
import java.util.function.UnaryOperator;

public class Main {

    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    private static UnaryOperator<Object> INDENTITY_FN = (t) -> t;

    @SuppressWarnings("unchecked")
    public static <T> UnaryOperator<T> identityFunction() {
        return (UnaryOperator<T>) INDENTITY_FN;
    }

    public static void main(String[] args) {
        String [] strings = {"삼베","대마","나일론"};
        UnaryOperator<String> sameString = identityFunction();
        for (String s : strings) {
            System.out.println(sameString.apply(s));
        }

        Number[] numbers = {1,2.0,3L};
        UnaryOperator<Number> sameNumber = identityFunction();
        for (Number n : numbers) {
            System.out.println(sameNumber.apply(n));
        }


        Set<String> guys = Set.of("톰","딕","해리");
        Set<String> stooges = Set.of("래리","모에","컬리");
        Set<String> aflCio = union(guys,stooges);
        System.out.println(aflCio);
    }
}
