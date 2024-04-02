package chapter2;

import org.example.chapter02.ClassicCustomer;
import org.example.chapter02.ClassicStore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.chapter02.Product.*;
import static org.junit.jupiter.api.Assertions.*;

public class ClassicStyleTest {

    @Test
    @DisplayName("재고 내에서 구매 요청 성공 테스트")
    void purchaseSucceedsWhenEnoughInventory() throws Exception {
        ClassicStore store = new ClassicStore();
        store.addInventory(SHAMPOO,10);

        ClassicCustomer customer = new ClassicCustomer();
        boolean result = customer.purchase(store, SHAMPOO, 5);
        assertTrue((result));
        assertEquals(5,store.getInventory(SHAMPOO));

    }

    @Test
    @DisplayName("재고 보다 많은 구매 요청 실패 테스트")
    public void purchaseFailsWhenNotEnoughInventory() throws Exception {
        ClassicStore store = new ClassicStore();
        store.addInventory(SHAMPOO,10);
        ClassicCustomer customer = new ClassicCustomer();

        boolean result = customer.purchase(store, SHAMPOO, 15);

        assertFalse(result);
        assertEquals(10,store.getInventory(SHAMPOO));

    }
}
