package com.spanprojects.msscbrewery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spanprojects.msscbrewery.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
	
}
