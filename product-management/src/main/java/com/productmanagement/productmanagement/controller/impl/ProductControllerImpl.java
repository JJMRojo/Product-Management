package com.productmanagement.productmanagement.controller.impl;

import com.productmanagement.productmanagement.controller.interfaces.IProductController;
import com.productmanagement.productmanagement.entity.Product;
import com.productmanagement.productmanagement.entity.ProductView;
import com.productmanagement.productmanagement.service.interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProductControllerImpl implements IProductController {

    @Autowired
    IProductService productService;

    @GetMapping("/product/getAll")
    @Override
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    @GetMapping("/product/get/{id}")
    @Override
    public Product findById(@PathVariable(value = "id") Long id) {
        return productService.findById(id);
    }

    @PostMapping("/product/create")
    @Override
    public void saveProduct(@Valid @RequestBody Product product) {
        productService.saveProduct(product);
    }

    @PostMapping("product/delete/{id}")
    @Override
    public void deleteProduct(@PathVariable(value = "id") Long id) {
        productService.deleteProduct(id);
    }

    @PostMapping("/product/update")
    @Override
    public void updateProduct(@Valid @RequestBody Product product) {
        productService.updateProduct(product);
    }
}
