package com.productmanagement.productmanagement.controller.interfaces;

import com.productmanagement.productmanagement.entity.ProductView;

import java.util.List;

public interface IProductViewController {

    public List<ProductView> getProductWithCategoryAndMerchant();
}
