package org.example.chapter06.output;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CustomerControllerTests {

    @Test
    @DisplayName("예제 6.1 출력 기반 테스트")
    void discountOfTwoProducts() {
        // given
        Product product1 = new Product("Hand wash");
        Product product2 = new Product("Shampoo");

        Product[] products = {product1, product2};

        PriceEngine sut = new PriceEngine();

        // when
        double discount = sut.calculateDiscount(products);

        // then
        Assertions.assertEquals(0.02, discount);
    }
}
