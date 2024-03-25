package com.abc.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingsMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		 
		Greetings greetings = (Greetings) context.getBean("greetings");
		 
		greetings.sayHello();
		 
		context.close();
		 

	}

}
