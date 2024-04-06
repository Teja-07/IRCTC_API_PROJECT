package com.example.Library_Management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trains")
public class TrainController {
	@Autowired
	private TrainService trainservice;
	@PostMapping("/add")
    public Train addTrain(@RequestBody Train train) {
        return trainservice.addTrain(train);
    }

    @GetMapping("/availability")
    public List<Train> getTrainsBetweenStations(@RequestParam String source, @RequestParam String destination) {
        return trainservice.getTrainsBetweenStations(source, destination);
    }
}
