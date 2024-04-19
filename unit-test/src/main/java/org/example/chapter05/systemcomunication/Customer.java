package org.example.chapter05.systemcomunication;

public class Customer {
    public String email;
    public boolean purchase(IStore store , Product product , int quantity) throws Exception {
        if (!store.hasEnoughInventory(product, quantity)){
            return false;
        }

        store.removeInventory(product, quantity);

        return true;
    }

    public void setEmail(String mail) {

    }
}
