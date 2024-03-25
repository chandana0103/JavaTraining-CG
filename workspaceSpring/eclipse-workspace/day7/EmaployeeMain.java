package com.day7;

public class EmaployeeMain {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(101,"Sameer",50000);
		
		System.out.println(emp1);
		
		Employee emp2 = new Employee(101,"Sameer",90000);
		
		System.out.println(emp2);
		
		if(emp1.equals(emp2)) {
			System.out.println("Both employees are equal");
		}
		else {
			System.out.println("Both employees are not equal");
		}	
						
		String st1 = new String("abc");
		
		String st2 = new String("abc");
		
		if(st1.equals(st2)) {
			System.out.println("Both strings are equal");
		}
		else {
			System.out.println("Both strings are  not equal");
		}			

	}

}
