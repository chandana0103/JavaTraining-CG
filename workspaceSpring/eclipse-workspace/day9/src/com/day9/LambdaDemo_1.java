package com.day9;

public class LambdaDemo {

	public static void main(String[] args) {
		
//		IHello hello = () -> {
//			System.out.println("Hello Lambda...");
//		};
		
		IHello hello = () -> System.out.println("Hello Lambda...");
//		
		hello.sayHello();
	}

}
