package org.example.item34;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;
import static org.example.item34.Operation.*;

public class Main {

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        for (Operation op : values()) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }

    private static final Map<String, Operation> stringToEnum =
            Stream.of(values()).collect(
                    toMap(Object::toString, e -> e));

    public static Optional<Operation> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }

    public static Operation inverse(Operation op) {
        switch (op) {
            case PLUS: return MINUS;
            case MINUS:  return PLUS;
            case TIMES:return DIVIDE;
            case DIVIDE: return TIMES;
            default: throw new AssertionError("알 수 없는 연산:" + op);
        }
    }
}
