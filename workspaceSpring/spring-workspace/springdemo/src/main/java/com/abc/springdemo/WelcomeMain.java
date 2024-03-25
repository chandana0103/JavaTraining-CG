package com.abc.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WelcomeMain {

	public static void main(String[] args) {
		
		//Welcome welcome = new Welcome();
		//welcome.setMessage("Hi spring ");	
		
	    ApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
	    
	    Welcome welcome = (Welcome) context.getBean("welcome");		
		
		welcome.sayHello();		
		

	}

}
