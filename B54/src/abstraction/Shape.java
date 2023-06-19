package com.example.abstraction;

public abstract class Shape {

	Shape(){
		
	}
	 protected float area;
	abstract void calarea();
	
	void show(){
		System.out.println(area);
	}
	
}
