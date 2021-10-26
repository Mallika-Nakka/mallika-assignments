
package com.oops.assignments;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double initializingAmount = 10000;
		AccountCurrent current = new AccountCurrent(initializingAmount);
		AccountSavings savings = new AccountSavings(initializingAmount);
		System.out.println("Enter the type of the Account Savings Account(s) / Current Account(c)");
		String name;
		String accountType = sc.next();

		if (accountType.equals("s")) {
			while (true) {
				System.out.println("deposit(d)  witdraw(w)  get-balance(b) exit(e)");
				name = sc.next();
				switch (name) {
				case "d":
					System.out.println("Enter the amount to Deposit");
					int depositAmount = sc.nextInt();
					savings.deposit(depositAmount);
					break;
				case "w":
					System.out.println("Enter the amount to Withdraw");
					int withdrawAmount = sc.nextInt();
					savings.withdraw(withdrawAmount);
					break;
				case "b":
					double balance1 = savings.getBalance();
					System.out.println("Here is your savings account balance: " + balance1);
					break;
				case "e":
					System.exit(10);
					System.out.println("Thank you");
					break;

				default:
					System.exit(10);
				}

			}

		}

		else if (accountType.equals("c")) {
			while (true) {
				System.out.println("deposit(d)  witdraw(w)  get-balance(b) exit(e)");
				name = sc.next();
				switch (name) {
				case "d":
					System.out.println("Enter the amount to Deposit");
					int depositAmount = sc.nextInt();
					current.deposit(depositAmount);
					break;
				case "w":
					System.out.println("Enter the amount to Withdraw");

					int withdrawAmount = sc.nextInt();
					current.withdraw(withdrawAmount);
					break;
				case "b":

					double balance2 = current.getBalance();
					System.out.println("Here is your current account balance: " + balance2);

					break;
				case "e":
					System.exit(10);
					System.out.println("Thank you");

				break;

				default:
					System.exit(10);
				}

			}

		} else {
			System.out.println("Transaction Cancelled");
		}
		sc.close();
	}

}
