package com.day7.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList courses = new ArrayList();
		courses.add("java");
		courses.add("sql");
		courses.add("c++");
		courses.add("spring");
		courses.add("sql");
		
		System.out.println(courses); // courses.toString() called
		
		courses.add(2, "dellboomi"); // adding element at 2nd index
		
		System.out.println(courses); // courses.toString() called
		
		int size = courses.size();
		
		System.out.println("size: "+size);
	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter course name:") ;
//		
//		String cname = sc.next();
//		
//		boolean result = courses.contains(cname);
//		
//		if(result) {
//			System.out.println("course is available");
//		}
//		else {
//			System.out.println("course is not available");
//		}
//		
	}

}
