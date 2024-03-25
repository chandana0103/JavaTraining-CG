package com.lambda;

public class Exercise4 {
	public static void main(String[] args) {
		
		MyInterface m1=a -> System.out.println("square: "+a*a);
		m1.aMethod(3);
	}
}
interface MyInterface {
	void aMethod(int a);
}

