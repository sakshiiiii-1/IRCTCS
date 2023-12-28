package com.irctc.main.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irctc.main.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Long> {
	
	Optional<Admin> findByAdminName(String adminName);

}
