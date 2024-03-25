package com.streamapi;
import java.util.*;
import java.util.stream.Stream;
public class StremDemo {
	public static void mai(String args[]) {
		Stream<Integer> stream1=Stream.of(10,33,45,77);
		stream1.forEach(x->System.out.println(x));
		System.out.println("  hi ");
			Integer[] arr= {12,32,45,65,6};
			Stream<Integer> stream2=Arrays.stream(arr);
			stream2.forEach(x->System.out.println(x));
			System.out.println("  hello ");
			
			List<Integer> list=new ArrayList<>();
			list.add(10);
			list.add(14);
			list.add(15);
			list.add(16);
			Stream<Integer> stream3=list.stream();
			stream3.forEach(x-> System.out.println(x));
			
	}

}
