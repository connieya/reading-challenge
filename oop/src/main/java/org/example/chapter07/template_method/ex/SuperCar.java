package org.example.chapter07.template_method.ex;

public class SuperCar extends ZetEngine {

    private boolean notReady;

    @Override
    void turnOn() {
        // 하위 클래스에서 흐름 제어
        if (notReady) {
            beep();
        }
    }

    private void beep() {
    }
}
