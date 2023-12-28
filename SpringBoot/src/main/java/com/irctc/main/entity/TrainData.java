package com.irctc.main.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;


@Entity
public class TrainData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long trainId;
	private String trainName;
	private Long trainNumber;
	
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(
        name = "train_station",  
        joinColumns = @JoinColumn(name = "train_id"),
        inverseJoinColumns = @JoinColumn(name = "station_id")
    )
	private List<StationData> stationId;
	
	public TrainData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TrainData(Long trainId, String trainName, Long trainNumber, List<StationData> stationId) {
		super();
		this.trainId = trainId;
		this.trainName = trainName;
		this.trainNumber = trainNumber;
		this.stationId = stationId;
	}

	public Long getTrainId() {
		return trainId;
	}
	public void setTrainId(Long trainId) {
		this.trainId = trainId;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public Long getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(Long trainNumber) {
		this.trainNumber = trainNumber;
	}
	
	
	public List<StationData> getStationId() {
		return stationId;
	}


	public void setStationId(List<StationData> stationId) {
		this.stationId = stationId;
	}

	@Override
	public String toString() {
		return "TrainData [trainId=" + trainId + ", trainName=" + trainName + ", trainNumber=" 
	+ trainNumber
				 + "]";
	}


	
	
	

}
