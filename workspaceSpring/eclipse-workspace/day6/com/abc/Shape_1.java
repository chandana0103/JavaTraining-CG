package com.abc;

public interface Shape {

	double PI = 3.14;
	double area();
	
	default double volume() {
		return 0;
	}
}
