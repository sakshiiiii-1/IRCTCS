package com.irctc.main.controller;
import com.irctc.main.entity.TrainData;
import com.irctc.main.inter.TrainInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
@RequestMapping("/trains")
public class TrainController {
	
	
	private final TrainInterface trainInterface;

    @Autowired
    public TrainController(TrainInterface trainInterface) {
        this.trainInterface = trainInterface;
    }
	
	@PostMapping("/addTrains")
	public void addTrains(@RequestBody TrainData train) {
		System.out.println(train);
		trainInterface.addTrains(train);
	}

	@GetMapping("/getTrains")
	public List<TrainData> getTrains() {
		return trainInterface.getTrains();
	}
	
	@GetMapping("/{trainId}")
	public Optional<TrainData> getTrainById(Long trainId){
		return trainInterface.getTrainById(trainId);
	}
	
	@DeleteMapping("/{trainId}")
	public void deleteTrain(@PathVariable Long trainId) {
		trainInterface.deleteTrainById(trainId);
	}
	
	@PutMapping("/updateTrain")
	public void updateTrain(@RequestBody TrainData UpdatedTain) {
		trainInterface.updateTrain(UpdatedTain);
	}
	
	
	
	

}
