package com.patterns.observer;

import java.util.LinkedList;
import java.util.List;

public class Bank {
	
	private String name;
	private String title;
	private List<Customers> list = new LinkedList<>();
	
	public Bank() {}
	
	
	public void openAccount(Customers cust) {
		list.add(cust);
	}
	
	public void pressRelease() {
		for (Customers cust : list) {
			cust.update();
		}
		
	}
	
	public void sendMsg(String msg) {
		this.title = msg;
		pressRelease();
	}

}
