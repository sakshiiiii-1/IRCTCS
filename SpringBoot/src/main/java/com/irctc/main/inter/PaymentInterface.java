package com.irctc.main.inter;

import java.util.List;

import com.irctc.main.entity.Payment;

public interface PaymentInterface {
	public void addpaymentDetails(Payment payment);
	
	public List<Payment> getPayments();
}
