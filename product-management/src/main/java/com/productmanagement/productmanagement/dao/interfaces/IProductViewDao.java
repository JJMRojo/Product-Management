package com.productmanagement.productmanagement.dao.interfaces;

import com.productmanagement.productmanagement.entity.ProductView;

import java.util.List;

public interface IProductViewDao {

    public List<ProductView> getProductWithCategoryAndMerchant();
}
