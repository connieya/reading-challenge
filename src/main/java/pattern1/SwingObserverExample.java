package pattern1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) { // 프레임을 만들고 그 안에 버튼을 추가하는 간단한 스윙 어플리케이션
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("할까? 말까?");
        button.addActionListener(new AngelListener()); // 버튼을 누르면 반응하는 천사와 악마 리스너(옵저버) 를 만듬
        button.addActionListener(new DevilListener());
    }

    class AngelListener implements ActionListener { // 옵저버의 클래스 정의가 들어가는 부분
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("하지 마! 아마 후회할 걸?");
        }
    }

    class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("그냥 저질러 버렷!!!");
            // 주제(이 코드에서의 버튼) 의 상태가 바뀌었을 때 update() 메소드가 아니라 actionPerformed() 메소드가 호출된다.
        }
    }
}
