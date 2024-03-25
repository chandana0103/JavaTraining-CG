package com.lambda;

public class MethodRefDemo {
	public static void main(String[] args) {

		IFun fun1 = a -> System.out.println("Cube: "+a*a*a);		
		fun1.aMethod(2);

		IFun fun2 = System.out::println;
		fun2.aMethod(5);


	}

}

interface IFun {

	void aMethod(int a);
}
