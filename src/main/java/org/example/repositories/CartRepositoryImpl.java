package org.example.repositories;

import org.example.entities.Cart;
import org.example.storage.CartStorage;

import java.util.Optional;

public class CartRepositoryImpl implements CartRepository {
    private final CartStorage cartStorage = new CartStorage();

    @Override
    public void addProduct(Long userId, Long productId) {
        var cart = Optional.ofNullable(cartStorage.getCarts().get(userId))
                .orElseGet(() -> cartStorage.getCarts().put(userId, new Cart(userId)));
        cart.addProduct(productId);
    }

    @Override
    public Cart getCartByUserId(Long userId) {
        var cart = Optional.ofNullable(cartStorage.getCarts().get(userId))
                .orElseGet(() -> {
                    var cart1 = new Cart(userId);
                    cartStorage.getCarts().put(userId, cart1);
                    return cart1;
                });
        return cart;
    }
}
