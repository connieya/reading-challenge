package org.example.chapter03;

public class Coupon {
    private int discountAmount;

    public Coupon(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }

    public int calculateDiscountPrice(int price) {
        if (price < discountAmount) return 0;
        return price - discountAmount;
    }
}
