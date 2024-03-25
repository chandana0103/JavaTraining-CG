package com.abc.springdemo.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.springdemo.bean.Circle;
import com.abc.springdemo.bean.Rectangle;
import com.abc.springdemo.bean.Shape;
import com.abc.springdemo.service.ShapeService;

public class ShapeServiceMain {

	public static void main(String[] args) {
		
//		Shape shape = null;
//		
//		shape = new Rectangle();
//		
//		ShapeService service = new ShapeService();
//		service.setShape(shape);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		ShapeService service = (ShapeService) context.getBean("shapeService");
		
		double area = service.calculateArea();
		
		System.out.println("Area: "+area);
		
		
		

	}

}
