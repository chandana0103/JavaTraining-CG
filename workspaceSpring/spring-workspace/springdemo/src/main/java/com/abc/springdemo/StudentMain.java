package com.abc.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Student student1 = (Student) context.getBean("stu1");	
		
		//student1.displayStudent();
		
		Student student2 = (Student) context.getBean("stu1");
		
		if(student1 == student2) {
			System.out.println("Both refer to same object");
		}
		else {
			System.out.println("Both refer to different object");
		}
		
		context.close();

	}

}
