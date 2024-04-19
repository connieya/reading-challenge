package org.example.chapter05.systemcomunication;

public class Store implements IStore {
    public void addInventory(Product product, int i) {

    }

    @Override
    public boolean hasEnoughInventory(Product product, int quantity) {
        return false;
    }

    @Override
    public void removeInventory(Product product, int quantity) {

    }
}
