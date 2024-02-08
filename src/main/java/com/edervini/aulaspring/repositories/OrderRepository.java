package com.edervini.aulaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edervini.aulaspring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
