package com.irctc.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PassengersData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long passengerId;
	private String passengerName;
	private int passengerAge;
	private Long passengerContact;
	private String passengerCountry;
	private String passengerPrefer;
	
	 
	
	public PassengersData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PassengersData(long passengerId, String passengerName, int passengerAge, long passengerContact,
			String passengerCountry, String passengerPrefer) {
		super();
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerContact = passengerContact;
		this.passengerCountry = passengerCountry;
		this.passengerPrefer = passengerPrefer;
	}
	public long getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(long passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public long getPassengerContact() {
		return passengerContact;
	}
	public void setPassengerContact(long passengerContact) {
		this.passengerContact = passengerContact;
	}
	public String getPassengerCountry() {
		return passengerCountry;
	}
	public void setPassengerCountry(String passengerCountry) {
		this.passengerCountry = passengerCountry;
	}
	public String getPassengerPrefer() {
		return passengerPrefer;
	}
	public void setPassengerPrefer(String passengerPrefer) {
		this.passengerPrefer = passengerPrefer;
	}
	@Override
	public String toString() {
		return "PassengersData [passengerId=" + passengerId + ", passengerName=" + passengerName + ", passengerAge="
				+ passengerAge + ", passengerContact=" + passengerContact + ", passengerCountry=" + passengerCountry
				+ ", passengerPrefer=" + passengerPrefer + "]";
	}
	
	
	
	
}
