package org.example.Filters;

import org.example.entities.Product;
import org.example.interfaces.Filter;

import java.util.List;
import java.util.stream.Collectors;

public class MaxPriceFilter implements Filter<Product> {

    private double maxPrice;

    public MaxPriceFilter(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        return products.stream().filter(product -> product.getPrice() <= maxPrice).collect(Collectors.toList());
    }
}
