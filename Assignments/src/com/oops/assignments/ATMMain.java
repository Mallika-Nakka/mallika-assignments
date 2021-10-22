
package com.oops.assignments;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		
		double initializingAmount = 10000;
		Scanner sc = new Scanner(System.in);
		AccountCurrent current = new AccountCurrent(initializingAmount);
		AccountSavings savings = new AccountSavings(initializingAmount);
		System.out.println("Enter the type of the Account Savings Account / Current Account");
		String name;
		String accountType = sc.next();

		if (accountType.equals("savings")) {

			System.out.println("deposit  witdraw  get-balance");
			name = sc.next();
			switch (name) {
			case "deposit":
				System.out.println("Enter the amount to Deposit");
				int depositAmount = sc.nextInt();
				savings.deposit(depositAmount);
				break;
			case "withdraw":
				System.out.println("Enter the amount to Withdraw");
				int withdrawAmount = sc.nextInt();
				savings.withdraw(withdrawAmount);
				break;
			case "get-balance":
				double balance1 = savings.getBalance();
				System.out.println("Here is your savings account balance: " + balance1);
				break;
				
			default:
				System.exit(10);
			}
		}

		else if (accountType.equals("current")) {

			System.out.println("deposit  witdraw  display balance");
			name = sc.next();
			switch (name) {
			case "deposit":
				System.out.println("Enter the amount to Deposit");
				int depositAmount = sc.nextInt();
				current.deposit(depositAmount);
				break;
			case "withdraw":
				System.out.println("Enter the amount to Withdraw");

				int withdrawAmount = sc.nextInt();
				current.withdraw(withdrawAmount);
				break;
			case "get-balance":
				
				
				 double balance2 = current.getBalance();
				  System.out.println("Here is your current account balance: "+balance2);
				 
				break;

			default:
				System.exit(10);
			}

		} else {
			System.out.println("Transaction Cancelled");
		}
		sc.close();
	}

}
