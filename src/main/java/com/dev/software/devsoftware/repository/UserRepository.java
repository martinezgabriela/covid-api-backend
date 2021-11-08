package com.dev.software.devsoftware.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.software.devsoftware.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
	

}
