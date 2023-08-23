package headfirst_design_pattern.adapter.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            numbers.add(20);
        }
        System.out.println(numbers);
    }
}
