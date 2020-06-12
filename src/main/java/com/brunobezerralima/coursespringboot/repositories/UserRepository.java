package com.brunobezerralima.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunobezerralima.coursespringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
