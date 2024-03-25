package com.lambda;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import java.util.function.UnaryOperator;

public class CosumerDemo {

	public static void main(String[] args) {
		MyInterfaceOne mOne =a -> System.out.println("Message send"+a);
		mOne.sendMessage("raj");
		
		Consumer<String> consumer = a -> System.out.println("Message send by :"+a);
		consumer.accept("Krish");
		
		Consumer<Integer> consumer2= a -> System.out.println("result " +a*a*a);
		consumer2.accept(3);
		
		Function<String,Integer> fun1=n -> n.length();
		int strLength=fun1.apply("Hello");
		
		System.out.println(strLength);
		
		UnaryOperator<Integer> fun2=n -> n*n;
		int result =fun2.apply(8);
	}
	

	}


interface MyInterfaceOne {

	void sendMessage(String name);
}