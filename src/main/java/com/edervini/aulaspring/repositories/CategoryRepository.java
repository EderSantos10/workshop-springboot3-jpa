package com.edervini.aulaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edervini.aulaspring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
