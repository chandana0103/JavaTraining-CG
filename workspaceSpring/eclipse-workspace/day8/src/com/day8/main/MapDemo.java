package com.day8.main;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		//HashMap<Integer,String> map = new HashMap<>(); // similar to HashSet on key. unordered and unsorted based on key only
		 
		//LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
		
		TreeMap<Integer,String> map = new TreeMap<>();
		
		map.put(new Integer(10), "Java Funamentals");
		map.put(250, "abstraction");
		map.put(new Integer(150), "String Manipulation");		
		map.put(400, "encapsulation");
		
		System.out.println(map);
		
		int input = 160;
		
		String chapterName = map.get(input);
		
		if(chapterName != null) {
			System.out.println("Topic : "+chapterName);
		}
		else {
			System.out.println("Chapter not existing");
		}
		
		
	}

}
