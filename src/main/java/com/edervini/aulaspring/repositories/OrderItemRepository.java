package com.edervini.aulaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edervini.aulaspring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
