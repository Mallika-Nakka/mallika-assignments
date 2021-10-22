package com.oops.assignments;

public class AccountSavings extends BankATM {

	public AccountSavings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	void withdraw(double amount) {
		if ((balance > amount) && (balance - amount) > 1000) {
			balance -= amount;
			System.out.println("Withdrawed Successfully");
		} else if (balance < amount) {
			System.out.println("Unsufficient amount you have");
		} else if (((balance - amount) <= 1000)) {
			System.out.println("You have to maintain minimum balance of 1000");
		}
	}

	void deposit(double amount) {
		// In savings we get interest rate so if the money is greater than 1000 we are
		// adding some amount to the balance
		if (amount > 20000) {
			balance += amount + 500;

		} else {
			balance += amount;

		}
		System.out.println("Deposited Successfully");

	}
}
