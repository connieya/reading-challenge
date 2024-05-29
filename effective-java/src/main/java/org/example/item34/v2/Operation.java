package org.example.item34.v2;

public enum Operation {
    PLUS("+") {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        public double apply(double x, double y) {
            return x - y;
        }
    }, TIMES("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    }, DIVIDE("/") {
        public double apply(double x, double y) {
            return x / y;
        }
    };


    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    // 상수가 뜻하는 연산을 수행한다.
    public abstract double apply(double x, double y);
}
