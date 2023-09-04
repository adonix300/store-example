package org.example.interfaces;

import org.example.entities.Product;

import java.util.List;

public interface Filter<T> { //  Interface Segregation Principle
    List<T> filter(List<T> products);
}
