package org.example.chapter03;

import org.example.chapter02.FileDataReader;
import org.example.chapter02.FlowController;

public class Main {

    public void testProcess() {
        ByteSource mockSource = new MockByteSource();
        FlowController fc = new FlowController(mockSource);
        fc.process();
        // 결과가 정상적으로 만들어졌는지 확인하는 코드
    }

    public static void main(String[] args) {
        Product product = new Product();
        Coupon coupon = new Coupon(3000);
        int price= coupon.calculateDiscountPrice(product.getPrice());

        TurboPlane tp = new TurboPlane();
        Plane p =tp;
        p.fly();

        Turbo t = tp;
        t.boost();

        tp.fly();
        tp.boost();


    }
}
