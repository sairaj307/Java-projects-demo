package com.example.polymorphism;

public class RBI {

	public float getRateOfInterest(){
		return 6.7f;
	}
	
}

class SBI extends RBI{

	@Override
	public float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 7.0f;//super.getRateOfInterest();
	}
	public SBI getObject(){
		return this;
	}
}
class HDFC extends RBI{

	@Override
	public float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 6.8f;//super.getRateOfInterest();
	}
	//public HDFC getObject(){
	//	return this;
	//}
}
class ICICI extends RBI{

	@Override
	public float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 7.0f;//super.getRateOfInterest();
	}
	public ICICI getObject(){
		return this;
	}
}













