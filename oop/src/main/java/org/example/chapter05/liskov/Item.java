package org.example.chapter05.liskov;

public class Item {
    private int price;

    public boolean isDiscountAvailable() {
        return true;
    }

    public int getPrice() {
        return price;
    }
}
