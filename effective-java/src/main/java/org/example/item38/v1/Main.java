package org.example.item38.v1;

import org.example.item38.ExtendedOperation;
import org.example.item38.Operation;

public class Main {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        test(ExtendedOperation.class, x, y);

    }

    private static <T extends Enum<T> & Operation> void test(
            Class<T> opEnumType, double x, double y
    ) {
        for (Operation op : opEnumType.getEnumConstants()) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }
}
