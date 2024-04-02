package org.example.chapter2;

public interface IStore {

    boolean hasInsufficientInventory(Product product, int quantity);

    void removeInventory(Product product, int quantity) throws Exception;

    void addInventory(Product product, int quantity);

    int getInventory(Product product);
}
