package chapter3;

import org.example.chapter02.LondonCustomer;
import org.example.chapter02.LondonStore;
import org.example.chapter02.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTests {

    private final LondonStore _store;
    private final LondonCustomer _sut;

    public CustomerTests() {
        this._store = new LondonStore();
        _store.addInventory(Product.SHAMPOO,10);
        this._sut = new LondonCustomer();
    }

    @Test
    void purchaseSucceedsWhenEnoughInventory() throws Exception {
        boolean success = _sut.purchase(_store, Product.SHAMPOO, 5);
        assertTrue(success);
        assertEquals(5,_store.getInventory(Product.SHAMPOO));
    }

    @Test
    void purchaseFailsWhenNotEnoughInventory() throws Exception {
        boolean success = _sut.purchase(_store, Product.SHAMPOO, 15);
        assertFalse(success);
        assertEquals(10,_store.getInventory(Product.SHAMPOO));
    }
}
