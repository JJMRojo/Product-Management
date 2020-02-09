package com.productmanagement.productmanagement.controller.impl;

import com.productmanagement.productmanagement.controller.interfaces.IProductViewController;
import com.productmanagement.productmanagement.entity.ProductView;
import com.productmanagement.productmanagement.service.interfaces.IProductViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductViewControllerImpl implements IProductViewController {

    @Autowired
    IProductViewService productViewService;

    @GetMapping("/product/get")
    @Override
    public List<ProductView> getProductWithCategoryAndMerchant() {
        return productViewService.getProductWithCategoryAndMerchantService();
    }
}
