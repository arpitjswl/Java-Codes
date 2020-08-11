package com.patterns.observer;

import java.awt.List;
import java.util.LinkedList;

public class ObserverMain {

	public ObserverMain() {}

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		
		Customers cust = new Customers("Arpit", 25000d, bank);
		Customers cust2 = new Customers("Anuj", 34000d, bank);
		Customers cust3 = new Customers("Ashish",450000d, bank);
		
		
		
		bank.openAccount(cust);
		bank.openAccount(cust2);
		bank.openAccount(cust3);
		
		/*
		 * cust.openAcc(bank); cust2.openAcc(bank); cust3.openAcc(bank);
		 */
		
		bank.pressRelease();
		/*
		 * list.add(cust); list.add(cust2); list.add(cust3);
		 * 
		 * cust2.withDraw(33000d);
		 * 
		 * for (Customers c : list) { c.update(); }
		 */
	}

}

