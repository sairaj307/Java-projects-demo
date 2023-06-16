package Abstraction;

public abstract class Shape {

	 protected float area;
	abstract void calarea();
	
	void show(){
		System.out.println(area);
	}
	
}
