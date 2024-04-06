package com.example.Library_Management;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRep extends  JpaRepository<User, Long> {
	User findByUsername(String name);
}
