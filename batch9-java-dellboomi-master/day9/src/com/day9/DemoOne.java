package com.day9;

public class DemoOne {

	public static void main(String[] args) {
		
		
		MyInterface myInterface = new MyClassOne();
		myInterface.m1();
		
		MyInterface myInterface2 = new MyInterface() {
			@Override
			public void m1() {				
				System.out.println("m1 method implemented here.");				
			}

			@Override
			public void m2() {
				// TODO Auto-generated method stub
				
			}			
		};
		
		myInterface2.m1();
		
		MyInterface myInterface3 = new MyInterface() {
			@Override
			public void m1() {				
				System.out.println("m1 method implemented in another class.");				
			}

			@Override
			public void m2() {
				// TODO Auto-generated method stub
				
			}			
		};
		
		myInterface3.m1();
		
	}

}
