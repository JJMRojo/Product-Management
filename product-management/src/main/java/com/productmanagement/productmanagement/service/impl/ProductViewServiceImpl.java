package com.productmanagement.productmanagement.service.impl;

import com.productmanagement.productmanagement.dao.interfaces.IProductViewDao;
import com.productmanagement.productmanagement.entity.ProductView;
import com.productmanagement.productmanagement.service.interfaces.IProductViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductViewServiceImpl implements IProductViewService {

    @Autowired
    IProductViewDao productViewDao;

    @Override
    public List<ProductView> getProductWithCategoryAndMerchantService() {

        List<ProductView> productViewList = new ArrayList<>();
        productViewList = productViewDao.getProductWithCategoryAndMerchant();

        return productViewList;
    }
}
