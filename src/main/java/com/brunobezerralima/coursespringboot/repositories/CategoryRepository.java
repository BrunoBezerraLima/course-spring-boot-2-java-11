package com.brunobezerralima.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunobezerralima.coursespringboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
