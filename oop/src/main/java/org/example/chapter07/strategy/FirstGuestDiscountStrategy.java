package org.example.chapter07.strategy;

public class FirstGuestDiscountStrategy implements DiscountStrategy{
    @Override
    public int getDiscountPrice(Item item) {
        return (int) (item.getPrice() *0.9);
    }
}
