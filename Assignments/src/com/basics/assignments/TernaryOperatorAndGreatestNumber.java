package com.basics.assignments;
import java.util.Scanner;

public class TernaryOperatorAndGreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 3 Values");
		
		Scanner sc=new Scanner(System.in);
		int firstNumber=sc.nextInt();
		int secondNumber=sc.nextInt();
		int thirdNumber=sc.nextInt();
		//import java.util.Scanner;
		
		int greatestNumber = firstNumber>secondNumber && firstNumber>thirdNumber? firstNumber: secondNumber>thirdNumber?secondNumber:thirdNumber;
		
		System.out.println(greatestNumber);
		
		
		
		
		
		

	}

}
