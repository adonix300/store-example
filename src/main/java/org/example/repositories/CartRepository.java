package org.example.repositories;

import org.example.entities.Cart;
import org.example.entities.Product;

import java.util.List;

public interface CartRepository { // Interface segregation
    void addProduct(Long userId, Long productId);
    Cart getCartByUserId(Long userId);
}
