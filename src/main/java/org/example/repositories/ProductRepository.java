package org.example.repositories;

import org.example.entities.Product;
import org.example.entities.User;

import java.util.List;

public interface ProductRepository { // Interface segregation
    Product getByName(String name);
    Product getById(long id);
    Product getByManufacturer(String manufacturer);

    List<Product> getAll();
}
