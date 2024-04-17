package org.example.chapter07.strategy.ex;

import org.example.chapter07.strategy.Item;

public interface ItemDiscountStrategy {
    int getDiscountPrice(Item item);
}
