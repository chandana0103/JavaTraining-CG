package com.day7.collections;

public class Demo {

	public static void main(String[] args) {
		
		
		
//		Object obj = null;
//		
//		obj = new A(10);	
//		
//		obj = new B();
		
	    A a1 = new A(10);		
		
     	test(a1);
		
		B b1 = new B();
		
		test(b1);
		
		test("sdfd");
		
		test(new Integer(10));

	}
	
	static void test(Object obj) {
		
		
	}

}

class A  extends Object {
	
	A(int i) {
		
	}
	
	void m1() {
		
	}
}

class B {
	
	
}
