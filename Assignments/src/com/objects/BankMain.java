package com.objects;
import java.util.Scanner;
public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount");
		Scanner sc=new Scanner(System.in);
		double amount=sc.nextInt();
		Bank user=new Bank(amount);
		
		double balance=user.getBalance();
		System.out.println(balance);

	}

}
