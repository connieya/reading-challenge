package org.example.chapter03.aaa;

public class Customer {

    public boolean purchase(Store store, Product product, int quantity) throws Exception {
        if (!store.hasEnoughInventory(product, quantity)) {
            return false;
        }

        store.removeInventory(product, quantity);
        return true;
    }
}
