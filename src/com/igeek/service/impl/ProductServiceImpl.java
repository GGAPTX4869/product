package com.igeek.service.impl;

import com.igeek.mapper.ProductDao;
import com.igeek.entity.Product;
import com.igeek.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(String id) {
        return productDao.getProductById(id);
    }

    @Override
    public void saveProduct(Product product) {
        productDao.saveProduct(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }

}
