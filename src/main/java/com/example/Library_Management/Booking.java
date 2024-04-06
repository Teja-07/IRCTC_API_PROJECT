package com.example.Library_Management;


import jakarta.persistence.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Booking")
public class Booking {
	    @Id
	    @Column(name="Id")
	    private Long id;

	    @ManyToOne
	    
	    @JoinColumn(name = "train_id")
	    private Train train;

	    @ManyToOne
	    
	    @JoinColumn(name = "user_id")
	    private User user;
	    @Column(name="numberOfSeats")
	    private int numberOfSeats;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Train getTrain() {
			return train;
		}

		public void setTrain(Train train) {
			this.train = train;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public int getNumberOfSeats() {
			return numberOfSeats;
		}

		public void setNumberOfSeats(int numberOfSeats) {
			this.numberOfSeats = numberOfSeats;
		}
	    
}
