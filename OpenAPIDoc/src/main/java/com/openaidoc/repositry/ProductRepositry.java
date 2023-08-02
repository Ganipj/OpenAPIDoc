package com.openaidoc.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openaidoc.entity.Product;

public interface ProductRepositry extends JpaRepository<Product, Long> {

}
