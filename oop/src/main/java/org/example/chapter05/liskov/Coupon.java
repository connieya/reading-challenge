package org.example.chapter05.liskov;

public class Coupon {

    private int discountRate;

    public int calculateDiscountAmount(Item item){
       if (!item.isDiscountAvailable()) return 0;
        return item.getPrice() * discountRate;
    }
}
