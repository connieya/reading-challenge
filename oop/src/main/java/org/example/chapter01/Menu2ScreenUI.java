package org.example.chapter01;

public class Menu2ScreenUI implements ScreenUI {
    @Override
    public void show() {
        System.out.println("메뉴2 화면으로 전환");
    }

    @Override
    public void handleButton1Click() {
        System.out.println("메뉴2 화면의 버튼 1 처리");
    }
}
