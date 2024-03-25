package com.day7.collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet courses = new HashSet(); // unordered and unsorted
		courses.add("java");
		courses.add("sql");
		courses.add("c++");
		courses.add("spring");
		courses.add("sql");
				
		System.out.println(courses);		

	}

}
