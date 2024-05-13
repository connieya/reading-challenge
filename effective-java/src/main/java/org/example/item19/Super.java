package org.example.item19;

public class Super {

    public Super() {
        // 잘못된 예 - 생성자가 재정의 가능 메서드르 호출한다.
        overrideMe();
    }

    public void overrideMe() {
    }
}
