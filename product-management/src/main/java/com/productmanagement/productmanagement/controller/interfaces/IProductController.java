package com.productmanagement.productmanagement.controller.interfaces;

import com.productmanagement.productmanagement.entity.Product;

import java.util.List;

public interface IProductController {

    public List<Product> getAllProduct();
    public Product findById(Long id);
    public void saveProduct(Product product);
    public void deleteProduct(Long id);
    public void updateProduct(Product product);
}
