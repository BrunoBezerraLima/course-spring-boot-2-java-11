package com.brunobezerralima.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunobezerralima.coursespringboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
