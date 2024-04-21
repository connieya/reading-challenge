package org.example.chapter06.output;

public class PriceEngine {
    public double calculateDiscount(Product[] products){
        double discount = products.length * 0.01;
        return Math.min(discount, 0.2);
    }
}
