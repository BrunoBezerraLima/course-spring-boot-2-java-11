package com.brunobezerralima.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunobezerralima.coursespringboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
