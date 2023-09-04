package org.example.Filters;

import org.example.entities.Product;
import org.example.interfaces.Filter;

import java.util.List;
import java.util.stream.Collectors;

public class ManufacturerFilter implements Filter<Product> {
    private String manufacturer;

    public ManufacturerFilter(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        return products.stream().filter(product -> manufacturer.equalsIgnoreCase(product.getManufacturer())).collect(Collectors.toList());
    }
}
