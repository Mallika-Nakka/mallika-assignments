package com.shristi.basic;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value");
		int number = sc.nextInt();
		
		int sum=0;
		
		for (int i=1;i<number;i++) {
			if (number%i==0) {
				sum+=i;
			}
			
			
		}
		
		if (sum==number) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not a Perfect Number");
		}
		
		

	}

}
