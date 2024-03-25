package com.abc.springdemo2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.abc.springdemo2.bean.Shape;

public class ShapeService {
	
	@Qualifier(value = "shapeObj2")
	@Autowired
	private Shape shape;
	
	public void setShape(Shape shape) {
		this.shape=shape;
	}
	
	public double calculateArea() {
		
		double result = shape.area();	
		
		return result;
	}

}
