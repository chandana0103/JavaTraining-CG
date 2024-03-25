package com.day7.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList courses = new ArrayList();
		courses.add("java");
		courses.add("sql");
		courses.add("c++");
		courses.add("spring");	
		courses.add(new Integer(10));
		courses.add(new B());	
		
		System.out.println(courses);
		
		
		Iterator i = courses.iterator();
		
		while(i.hasNext()) {
			
			//Object obj = i.next();
			//String str = (String) obj;
			
			String str = (String) i.next();
			System.out.println(str);			
			
		}		
		
		
	}

}
