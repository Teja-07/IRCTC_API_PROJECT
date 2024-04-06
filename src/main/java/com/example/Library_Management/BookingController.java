package com.example.Library_Management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
	@Autowired
	private BookingService bookservice;
	@PostMapping("/book")
	public Booking bookSeat(@RequestBody Booking booking) {
		return bookservice.bookSeat(booking);
	}
	 @GetMapping("/user/{userId}")
	    public List<Booking> getBookingsByUserId(@PathVariable Long userId) {
	        return bookservice.getBookingsByUserId(userId);
	    }
}
