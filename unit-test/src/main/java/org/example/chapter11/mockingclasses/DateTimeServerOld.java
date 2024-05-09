package org.example.chapter11.mockingclasses;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class DateTimeServerOld {
    private static Supplier<LocalDateTime> supplier;

    public static LocalDateTime now() {
        return supplier.get();
    }

    public static void init(Supplier<LocalDateTime> s) {
        supplier = s;
    }

    public static void main(String[] args) {
        DateTimeServerOld.init(LocalDateTime::now);  // 운영 환경 초기화 코드
        DateTimeServerOld.init(() -> LocalDateTime.of(2020, 1, 1, 0, 0)); // 단위 테스트 환경 초기화 코드
    }
}