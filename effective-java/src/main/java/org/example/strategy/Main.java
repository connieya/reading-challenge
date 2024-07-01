package org.example.strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input;
    CharProvider charProvider = new CharProvider();

        while (true) {
            System.out.println("문자를 입력하세요 (q를 입력하면 프로그램이 종료됩니다): ");
            input = scanner.next().charAt(0);
            if (input == 'q') {
                break;
            }
            CharStrategy strategy = charProvider.getStrategy(input);
            strategy.execute();


        }

        scanner.close();
    }
}
