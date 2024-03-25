package com.abc.springdemo2.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.springdemo2.service.ShapeService;

public class ShapeServiceMain {

	public static void main(String[] args) {
		
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		ShapeService service = (ShapeService) context.getBean("shapeService");
		
		double area = service.calculateArea();
		
		System.out.println("Area: "+area);
		
		context.close();
		

	}

}
