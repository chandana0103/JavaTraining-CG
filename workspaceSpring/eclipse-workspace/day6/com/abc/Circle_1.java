package com.abc;

public class Circle implements Shape {

	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		double area = Shape.PI*radius*radius;
		return area;
	}

//	@Override
//	public double volume() {
//		
//		return 0;
//	}

}
