package com.productmanagement.productmanagement.dao.interfaces;

import com.productmanagement.productmanagement.entity.Product;

import java.util.List;

public  interface IProductDao {

    public List<Product> getAllProduct();
    public Product findById(Long id);
    public void saveProduct(Product product);
    public void deleteProduct(Long id);
}
