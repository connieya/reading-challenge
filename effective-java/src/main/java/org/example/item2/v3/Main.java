package org.example.item2.v3;

import static org.example.item2.v3.NyPizza.Size.*;
import static org.example.item2.v3.Pizza.Topping.*;

public class Main {

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240,0)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();

        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM)
                .sauceInside()
                .build();
    }
}
