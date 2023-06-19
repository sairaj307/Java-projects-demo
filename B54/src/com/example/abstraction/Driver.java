package com.example.abstraction;

public class Driver {

	public static void main(String[] args) {
		Square sq = new Square();
		Rectangle r1 = new Rectangle();
		sq.calarea();
		sq.show();
		r1.calarea();
		r1.show();
		
		Shape shape;
		shape = new Square(12.5f);
		
		shape.calarea();
		shape.show();
		
		shape = new Rectangle(10, 20);
		shape.calarea();
		shape.show();

	}

}
