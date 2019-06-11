package com.app.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.boot.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
