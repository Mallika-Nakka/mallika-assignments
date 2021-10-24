package com.interfaces.assignments;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicCalculator bc=new Basic();
		bc.add(24, 56);
		bc.difference(34, 56);
		bc.difference(23, 21);
		bc.divide(25, 5);
		bc.product(2, 67);
		
		bc=new Scientific();
		bc.add(24, 56);
		bc.difference(34, 56);
		bc.difference(23, 21);
		bc.divide(25, 5);
		bc.product(2, 67);
		
		
		ScientificCalculator scientific=new Scientific();
		scientific.add(23, 45);
		scientific.difference(34, 56);
		scientific.difference(23, 21);
		scientific.divide(25, 5);
		scientific.product(2, 67);
		scientific.square(4);
		scientific.cube(4);
		
		
		
		

	}

}
