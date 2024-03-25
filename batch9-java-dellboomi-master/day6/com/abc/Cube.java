package com.abc;

public class Cube implements Shape, SolidShape {

	private int side;
	
	public Cube(int side) {
		this.side = side;
	}
	
	@Override
	public double area() {
		
		return side*side;
	}

	@Override
	public double volume() {
		
		return side*side*side;
	}

}
