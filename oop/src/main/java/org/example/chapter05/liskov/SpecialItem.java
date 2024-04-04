package org.example.chapter05.liskov;

public class SpecialItem extends Item {

    @Override
    public boolean isDiscountAvailable() {
        return false;
    }
}
