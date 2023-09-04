package org.example.Filters;

import org.example.entities.Product;
import org.example.interfaces.Filter;

import java.util.List;
import java.util.stream.Collectors;

public class NameFilter implements Filter<Product> {
    private String name;

    public NameFilter(String name) {
        this.name = name;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        return products.stream().filter(product -> name.equalsIgnoreCase(product.getName())).collect(Collectors.toList());
    }
}
