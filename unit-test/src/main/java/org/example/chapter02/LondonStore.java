package org.example.chapter02;

import java.util.HashMap;
import java.util.Map;

public class LondonStore implements IStore {

    private final Map<Product, Integer> inventory = new HashMap<>();
    @Override
    public boolean hasInsufficientInventory(Product product, int quantity) {
        return false;
    }

    @Override
    public void removeInventory(Product product, int quantity) throws Exception {
        if (hasInsufficientInventory(product, quantity)) {
            throw new Exception("Not enough inventory");
        }
        int afterQuantity = inventory.get(product) - quantity;
        inventory.put(product,afterQuantity);
    }

    @Override
    public void addInventory(Product product, int quantity) {
        if (inventory.containsKey(product)) {
            int afterQuantity = inventory.get(product) + quantity;
            inventory.put(product,afterQuantity);
        } else {
            inventory.put(product, quantity);
        }
    }

    @Override
    public int getInventory(Product product) {
        return inventory.isEmpty() ? 0 : inventory.get(product);
    }
}
