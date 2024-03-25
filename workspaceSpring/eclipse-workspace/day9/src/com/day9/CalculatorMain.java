package com.day9;

public class CalculatorMain {

	public static void main(String[] args) {
		
		//option1
//		MaxFinder cal = new Calculator();
//		int max = cal.max(50, 70);
//		System.out.println("Max: "+max);
		
		//option2		
		MaxFinder maxFinder = new MaxFinder() {
			@Override
			public int max(int num1, int num2) {
				if(num1 > num2) {
					return num1;
				}
				return num2;
			}			
		};
		
		int result1 = maxFinder.max(100, 50);
		System.out.println("Max: "+result1);
		
		//option3		
		MaxFinder maxFind = (a,b) -> {
			if(a > b) {
				return a;
			}
			return b;
		};		
		int result2 = maxFind.max(58, 69);
		System.out.println("Max: "+result2);
		
		
		//option4
		MaxFinder maxFind2 = (a,b) -> a > b ? a : b;
		int result3 = maxFind2.max(4, 5);
		System.out.println("Max: "+result3);		
		

	}

}
