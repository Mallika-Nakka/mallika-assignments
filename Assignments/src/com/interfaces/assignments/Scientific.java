package com.interfaces.assignments;

public class Scientific extends Basic implements ScientificCalculator {

	public Scientific() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void square(int x) {
		// TODO Auto-generated method stub
		System.out.println("Square: " + (x * x));

	}

	@Override
	public void cube(int x) {
		// TODO Auto-generated method stub
		System.out.println("Cube: " + (x * x * x));

	}

}
