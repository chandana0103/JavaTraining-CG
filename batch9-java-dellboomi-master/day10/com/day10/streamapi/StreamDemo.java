package com.day10.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		
		Stream<Integer> stream1 = Stream.of(10,20,30,40); // source		
		stream1.forEach(x->System.out.println(x));
		System.out.println("*********");
		
		Integer[] ary = {10,20,30,50}; //source		
		Stream<Integer> stream2 = Arrays.stream(ary);		
		stream2.forEach(x->System.out.println(x));		
		System.out.println("*********");
		
		List<Integer> list = new ArrayList<>(); //source
		list.add(10);
		list.add(20);
		list.add(90);
		list.add(40);
		
		Stream<Integer> stream3 = list.stream();	
		
//		Consumer<Integer> consumer = x->System.out.println(x);				
//		stream3.forEach(consumer);
		
		stream3.forEach(x->System.out.println(x));
		
		
		

	}

}
