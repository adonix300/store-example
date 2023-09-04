package org.example.services;

import org.example.entities.Cart;
import org.example.entities.Product;
import org.example.entities.User;
import org.example.repositories.CartRepository;
import org.example.repositories.CartRepositoryImpl;
import org.example.repositories.ProductRepository;
import org.example.repositories.ProductRepositoryImpl;

import java.util.List;

public class CartService {
    private final CartRepository cartRepository = new CartRepositoryImpl();
    private final ProductRepository productRepository = new ProductRepositoryImpl();

    public void addProduct(Long userId, Long productId) {
        cartRepository.addProduct(userId, productId);
    }

    public void printCart(Long userId) {
        for (Long productId : cartRepository.getCartByUserId(userId).getProductsIds()) {
            System.out.println(productId + " - " + productRepository.getById(productId));
        }
    }

    public void buy(User user) {
        var cart = cartRepository.getCartByUserId(user.getId());
        int money = calculateTotalInCart(cart); //DRY
        int currentMoney = user.getMoney();
        if (currentMoney >= money) {
            user.setMoney(currentMoney - money);
            cart.getProductsIds().clear();
        } else {
            System.out.println("Not enough money. Ur money: " + currentMoney);
        }
    }

    private int calculateTotalInCart(Cart cart) {
        return cart.getProductsIds().stream().map(productId -> productRepository.getById(productId).getPrice())
                .reduce(0, Integer::sum);
    }

    public int calculateTotalInCart(Long userId) {
        var cart = cartRepository.getCartByUserId(userId);
        return calculateTotalInCart(cart);
    }
}
