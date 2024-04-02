package chapter2;

import org.example.chapter02.IStore;
import org.example.chapter02.LondonCustomer;
import org.example.chapter02.LondonStore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.example.chapter02.Product.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class LondonStyleTest {

    @Test
    @DisplayName("재고 내에서 구매 요청 성공 테스트")
    void purchaseSucceedsWhenEnoughInventory() throws Exception {
        // given
        IStore store = mock(LondonStore.class);
        when(store.hasInsufficientInventory(SHAMPOO, 5)).thenReturn(false);
        // when
        LondonCustomer customer = new LondonCustomer();
        boolean result = customer.purchase(store, SHAMPOO, 5);
        // then
        assertTrue(result);
        verify(store, times(1)).removeInventory(SHAMPOO, 5);
    }

    @Test
    @DisplayName("재고보다 많은 구매요청 실패 테스트")
    void purchaseFailsWhenNotEnoughInventory() throws Exception {
        // given
        IStore store = mock(LondonStore.class);
        when(store.hasInsufficientInventory(SHAMPOO,15)).thenReturn(true);

        // when
        LondonCustomer customer = new LondonCustomer();

        boolean result = customer.purchase(store, SHAMPOO, 15);

        // then
        assertFalse(result);
        verify(store,times(0)).removeInventory(SHAMPOO,5);
    }
}
