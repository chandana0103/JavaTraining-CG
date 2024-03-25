package com.day10.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		
		//List<Integer> nums = Arrays.asList(10,20,30,40);  
		
		List<Integer> list = new ArrayList<>(); //source
		list.add(10);
		list.add(20);
		list.add(90);
		list.add(40);
		list.add(60);
		
		//without stream api how to filter the array for e.g filter the elements which are > 50
		System.out.println("***Without stream api*****");
		Iterator<Integer> i = list.iterator();
		while(i.hasNext()) {
			int k = i.next();
			if(k>=50) {
				System.out.println(k);
			}
		}
		System.out.println("***With stream api*****");
		//with stream api
		list.stream().filter(x->x>50).forEach(x->System.out.println(x));
		
		System.out.println("***With stream api- adding all numbers inside colleciton*****");
		
		Optional<Integer> optional = list.stream().reduce((a,b)->a+b);
		
		if(optional.isPresent()) {
			int result = optional.get();
			System.out.println(result);	
		}			

	}

}
