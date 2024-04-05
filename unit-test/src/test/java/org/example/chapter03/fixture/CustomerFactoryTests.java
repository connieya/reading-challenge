package org.example.chapter03.fixture;

import org.example.chapter03.aaa.Customer;
import org.example.chapter03.aaa.Product;
import org.example.chapter03.aaa.Store;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerFactoryTests {

    @Test
    public void purchaseSucceedsWhenEnoughInventory() throws Exception {
        Store store = createStoreWithInventory(Product.Shampoo, 10);
        Customer sut = createCustomer();
        boolean success = sut.purchase(store, Product.Shampoo, 5);
        assertTrue(success);
        assertEquals(5, store.getInventory(Product.Shampoo));
    }

    @Test
    public void purchaseFailsWhenNotEnoughInventory() throws Exception {
        Store store = createStoreWithInventory(Product.Shampoo, 10);
        Customer sut = createCustomer();
        boolean success = sut.purchase(store, Product.Shampoo, 15);
        assertFalse(success);
        assertEquals(10, store.getInventory(Product.Shampoo));
    }

    private static Customer createCustomer() {
        return new Customer();
    }

    private Store createStoreWithInventory(Product product, int quantity) {
        Store store = new Store();
        store.addInventory(product, quantity);
        return store;
    }
}
