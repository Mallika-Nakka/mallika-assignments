package com.objects;

public class Vehicle {
	String name,model;
	int price;
	
	Vehicle(String name,String model,int price){
		this.name=name;
		this.model=model;
		this.price=price;
		
	}
	
	void getDetails(){
		System.out.println("Vehicle name: "+name);
		System.out.println("Model: "+model);
		System.out.println("Price "+price);
		
		
		
	}

}
