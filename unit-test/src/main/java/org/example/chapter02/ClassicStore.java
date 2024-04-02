package org.example.chapter02;

import java.util.HashMap;
import java.util.Map;

public class ClassicStore {
    private final Map<Product, Integer> inventory = new HashMap<>();

    public boolean hasInsufficientInventory(Product product, int quantity) {
        return getInventory(product) < quantity;
    }

    public void removeInventory(Product product, int quantity) throws Exception {
        if (hasInsufficientInventory(product, quantity)) {
            throw new Exception("Not enough inventory");
        }
        int afterQuantity = inventory.get(product) - quantity;
        inventory.put(product, afterQuantity);

    }

    public void addInventory(Product product, int quantity) {
        if (inventory.containsKey(product)) {
            inventory.put(product, inventory.get(product) + quantity);
        } else {
            inventory.put(product, quantity);
        }
    }

    public int getInventory(Product product) {
        return inventory.isEmpty() ? 0 : inventory.get(product);
    }
}
