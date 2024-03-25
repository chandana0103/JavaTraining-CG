package com.abc.springdemo.bean;

public class Square implements Shape {
	
	private int side;
	
		
	@Override
	public double area() {
		return side*side;
		
	}



	public void setSide(int side) {
		this.side = side;
	}

}
