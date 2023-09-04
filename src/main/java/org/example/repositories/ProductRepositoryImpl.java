package org.example.repositories;

import org.example.entities.Product;
import org.example.storage.ProductStorage;

import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    private final ProductStorage productsStorage = new ProductStorage();
    @Override
    public Product getByName(String name) {
        return productsStorage.getProducts().values().stream().filter(value -> value.getName().equals(name)).findFirst().get();
    }

    @Override
    public Product getById(long id) {
        return productsStorage.getProducts().get(id);
    }

    @Override
    public Product getByManufacturer(String manufacturer) {
        return productsStorage.getProducts().values().stream().filter(value -> value.getName().equals(manufacturer)).findFirst().get();
    }

    @Override
    public List<Product> getAll() {
        return productsStorage.getProducts().values().stream().toList();
    }

}
