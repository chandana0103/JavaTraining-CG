package com.day7.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo4 {

	public static void main(String[] args) {

		ArrayList<String> courses = new ArrayList<>();
		courses.add("java");
		courses.add("sql");
		courses.add("c++");
		courses.add("spring");
		// courses.add(new Integer());
		Iterator<String> i = courses.iterator();
		while (i.hasNext()) {
			String str = i.next();
			System.out.println(str);
		}
		
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		
		Iterator<Integer> i2 = nums.iterator();
		while (i2.hasNext()) {
			Integer k = i2.next();
			System.out.println(k);
		}		

	}

}
