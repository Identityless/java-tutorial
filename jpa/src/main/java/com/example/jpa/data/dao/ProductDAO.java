package com.example.jpa.data.dao;

import com.example.jpa.data.entity.Product;

import java.time.LocalDateTime;

public interface ProductDAO {
    Product insertProduct(Product product);

    Product selectProduct(Long number);

    Product updateProductName(Long number, String name, LocalDateTime updatedAt) throws Exception;
    void deleteProduct(Long number) throws Exception;
}
