package com.productmanagement.productmanagement.repository;

import com.productmanagement.productmanagement.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}
