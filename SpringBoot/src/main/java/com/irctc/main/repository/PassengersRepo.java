package com.irctc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irctc.main.entity.PassengersData;

public interface PassengersRepo extends JpaRepository<PassengersData, Long>{

}
