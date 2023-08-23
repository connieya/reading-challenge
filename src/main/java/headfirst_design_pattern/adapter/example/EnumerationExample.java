package headfirst_design_pattern.adapter.example;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {
    public static void main(String[] args) {
        Vector<Integer> numbers  =  new Vector<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Enumeration<Integer> enumeration = numbers.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
