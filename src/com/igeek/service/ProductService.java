package com.igeek.service;

import com.igeek.entity.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(String id);
    void saveProduct(Product product);

    List<Product> getAllProducts();
}

































