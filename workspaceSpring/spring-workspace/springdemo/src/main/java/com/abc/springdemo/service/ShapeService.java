package com.abc.springdemo.service;

import com.abc.springdemo.bean.Shape;

public class ShapeService {
	
	private Shape shape;
	
	public void setShape(Shape shape) {
		this.shape=shape;
	}
	
	public double calculateArea() {
		
		double result = shape.area();	
		
		return result;
	}

}
