package com.shristi.basic;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		String stringNumber = sc.next();

		int sum = 0;

		char[] charArray = stringNumber.toCharArray();

		int lengthOfNumber= (charArray.length);
		int number=Integer.parseInt(stringNumber);

		for (int i=0;i<lengthOfNumber;i++) {
			
			int singleNumber= number%10;
			
			//System.out.println(singleNumber);
		 
		  number = number/10;
		  
		  int productOfNumber=1;
		  
		  for (int j=0;j<lengthOfNumber;j++) {
			  productOfNumber = productOfNumber * singleNumber;
		  }
		  //System.out.println(productOfNumber);
		  
		  
		  sum=sum+productOfNumber;
		  
		  }
		
        //System.out.println(sum);
        
		if (sum==Integer.parseInt(stringNumber)) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
		
		}

	}


