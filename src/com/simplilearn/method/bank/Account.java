package com.simplilearn.method.bank;

public class Account {
	private int accountNo;
	private String name;
	private double balance;
	private String email;
	
	//constructors
	public Account(int accountNo, String name, double balance, String email) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		this.email = email;
	}
	
	//getters and setters
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
