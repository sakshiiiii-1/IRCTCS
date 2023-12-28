package com.irctc.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.main.entity.Payment;
import com.irctc.main.inter.PaymentInterface;
import com.irctc.main.repository.PaymentRepo;

@Service
public class PaymentService implements PaymentInterface {
	@Autowired
	PaymentRepo paymentRepo;
	
	@Override
	public void addpaymentDetails(Payment payment) {
		
		paymentRepo.save(payment);
		
	}

	@Override
	public List<Payment> getPayments() {
		// TODO Auto-generated method stub
		return paymentRepo.findAll();
	}
}