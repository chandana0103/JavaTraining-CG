package com.exceptions;

public class ThrowsDemo {

	public static void main(String[] args) {
		
		System.out.println("Main starts...");
		try {
			int result = divison(50,0);			
			System.out.println("Result:"+result);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Main ends...");
	}
	
	public static int divison(int a, int b) throws ArithmeticException {
		int c = a/b;
		return c;
	}

}
