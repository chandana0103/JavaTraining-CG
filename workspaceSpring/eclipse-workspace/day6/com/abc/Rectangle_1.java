package com.abc;

public class Rectangle implements Shape {

	private int length;
	private int breadth;
	
	public Rectangle(int length,int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public double area() {
		double area = length*breadth;
		return area;
	}

//	@Override
//	public double volume() {
//		// TODO Auto-generated method stub
//		return 0;
//	}	

}
