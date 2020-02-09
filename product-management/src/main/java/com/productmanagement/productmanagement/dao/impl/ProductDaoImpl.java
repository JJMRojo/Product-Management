package com.productmanagement.productmanagement.dao.impl;

import com.productmanagement.productmanagement.dao.interfaces.IProductDao;
import com.productmanagement.productmanagement.entity.Product;
import com.productmanagement.productmanagement.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductDaoImpl implements IProductDao {

    @Autowired
    IProductRepository repository;

    @Override
    public List<Product> getAllProduct() {
        List<Product> productList = new ArrayList<>();
        repository.findAll().forEach(e -> productList.add(e));;
        return productList;
    }

    @Override
    public Product findById(Long id) {
        return repository.findById(id).orElse(new Product());
    }

    @Override
    public void saveProduct(Product product) {
        repository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }
}
