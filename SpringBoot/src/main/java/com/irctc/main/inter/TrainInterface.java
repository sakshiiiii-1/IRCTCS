package com.irctc.main.inter;



import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.irctc.main.entity.TrainData;



public interface TrainInterface {
	
	public void addTrains(TrainData train);
	
	public List<TrainData> getTrains();
	
	public void deleteTrainById(Long trainId);
	
	public void updateTrain(TrainData updatedTrain);
	
	public Optional<TrainData> getTrainById(Long trainId);
	

}
