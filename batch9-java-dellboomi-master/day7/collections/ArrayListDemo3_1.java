package com.day7.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		ArrayList nums = new ArrayList();
		nums.add(new Integer(10));
		nums.add(new Integer(20));
		nums.add(new Integer(30));
		nums.add(40); // nums.add(new Integer(40);
		nums.add(50); // nums.add(new Integer(501); 
		
		System.out.println(nums);	
		
		int sum = 0;
		
		Iterator i = nums.iterator();
		while(i.hasNext()) {
			Integer k = (Integer) i.next();
			//System.out.println(k);
			sum = sum+k;
		}
		System.out.println("Sum: "+sum);

	}

}
