package org.example.item2.v3;

public class Main {

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240,0)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
    }
}
