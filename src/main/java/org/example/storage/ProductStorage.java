package org.example.storage;

import org.example.entities.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductStorage {
    private final Map<Long, Product> products;

    public Map<Long, Product> getProducts() {
        return products;
    }

    public ProductStorage() {
        this.products = new HashMap<>();
        List.of(        new Product("Banana", 120, "Brazil", 1),
                        new Product("Apple", 80, "USA", 2),
                        new Product("Orange", 90, "Spain", 3),
                        new Product("Grapes", 150, "Italy", 4),
                        new Product("Strawberry", 200, "Mexico", 5),
                        new Product("Pineapple", 180, "Costa Rica", 6),
                        new Product("Watermelon", 70, "Turkey", 7),
                        new Product("Cherry", 130, "Chile", 8),
                        new Product("Mango", 160, "India", 9),
                        new Product("Pear", 100, "France", 10))
                .forEach(product -> products.put(product.getId(), product));

    }

}
