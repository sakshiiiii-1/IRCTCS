package com.irctc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.irctc.main.entity.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Long> {

	
}
