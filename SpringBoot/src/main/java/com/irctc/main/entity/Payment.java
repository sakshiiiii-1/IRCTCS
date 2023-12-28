package com.irctc.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long CardNumber;
	private int date;
	private int cvv;
	private String NameonCard;
	private Double Amount;
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(Long cardNumber, int date, int cvv, String nameonCard, Double amount) {
		super();
		CardNumber = cardNumber;
		this.date = date;
		this.cvv = cvv;
		NameonCard = nameonCard;
		Amount = amount;
	}
	public Long getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(Long cardNumber) {
		CardNumber = cardNumber;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getNameonCard() {
		return NameonCard;
	}
	public void setNameonCard(String nameonCard) {
		NameonCard = nameonCard;
	}
	public Double getAmount() {
		return Amount;
	}
	public void setAmount(Double amount) {
		Amount = amount;
	}
	@Override
	public String toString() {
		return "Payment [CardNumber=" + CardNumber + ", date=" + date + ", cvv=" + cvv + ", NameonCard=" + NameonCard
				+ ", Amount=" + Amount + "]";
	}
	
	
	
}