package com.abc.springdemo;

public class Welcome {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void sayHello() {
		
		System.out.println("Hello "+ message);
	}	
	
}
