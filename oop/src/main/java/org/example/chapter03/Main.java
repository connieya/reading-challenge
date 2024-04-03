package org.example.chapter03;

public class Main {
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
