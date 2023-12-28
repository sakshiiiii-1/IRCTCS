package com.irctc.main.entity;






import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class StationData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long stationId;
	private String stationFrom;
	private String stationTo;
	private String arrivalTime;
	private String reachTime;
	private String totalTime;
	private Integer sleeperTicketsAvailable;
	private double sleeperTicketPrice;
	private Integer secondAcTicketsAvailable;
	private double secondAcTicketPrice;
	private Integer thirdAcTicketsAvailable;
	private double thirdAcTicketPrice;
	private Integer firstAcTicketsAvailable;
	private double firstAcTicketPrice;
	private LocalDate date;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "stationId", fetch = FetchType.LAZY)
	private List<TrainData> trainData;

	public StationData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StationData(Long stationId, String stationFrom, String stationTo, String arrivalTime, String reachTime,
			String totalTime, Integer sleeperTicketsAvailable, double sleeperTicketPrice,
			Integer secondAcTicketsAvailable, double secondAcTicketPrice, Integer thirdAcTicketsAvailable,
			double thirdAcTicketPrice, Integer firstAcTicketsAvailable, double firstAcTicketPrice,
			List<TrainData> trainData , LocalDate date) {
		super();
		this.stationId = stationId;
		this.stationFrom = stationFrom;
		this.stationTo = stationTo;
		this.arrivalTime = arrivalTime;
		this.reachTime = reachTime;
		this.totalTime = totalTime;
		this.sleeperTicketsAvailable = sleeperTicketsAvailable;
		this.sleeperTicketPrice = sleeperTicketPrice;
		this.secondAcTicketsAvailable = secondAcTicketsAvailable;
		this.secondAcTicketPrice = secondAcTicketPrice;
		this.thirdAcTicketsAvailable = thirdAcTicketsAvailable;
		this.thirdAcTicketPrice = thirdAcTicketPrice;
		this.firstAcTicketsAvailable = firstAcTicketsAvailable;
		this.firstAcTicketPrice = firstAcTicketPrice;
		this.trainData = trainData;
		this.date = date;
	}

	public Long getStationId() {
		return stationId;
	}

	public void setStationId(Long stationId) {
		this.stationId = stationId;
	}

	public String getStationFrom() {
		return stationFrom;
	}

	public void setStationFrom(String stationFrom) {
		this.stationFrom = stationFrom;
	}

	public String getStationTo() {
		return stationTo;
	}

	public void setStationTo(String stationTo) {
		this.stationTo = stationTo;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getReachTime() {
		return reachTime;
	}

	public void setReachTime(String reachTime) {
		this.reachTime = reachTime;
	}

	public String getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}

	public Integer getSleeperTicketsAvailable() {
		return sleeperTicketsAvailable;
	}

	public void setSleeperTicketsAvailable(Integer sleeperTicketsAvailable) {
		this.sleeperTicketsAvailable = sleeperTicketsAvailable;
	}

	public double getSleeperTicketPrice() {
		return sleeperTicketPrice;
	}

	public void setSleeperTicketPrice(double sleeperTicketPrice) {
		this.sleeperTicketPrice = sleeperTicketPrice;
	}

	public Integer getSecondAcTicketsAvailable() {
		return secondAcTicketsAvailable;
	}

	public void setSecondAcTicketsAvailable(Integer secondAcTicketsAvailable) {
		this.secondAcTicketsAvailable = secondAcTicketsAvailable;
	}

	public double getSecondAcTicketPrice() {
		return secondAcTicketPrice;
	}

	public void setSecondAcTicketPrice(double secondAcTicketPrice) {
		this.secondAcTicketPrice = secondAcTicketPrice;
	}

	public Integer getThirdAcTicketsAvailable() {
		return thirdAcTicketsAvailable;
	}

	public void setThirdAcTicketsAvailable(Integer thirdAcTicketsAvailable) {
		this.thirdAcTicketsAvailable = thirdAcTicketsAvailable;
	}

	public double getThirdAcTicketPrice() {
		return thirdAcTicketPrice;
	}

	public void setThirdAcTicketPrice(double thirdAcTicketPrice) {
		this.thirdAcTicketPrice = thirdAcTicketPrice;
	}

	public Integer getFirstAcTicketsAvailable() {
		return firstAcTicketsAvailable;
	}

	public void setFirstAcTicketsAvailable(Integer firstAcTicketsAvailable) {
		this.firstAcTicketsAvailable = firstAcTicketsAvailable;
	}

	public double getFirstAcTicketPrice() {
		return firstAcTicketPrice;
	}

	public void setFirstAcTicketPrice(double firstAcTicketPrice) {
		this.firstAcTicketPrice = firstAcTicketPrice;
	}

	public List<TrainData> getTrainData() {
		return trainData;
	}

	public void setTrainData(List<TrainData> trainData) {
		this.trainData = trainData;
	}
	
	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "StationData [stationId=" + stationId + ", stationFrom=" + stationFrom + ", stationTo=" + stationTo
				+ ", arrivalTime=" + arrivalTime + ", reachTime=" + reachTime + ", totalTime=" + totalTime
				+ ", sleeperTicketsAvailable=" + sleeperTicketsAvailable + ", sleeperTicketPrice=" + sleeperTicketPrice
				+ ", secondAcTicketsAvailable=" + secondAcTicketsAvailable + ", secondAcTicketPrice="
				+ secondAcTicketPrice + ", thirdAcTicketsAvailable=" + thirdAcTicketsAvailable + ", thirdAcTicketPrice="
				+ thirdAcTicketPrice + ", FirstAcTicketsAvailable=" + firstAcTicketsAvailable + ", FirstAcTicketPrice="
				+ firstAcTicketPrice+ ", date=" + date + "]";
	}

	
	
	
	
	
	
	
	
}
