package com.brunobezerralima.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunobezerralima.coursespringboot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
