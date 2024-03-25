package com.day7.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet courses = new LinkedHashSet(); // maintains insertion order
		courses.add("java");
		courses.add("sql");
		courses.add("c++");
		courses.add("spring");
		courses.add("sql");
		
		System.out.println(courses);

	}

}
