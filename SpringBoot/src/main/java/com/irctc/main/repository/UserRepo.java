package com.irctc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irctc.main.entity.UserData;

public interface UserRepo extends JpaRepository<UserData,Long> {
	
	public UserData findUserByUserEmailAndUserPassword(String userEmail,String userPassword);
	
}
