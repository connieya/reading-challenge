package org.example.chapter03;

public class LimitPriceCoupon extends Coupon{
    private int limitPrice;

    public LimitPriceCoupon(int limitPrice, int discountAmount) {
        super(discountAmount);
        this.limitPrice = limitPrice;
    }

    public int getLimitPrice() {
        return limitPrice;
    }

    @Override
    public int calculateDiscountPrice(int price) { // 재정의
        if (price < limitPrice) return price;
        return super.calculateDiscountPrice(price);
    }
}
