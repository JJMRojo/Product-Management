package com.productmanagement.productmanagement.repository;

import com.productmanagement.productmanagement.entity.ProductView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductViewRepository extends JpaRepository<ProductView, Long> {
}
