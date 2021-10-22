package com.oops.abstraction;

public class AccountCurrent extends BankATM {
	
	public AccountCurrent(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	double amount=10000;

	
	void withdraw(double amount) {
		//for maintenance they are taking some cuttings from our account
		if ((balance > amount) && (balance-amount > 1000)) {
			balance -= amount - 10;
			System.out.println("Withdrawed Successfully");
		} else if (balance < amount) {
			System.out.println("Insufficient amount you have");
		}

	}

	void deposit(double amount) {

		balance += amount;
		System.out.println("Deposited Successfully");

	}

}
