package com.abc;

public class InterfaceMain {

	public static void main(String[] args) {
	
		SimpleCal cal = new Calc();  
		
		System.out.println(SimpleCal.PI);
		int result = cal.add(20, 30);
		System.out.println(result);

	}

}
