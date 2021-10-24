package com.interfaces.assignments;

public class Basic implements BasicCalculator{
	
	
	public void add(int x,int y) {
		System.out.println("Sum: "+(x+y));
		
	}
	public void difference(int x, int y) {
		if (x>y) {
			System.out.println("Difference: "+(x-y));
			
		}
		else {
			System.out.println("Difference: "+(y-x));
		}
		
		
	}
	public void product(int x,int y) {
		System.out.println("Product: "+(x*y));
	}
	public void divide(int x,int y) {
		System.out.println("Division: "+(x/y));
	
		
	}
	

}
