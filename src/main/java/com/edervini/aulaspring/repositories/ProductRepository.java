package com.edervini.aulaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edervini.aulaspring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
