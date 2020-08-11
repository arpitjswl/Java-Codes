package com.patterns.observer;

public class Customers {
	private String custName;
	private Bank bankAccount = new Bank();
	private Double availableBal;
	public Customers() {};
	public Customers (String custName, Double bal, Bank bank) {this.custName = custName; this.availableBal = bal; this.bankAccount = bank;}
	
	
	public void balance() {
		System.out.println("Balance is " + availableBal);
	}
	
	public void update() {
		System.out.println("Bank policy changed");
	}
	
	}
