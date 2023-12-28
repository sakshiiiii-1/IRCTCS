package com.irctc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.main.entity.Payment;
import com.irctc.main.inter.PaymentInterface;

@CrossOrigin("*")
@RestController
@RequestMapping("/payment")
public class PaymentController {
	private final PaymentInterface paymentInterface;
	
	@Autowired
	public PaymentController(PaymentInterface paymentInterface) {
		this.paymentInterface=paymentInterface;
		
	}
	@PostMapping("/addPayments")
	public void addPayments(@RequestBody Payment payment) {
		System.out.println(payment);
		paymentInterface.addpaymentDetails(payment);
	}
	
	@GetMapping("/getPayments")
	public List<Payment> getPayments(){
		return paymentInterface.getPayments();
	}
	
}