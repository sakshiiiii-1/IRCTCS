package com.irctc.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.main.entity.StationData;
import com.irctc.main.entity.StationTrainResponse;
import com.irctc.main.entity.TrainData;
import com.irctc.main.inter.StationInterface;

@CrossOrigin("*")
@RestController
@RequestMapping("/stations")
public class StationController {
	
	private final StationInterface stationInterface;
	
	@Autowired
	public  StationController(StationInterface stationInterface) {
		this.stationInterface=stationInterface;
	}
	
	@PostMapping("/addStations")
	public void addStations(@RequestBody StationData station) {
		System.out.println(station);
		stationInterface.addStation(station);	
	}
	

	@GetMapping("/getStations")
	public List<StationData> getStations(){
		return stationInterface.getStations();
	}
	
	
	@PutMapping("/updateStations")
	public void updateStation(@RequestBody StationData updatedStation) {
		if(updatedStation != null) {
			System.out.println();
			stationInterface.updateStation(updatedStation);
			
		}else {
			System.out.println("empty station");
		}
	}
	
	
	@PutMapping("/updateTickets/{stationId}/{tclass}/{tAvail}")
	public void updateTickets(@PathVariable Long stationId, @PathVariable  String tclass, @PathVariable int tAvail) {
		if(stationId != 0 && tclass != null && tAvail != 0) {
			System.out.println(tAvail);
			stationInterface.updateTickets(stationId, tclass, tAvail);
		}
	}
	
	
//	@PostMapping("/findTrains")
//	public Optional<TrainData> getTrainsFromStation (@RequestBody StationData stationInfo){
//		System.out.println(stationInfo);
//		return stationInterface.getTrainsFromStation(stationInfo);
//		
//	}
	
	@PostMapping("/findTrains")
	@ResponseBody
	public StationTrainResponse getTrainsFromStation(@RequestBody StationData stationInfo) {
	    // Validate input
	    if (stationInfo == null || stationInfo.getStationFrom() == null || stationInfo.getStationTo() == null) {
	        // Invalid input, return a bad request response
	    	
	    	System.out.println("not valid");
	    	
	        return null;
	    }
	    System.out.println(stationInfo);
	    List<StationData> existingStations = stationInterface.getStationFromStationData(stationInfo);
	    // Call the service method to get train data
	    List<TrainData> trainData = stationInterface.getTrainsFromStation(stationInfo);
	    System.out.println(trainData + "first");
	    // Check if train data is present
	    if (trainData != null) {
	        // Train data found, return it with a success response
	    	StationTrainResponse response = new StationTrainResponse(existingStations, trainData);
	        return response;
	    } else {
	        // Train data not found, return a not found response
	    	System.out.println("nulll");
	        return null;
	    }
	}

	
	
	
	
	
	
}
