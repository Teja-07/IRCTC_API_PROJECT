package com.example.Library_Management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

	
	@Autowired
	private BookingRepo bookingrepo;
	
	public Booking bookSeat(Booking booking) {
		if(booking.getNumberOfSeats()<=0) {
			throw new IllegalArgumentException("no seats available");
		}
		return bookingrepo.save(booking);
	}
	
	
	 public List<Booking> getBookingsByUserId(Long userId) {
	        
	        return bookingrepo.findByUserId(userId);
	    }
}
