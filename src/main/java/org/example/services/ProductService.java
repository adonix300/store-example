package org.example.services;

import org.example.entities.Product;
import org.example.entities.User;
import org.example.interfaces.Filter;
import org.example.repositories.ProductRepository;
import org.example.repositories.ProductRepositoryImpl;

import java.util.List;

public class ProductService {
    private final ProductRepository productRepository = new ProductRepositoryImpl();

    public List<Product> getProducts() {
        return productRepository.getAll();
    }

    public List<Product> getFilteredProducts(Filter filter) {
        return filter.filter(productRepository.getAll());
    }

    public void printProducts() {
        for (Product product : productRepository.getAll()) {
            System.out.println(product.getId() + " - " + product);
        }
    }

    public Product getById(Long id) {
        return productRepository.getById(id);
    }
}
