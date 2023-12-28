package com.irctc.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.main.entity.TrainData;
import com.irctc.main.inter.TrainInterface;
import com.irctc.main.repository.TrainRepo;

@Service
public class TrainService implements TrainInterface{
	@Autowired
	TrainRepo trainRepo;
	
	
	@Override
	public void addTrains(TrainData train) {
		// TODO Auto-generated method stub
		trainRepo.save(train);
	}


	@Override
	public List<TrainData> getTrains() {
		// TODO Auto-generated method stub
		return trainRepo.findAll();
	}


	@Override
	public void deleteTrainById(Long trainId) {
		// TODO Auto-generated method stub
		trainRepo.deleteById(trainId);
	}


	@Override
	public void updateTrain(TrainData updatedTrain) {
		Long trainId = updatedTrain.getTrainId();

        // Check if the train with the given ID exists
        Optional<TrainData> existingTrainOptional = trainRepo.findById(trainId);
        if (existingTrainOptional.isPresent()) {
            TrainData existingTrain = existingTrainOptional.get();

            // Update the properties of the existing train with the values from the updated train
            existingTrain.setTrainName(updatedTrain.getTrainName());
            existingTrain.setTrainNumber(updatedTrain.getTrainNumber());
            existingTrain.setStationId(updatedTrain.getStationId()); // Assuming you want to update stations as well

            // Save the updated train
            trainRepo.save(existingTrain);
            System.out.println("Data updated");
            
        } else {
            // Handle the case where the train with the given ID does not exist
            throw new RuntimeException("Train with ID " + trainId + " not found.");
        }
		
	}


	@Override
	public Optional<TrainData> getTrainById(Long trainId) {
		// TODO Auto-generated method stub
		return trainRepo.findById(trainId);
	}
	
	
	
	
	
	

	
	
}
