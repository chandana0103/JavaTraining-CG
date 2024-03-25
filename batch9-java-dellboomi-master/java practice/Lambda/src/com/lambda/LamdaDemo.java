package com.lambda;

public class LamdaDemo {
	public static void main(String[] args) {

		MyInterface mi = (a,b) -> a+b;

//		MyInterface m2 = (a,b) -> {
//			return a+b;
//		};

		int result = mi.sum(10, 20);

		System.out.println(result);

	}

}

public interface MyInterface {

	int sum(int a,int b);

//    void m2();
}


