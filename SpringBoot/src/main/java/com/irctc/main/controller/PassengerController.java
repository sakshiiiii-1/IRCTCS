package com.irctc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.main.entity.PassengersData;
import com.irctc.main.entity.TrainData;
import com.irctc.main.inter.PassengerInterface;

@CrossOrigin("*")
@RestController
@RequestMapping("/passengers")
public class PassengerController {
	
	
	private final PassengerInterface passengerInter;
	
	@Autowired
	public PassengerController(PassengerInterface passengerInter) {
		this.passengerInter = passengerInter;
	}
	
	@PostMapping("/addPassengers")
	public void addPassengers(@RequestBody List<PassengersData> passengers) {
		for (PassengersData passenger : passengers) {
	        passengerInter.addPassenger(passenger);
	    }
	}
	
	@GetMapping("/getPassengers")
	public List<PassengersData> getPassengers(){
		return passengerInter.getPassengers();	
	}
	@DeleteMapping("/{passengerId}")
	public void deletePassengerById(@PathVariable Long passengerId) {
		passengerInter.deletePassengerById(passengerId);
	}
	
	@PutMapping("/updatePassenger")
	public void updatePassenger(@RequestBody PassengersData UpdatedPassenger) {
		passengerInter.addPassenger(UpdatedPassenger);
	}
	

}
