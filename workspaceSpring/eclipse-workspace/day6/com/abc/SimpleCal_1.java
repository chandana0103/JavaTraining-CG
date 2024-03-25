package com.abc;

public interface SimpleCal {
	
	double PI = 3.14;
	
	int add(int a,int b); // by default it public abstract
	
	default void sample() {
		System.out.println("default mehtod implementation");
	}
	
	default void sample2() {
		System.out.println("default mehtod implementation");
	}
	
	static void sample3() {
		System.out.println("default mehtod implementation");
	}

}
