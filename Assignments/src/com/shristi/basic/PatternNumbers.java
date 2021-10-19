package com.shristi.basic;


import java.util.Scanner; 

public class PatternNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Value");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		for (int i=1;i<=number;i++) {
			String pattern="";
			//System.out.println(i);
			for (int j=0;j<i;j++) {
				pattern=pattern+i;
			}
			
			System.out.println(pattern);
			
			
			
		}
		
		
		
	}

}
