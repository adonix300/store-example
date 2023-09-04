package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Long> productsIds = new ArrayList<>();
    private long userId;

    public Cart(long userId) {
        this.userId = userId;
    }

    public void addProduct(Long productId) {
        productsIds.add(productId);
    }

    public void removeProduct(Long productId) {
        productsIds.remove(productId);
    }

    public List<Long> getProductsIds() {
        return productsIds;
    }
}
