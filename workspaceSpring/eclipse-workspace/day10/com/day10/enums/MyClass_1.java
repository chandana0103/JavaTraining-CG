package com.day10.enums;

public class MyClass {

	int i;
	String dayOfWeek;
	
	enum Color {
		RED,GREEN,BLUE
	}
	
	void m1() {
		this.i = 10;
		this.dayOfWeek = "Mon";
		Color c = Color.GREEN;
		System.out.println(i);
		System.out.println(dayOfWeek);
		System.out.println(c);
	}
}
