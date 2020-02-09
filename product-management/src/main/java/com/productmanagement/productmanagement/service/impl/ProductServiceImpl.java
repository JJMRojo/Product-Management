package com.productmanagement.productmanagement.service.impl;

import com.productmanagement.productmanagement.dao.interfaces.IProductDao;
import com.productmanagement.productmanagement.entity.Product;
import com.productmanagement.productmanagement.service.interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    IProductDao productDao;

    @Override
    public List<Product> getAllProduct() {
        List<Product> productList = new ArrayList<>();
        productList = productDao.getAllProduct();
        return productList;
    }

    @Override
    public Product findById(Long id) {
        return productDao.findById(id);
    }

    @Override
    public void saveProduct(Product product) {
        productDao.saveProduct(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productDao.deleteProduct(id);
    }

    @Override
    public void updateProduct(Product product) {
        Product productEdit = productDao.findById(product.getId());
        productEdit.setAvailable(product.getAvailable());
        productEdit.setCategory_id(product.getCategory_id());
        productEdit.setDescription(product.getDescription());
        productEdit.setImage(product.getImage());
        productEdit.setMerchant_id(product.getMerchant_id());
        productEdit.setMsrp(product.getMsrp());
        productEdit.setPrice(product.getPrice());
        productEdit.setTitle(product.getTitle());
        productEdit.setUrl(product.getUrl());

        productDao.saveProduct(productEdit);
    }
}
