package com.irctc.main.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irctc.main.entity.StationData;

public interface StationRepo extends JpaRepository<StationData, Long> {
	
	List<StationData> findByStationFromAndStationTo(String stationFrom, String stationTo);
}
