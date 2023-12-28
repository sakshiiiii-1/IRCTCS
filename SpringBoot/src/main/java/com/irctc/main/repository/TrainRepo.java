package com.irctc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.irctc.main.entity.TrainData;

@Repository
public interface TrainRepo extends JpaRepository<TrainData, Long>  {
	

}
