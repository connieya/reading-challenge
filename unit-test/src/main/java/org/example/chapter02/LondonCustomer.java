package org.example.chapter02;

public class LondonCustomer {

    public boolean purchase(IStore store, Product product, int quantity) throws Exception {
        if (store.hasInsufficientInventory(product, quantity)) {
            return false;
        }

        store.removeInventory(product, quantity);
        return true;
    }
}
