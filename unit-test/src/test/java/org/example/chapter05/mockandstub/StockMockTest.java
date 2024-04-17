package org.example.chapter05.mockandstub;

import org.example.chapter02.IStore;
import org.example.chapter02.LondonCustomer;
import org.example.chapter02.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StockMockTest {

    @Test
    @DisplayName("목이자 스텁인 storeMock")
    void purchaseFailsWhenNotEnoughInventory() throws Exception {
        // given
        IStore storeMock = mock(IStore.class);
        when(storeMock.hasInsufficientInventory(Product.SHAMPOO, 5)).thenReturn(true);
        LondonCustomer sut = new LondonCustomer();

        // when
        boolean success = sut.purchase(storeMock, Product.SHAMPOO, 5);

        // then
        assertFalse(success);
        verify(storeMock, times(0)).removeInventory(Product.SHAMPOO, 5);
    }
}
