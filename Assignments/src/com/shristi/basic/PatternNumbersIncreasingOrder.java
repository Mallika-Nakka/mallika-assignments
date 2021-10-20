package com.shristi.basic;


import java.util.Scanner; 

public class PatternNumbersIncreasingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Value");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int n=1;
		for (int i=1;i<=number+1;i++) {
			String pattern="";
			//System.out.println(i);
			for (int j=1;j<i;j++) {
				pattern=pattern+n+" ";
				n+=1;
			}
			
			System.out.println(pattern);
			
			
			
		}
		
		
		
	}

}
