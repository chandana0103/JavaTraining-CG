package com.day7;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		
		int i = 10 ; 
		
		Integer k = new Integer(i); //boxing - converting primitive into object		
		
		int j = k.intValue(); // unboxing - convert object value into primitive
		
		//--------------------------------------java 5 onwards--------------------
		
		Integer i1 = 10;  // auto boxing   => Integer i1 = new Integer(10);
		
		int j1 = i1;   // auto unboxing  =>  int j1 = i1.intValue();
		
		
		

	}

}
