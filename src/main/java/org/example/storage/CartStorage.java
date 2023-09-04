package org.example.storage;

import org.example.entities.Cart;
import org.example.entities.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CartStorage {
    private final Map<Long, Cart> carts = new HashMap<>();

    public Map<Long, Cart> getCarts() {
        return carts;
    }

    //Long here is userId
}
