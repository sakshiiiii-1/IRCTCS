package com.irctc.main.entity;

import java.util.List;

public class StationTrainResponse {
	
	 private List<StationData> stations;
	    private List<TrainData> trains;

	    // Constructors, getters, and setters

	    public StationTrainResponse(List<StationData> stations, List<TrainData> trains) {
	        this.stations = stations;
	        this.trains = trains;
	    }

	    public List<StationData> getStations() {
	        return stations;
	    }

	    public void setStations(List<StationData> stations) {
	        this.stations = stations;
	    }

	    public List<TrainData> getTrains() {
	        return trains;
	    }

	    public void setTrains(List<TrainData> trains) {
	        this.trains = trains;
	    }
	

}
