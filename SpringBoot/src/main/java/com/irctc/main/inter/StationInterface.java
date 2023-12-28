package com.irctc.main.inter;

import java.util.List;
import java.util.Optional;

import com.irctc.main.entity.StationData;
import com.irctc.main.entity.TrainData;


public interface StationInterface {

		public void addStation(StationData stationdata);
		
		public List<StationData> getStations();
		
		public List<TrainData> getTrainsFromStation (StationData stationInfo);
		
		public List<StationData> getStationFromStationData(StationData stationInfo);

		public void updateStation(StationData updatedStation);

		public void updateTickets(Long stationId, String tclass, int tAvail);
		
}
