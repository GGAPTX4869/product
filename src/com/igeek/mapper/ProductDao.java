package com.igeek.mapper;


import com.igeek.entity.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductDao {
    @Select("SELECT * FROM product WHERE id = #{id}")
    Product getProductById(String id);
    void saveProduct(Product product);
    List<Product> getAllProducts();

}


