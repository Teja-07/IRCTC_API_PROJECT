package com.example.Library_Management;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BookingRepo  extends JpaRepository<Booking, Long>{
	
	List<Booking> findByUserId(long id); 
}
