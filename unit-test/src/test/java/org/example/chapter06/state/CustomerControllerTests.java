package org.example.chapter06.state;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerControllerTests {

    @Test
    @DisplayName("예제 6.2 상태 기반 테스트")
    void addingAProductToAnOrder() {
        // given
        Product product = new Product("Hand Wash");
        Order sut = new Order();

        // when
        sut.addProduct(product);

        // then
        assertEquals(1, sut.products.size());
        assertEquals(product, sut.products.get(0));

    }
}
