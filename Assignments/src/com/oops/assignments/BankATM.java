package com.oops.assignments;

public class BankATM {

	protected double balance;

	public BankATM(double balance) {

		this.balance = balance;
	}

	void withdraw(double amount) {
		balance -= amount;
	}

	void deposit(double amount) {
		balance += amount + 20;
	}

	public double getBalance() {
		//System.out.println("Balance is "+balance);
		return balance;
	}

}
