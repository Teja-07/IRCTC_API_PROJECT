package com.example.Library_Management;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TrainRepo extends JpaRepository<Train, Long> {
	List<Train> findBySourceAndDestination(String source,String destination);
}
