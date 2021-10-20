package com.objects;

public class Bank {

	double balance=0;
	
	Bank(double balance){
		this.balance=balance;
	}
	
	public void withdraw(int x) {
		System.out.println(x);
	}
	
	public void deposit(int x) {
		balance+=x;
		//System.out.println(x);
	}
	
	public double getBalance() {
		return balance;
	}

}
