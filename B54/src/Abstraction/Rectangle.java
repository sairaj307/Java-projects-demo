package Abstraction;

public class Rectangle extends Shape{
	float width, height;
	public Rectangle(){
		this.width = 5.0f;
		this.height = 2.0f;
	}
	public Rectangle(float width, float height){
		this.width = 5.0f;
		this.height = 2.0f;
	}
	@Override
	void calarea() {
		// TODO Auto-generated method stub
		area = width*height;
		
	}
	

}
