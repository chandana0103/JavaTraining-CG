package com.day10.enums;

import java.util.ArrayList;
import java.util.List;

public class DemoCollection {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("raj",25));
		persons.add(new Person("amar",20));
		persons.add(new Person("sam",22));
		persons.add(new Person("krish",18));
		
		SortMethod sortMethod = SortMethod.BYNAME;
		
		List<Person> resultList = sort(persons,sortMethod);
		
		//
		
		

	}
	
	static List<Person> sort(List<Person> person,SortMethod sortMethod) {
		
		if(sortMethod == SortMethod.BYNAME) {
			//sort the collection by name
		}
		if(sortMethod == SortMethod.BYAGE) {
			//sort the colleciton by age
		}
		
		return person;
		
	}

}
