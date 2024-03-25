package com.streamapi;
import java.util.*;

public class FilterDemo {

	public static void main(String[] args) {
		
		//List<Integer> nums=Arrays.asList(10,2,4,6);
		List<Integer> list =new ArrayList<>();
		list.add(20);
		list.add(40);
		list.add(50);
	
	//without strem api how to filter the array for ex num<50
		System.out.println("without strem api");
		Iterator<Integer> i=list.iterator();
		while(i.hasNext()) {
			int k=i.next();
			if(k>= 20) {
				System.out.println(k);
			}
		}
		//with stream api
		System.out.println("with stream api");
		list.stream().filter(x->x>20).forEach(x->System.out.println(x));

		System.out.println("with stream api adding");
		Optional<Integer> optional=list.stream().reduce((a,b)->a+b);
		if(optional.isPresent()) {
			int res=optional.get();
			System.out.println(res);
			
		}
	}
	

}
