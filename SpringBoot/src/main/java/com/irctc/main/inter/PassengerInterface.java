package com.irctc.main.inter;

import java.util.List;

import com.irctc.main.entity.PassengersData;
import com.irctc.main.entity.TrainData;

public interface PassengerInterface {

	public void addPassenger(PassengersData passengersData);

	public List<PassengersData> getPassengers();

	public void deletePassengerById(Long passengerId);

	public void updatePassenger(PassengersData updatedPassenger);

}
