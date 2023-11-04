package com.spring.demo.repository;

import com.spring.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInterface extends JpaRepository<Product, Integer> {

    List<Product> findByName(String name);
}
