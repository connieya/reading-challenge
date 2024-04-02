package org.example.chapter02;

public class ClassicCustomer {

    public boolean purchase(ClassicStore store, Product product , int quantity) throws Exception {
        if (store.hasInsufficientInventory(product, quantity)){
            return false;
        }
        store.removeInventory(product,quantity);
        return true;
    }
}
