package org.example;

import org.example.entities.User;
import org.example.services.CartService;
import org.example.services.ProductService;
import org.example.services.UserService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        ProductService productService = new ProductService();
        CartService cartService = new CartService();


        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter your name");
            String name = br.readLine();
            User currentUser = userService.login(name);
            System.out.println("User logined");
            while (true) {
                System.out.printf("""
                        1 - show all products
                        2 - show my cart
                        3 - add product
                        4 - buy cart (total: %s)
                        5 - add money
                        6 - exit
                        You have now: %s
                        %n""", cartService.calculateTotalInCart(currentUser.getId()), currentUser.getMoney());
                Integer command = Integer.valueOf(br.readLine());
                switch (command) {
                    case 1:
                        productService.printProducts();
                        break;
                    case 2:
                        cartService.printCart(currentUser.getId());
                        break;
                    case 3:
                        Long productId = Long.valueOf(br.readLine());
                        cartService.addProduct(currentUser.getId(), productId);
                        break;
                    case 4:
                        cartService.buy(currentUser);
                        break;
                    case 5:
                        System.out.println("How much money u want to add?");
                        Integer money = Integer.valueOf(br.readLine());
                        userService.addMoney(currentUser, money);
                        break;
                    case 6:
                        return;
                    default:
                        break;
                }
            }
        } catch (IllegalAccessException | IOException e) {
            throw new RuntimeException(e);
        }

    }
}