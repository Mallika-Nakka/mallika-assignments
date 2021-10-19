package com.shristi.basic;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter NUmber");
		int firstNumber = sc.nextInt();
		
		int fibonacciSeriesNumber=0;
		
		//0 1 1 2 3 5 
		
		int secondNumber=0;
		int thirdNumber=1;
		System.out.print(0+" ");
		System.out.print(1+" ");
		
		for (int i=0;i<=firstNumber-2;i++) {
			
			fibonacciSeriesNumber=secondNumber+thirdNumber;
			System.out.print(fibonacciSeriesNumber+" ");
			secondNumber=thirdNumber;
			thirdNumber=fibonacciSeriesNumber;
			
			
			
		}

		
	}

}
