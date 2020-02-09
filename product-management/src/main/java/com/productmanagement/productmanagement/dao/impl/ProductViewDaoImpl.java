package com.productmanagement.productmanagement.dao.impl;

import com.productmanagement.productmanagement.dao.interfaces.IProductViewDao;
import com.productmanagement.productmanagement.entity.ProductView;
import com.productmanagement.productmanagement.repository.IProductViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductViewDaoImpl implements IProductViewDao {

    @Autowired
    IProductViewRepository productViewRepository;

    @Override
    public List<ProductView> getProductWithCategoryAndMerchant() {
        List<ProductView> productViewList = new ArrayList<>();
        productViewRepository.findAll().forEach(e -> productViewList.add(e));;

        return productViewList;
    }
}
