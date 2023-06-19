package com.example.abstraction;

public class Square extends Shape {

	float side;
	public Square(){
		side = 2.0f;
	}
	public Square(float side){
		this.side = side;
	}
	@Override
	void calarea() {
		// TODO Auto-generated method stub
		area = side*side;
		
	}

}
