package com.irctc.main.service;




import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.main.entity.StationData;
import com.irctc.main.entity.TrainData;
import com.irctc.main.inter.StationInterface;
import com.irctc.main.repository.StationRepo;
import com.irctc.main.repository.TrainRepo;

@Service       
public class StationService implements StationInterface {
	@Autowired
	StationRepo stationRepo;
	
	@Autowired
	TrainRepo trainRepo;
	
	@Override
	public void addStation(StationData stationData) {
		// TODO Auto-generated method stub
		stationRepo.save(stationData);
	}

	@Override
	public List<StationData> getStations() {
		// TODO Auto-generated method stub
		return stationRepo.findAll();
	}
	
	
	
	public List<StationData> getStationFromStationData(StationData stationInfo){
		
		List<StationData> existingStations = stationRepo.findByStationFromAndStationTo(
	            stationInfo.getStationFrom(), stationInfo.getStationTo());
		
		return existingStations;
	}
	
	
	public List<TrainData> getTrainsFromStation(StationData stationInfo) {
	    List<StationData> existingStations = stationRepo.findByStationFromAndStationTo(
	            stationInfo.getStationFrom(), stationInfo.getStationTo());

	    System.out.println(existingStations);

	    ArrayList<TrainData> allTrains = new ArrayList<>();
	    
	    if (existingStations != null && !existingStations.isEmpty()) {
	        for (StationData stationData : existingStations) {
	            List<TrainData> trainData = stationData.getTrainData();
	            if (trainData != null && !trainData.isEmpty()) {
	                allTrains.addAll(trainData);
	            }
	        }

	        System.out.println(allTrains);
	        return allTrains;
	    } else {
	        System.out.println("Route not found");
	        return null;
	    }
	}

		
		
	@Override
	public void updateStation(StationData updatedStation) {
	    Long stationId = updatedStation.getStationId();

	    // Check if the station with the given ID exists
	    Optional<StationData> existingStationOptional = stationRepo.findById(stationId);
	    if (existingStationOptional.isPresent()) {
	        StationData existingStation = existingStationOptional.get();

	        // Update the properties of the existing station with the values from the updated station
	        existingStation.setStationFrom(updatedStation.getStationFrom());
	        existingStation.setStationTo(updatedStation.getStationTo());
	        existingStation.setArrivalTime(updatedStation.getArrivalTime());
	        existingStation.setReachTime(updatedStation.getReachTime());
	        existingStation.setTotalTime(updatedStation.getTotalTime());
	        existingStation.setSleeperTicketsAvailable(updatedStation.getSleeperTicketsAvailable());
	        existingStation.setSleeperTicketPrice(updatedStation.getSleeperTicketPrice());
	        existingStation.setSecondAcTicketsAvailable(updatedStation.getSecondAcTicketsAvailable());
	        existingStation.setSecondAcTicketPrice(updatedStation.getSecondAcTicketPrice());
	        existingStation.setThirdAcTicketsAvailable(updatedStation.getThirdAcTicketsAvailable());
	        existingStation.setThirdAcTicketPrice(updatedStation.getThirdAcTicketPrice());
	        existingStation.setFirstAcTicketsAvailable(updatedStation.getFirstAcTicketsAvailable());
	        existingStation.setFirstAcTicketPrice(updatedStation.getFirstAcTicketPrice());

	        // Save the updated station
	        stationRepo.save(existingStation);
	        System.out.println("Station data updated");

	    } else {
	        // Handle the case where the station with the given ID does not exist
	        throw new RuntimeException("Station with ID " + stationId + " not found.");
	    }
	}
	    
	    @Override
	    public void updateTickets(Long stationId, String tclass, int tAvail) {
		    
		    // Check if the station with the given ID exists
		    Optional<StationData> existingStationOptional = stationRepo.findById(stationId);
		    if (existingStationOptional.isPresent()) {
		        StationData existingStation = existingStationOptional.get();
		        System.out.println(existingStation);
		        // Update the properties of the existing station with the values from the updated station
		        switch (tclass.toLowerCase()) {
                case "sleeper":
                    existingStation.setSleeperTicketsAvailable(tAvail);
                    System.out.println(tAvail);
                    break;
                case "secondAC":
                    existingStation.setSecondAcTicketsAvailable(tAvail);
                    System.out.println(tAvail);
                    break;
                case"thirdAC":
                	existingStation.setThirdAcTicketsAvailable(tAvail);
                	System.out.println(tAvail);
                	break;
                case"firstAC":
                	existingStation.setFirstAcTicketsAvailable(tAvail);
                	System.out.println(tAvail);
                	break;	
                default:
                    
            }


		        // Save the updated station
		        stationRepo.save(existingStation);
		        System.out.println("Station data updated");

		    } else {
		        // Handle the case where the station with the given ID does not exist
		        throw new RuntimeException("Station with ID " + stationId + " not found.");
		    }
	    
	    
	    
	}

	
	
	
	
	
	
	
	
	
	
	
	
		
	}
	
	


