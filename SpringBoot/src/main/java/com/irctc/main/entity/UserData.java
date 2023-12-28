package com.irctc.main.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userId;
	private String firstName;
	private String lastName;
	private String userGender;
	private int userAge;
	private String userCity;
	@Column(unique = true)
	private String userEmail;
	private String userPassword;
	public UserData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserData(Long userId, String firstName, String lastName, String userGender, int userAge, String userCity,
			String userEmail, String userPassword) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userGender = userGender;
		this.userAge = userAge;
		this.userCity = userCity;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "UserData [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", userGender="
				+ userGender + ", userAge=" + userAge + ", userCity=" + userCity + ", userEmail=" + userEmail
				+ ", userPassword=" + userPassword + "]";
	}
		
}
