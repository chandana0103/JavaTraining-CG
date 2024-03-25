package com.abc.springdemo.bean;

public class Circle implements Shape {
	
	private double radius;
	
	public void setRadius(double radius) {
		this.radius = radius;
	}	
	
	@Override
	public double area() {
		
	    double area = 3.14 * radius * radius;
	    return area;
	}



}
