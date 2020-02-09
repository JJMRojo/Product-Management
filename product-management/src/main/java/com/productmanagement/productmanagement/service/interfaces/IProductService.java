package com.productmanagement.productmanagement.service.interfaces;

import com.productmanagement.productmanagement.entity.Product;

import java.util.List;

public interface IProductService {

    public List<Product> getAllProduct();
    public Product findById(Long id);
    public void saveProduct(Product product);
    public void deleteProduct(Long id);
    public void updateProduct(Product product);
}
