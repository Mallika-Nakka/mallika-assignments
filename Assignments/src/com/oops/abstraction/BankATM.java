package com.oops.abstraction;

public abstract class BankATM {

	double balance;

	public BankATM(double balance) {

		this.balance = balance;
	}

	abstract void withdraw(double amount);

	abstract void deposit(double amount);
	
	  
	double getBalance() {
		
		//System.out.println("Balance is "+balance);
		return balance; }
	  
	  
	 }
