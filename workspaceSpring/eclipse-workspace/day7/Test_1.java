package com.day7;

public class Test {

	public static void main(String[] args) {
		
		A a1 = new A();
		a1.m1();
		//String s = a1.toString();
		
		System.out.println(a1); // a1.toString() is called
		
		String st1 = new String("abc");
		System.out.println(st1); // st1.toString() is called
	}

}
