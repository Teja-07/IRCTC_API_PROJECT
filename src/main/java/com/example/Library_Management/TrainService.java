package com.example.Library_Management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainService {
	@Autowired
	private TrainRepo trainrepo;
	public Train addTrain(Train train) {
		List<Train> train_list=trainrepo.findBySourceAndDestination(train.getSource(),train.getDestination());
		if(train_list.isEmpty()) {
			return trainrepo.save(train);
		}else {
			throw new RuntimeException("Train already exists for the given source and destination");

		}
	}
	public List<Train> getTrainsBetweenStations(String source, String destination) {
        // Add logic for getting trains between source and destination
        return trainrepo.findBySourceAndDestination(source, destination);
    }
}
