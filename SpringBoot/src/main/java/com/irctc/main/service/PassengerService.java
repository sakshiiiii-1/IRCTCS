package com.irctc.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.main.entity.PassengersData;
import com.irctc.main.entity.TrainData;
import com.irctc.main.inter.PassengerInterface;
import com.irctc.main.repository.PassengersRepo;



@Service
public class PassengerService implements PassengerInterface{

	@Autowired
	PassengersRepo passengerRepo;
	
	@Override
	public void addPassenger(PassengersData passengersData) {
		// TODO Auto-generated method stub
		passengerRepo.save(passengersData);
	}

	@Override
	public List<PassengersData> getPassengers() {
	
		// TODO Auto-generated method stub
		return passengerRepo.findAll();
	}

	@Override
	public void deletePassengerById(Long passengerId) {
		// TODO Auto-generated method stub
		passengerRepo.deleteById(passengerId);
	}

	@Override
	public void updatePassenger(PassengersData updatedpassenger) {
		// TODO Auto-generated method stub
		Long passengerId = updatedpassenger.getPassengerId();

        // Check if the train with the given ID exists
        Optional<PassengersData> existingPassengersOptional = passengerRepo.findById(passengerId);
        if (existingPassengersOptional.isPresent()) {
            PassengersData existingPassenger = existingPassengersOptional.get();

            // Update the properties of the existing train with the values from the updated train
            existingPassenger.setPassengerName(updatedpassenger.getPassengerName());
            existingPassenger.setPassengerContact(updatedpassenger.getPassengerContact());
            existingPassenger.setPassengerId(updatedpassenger.getPassengerId()); // Assuming you want to update stations as well

            // Save the updated train
            passengerRepo.save(existingPassenger);
            System.out.println("Data updated");
            
        } else {
            // Handle the case where the train with the given ID does not exist
            throw new RuntimeException("Passenger with ID " + passengerId + " not found.");
        }
		
	}


	
}
