package com.day10.lambda;

public class LambdaDemo {

	public static void main(String[] args) {
		
		MyInterface mi = (a,b) -> a+b;
		
//		MyInterface m2 = (a,b) -> {
//			return a+b;
//		};
		
		int result = mi.sum(10, 20);
		
		System.out.println(result);

	}

}
