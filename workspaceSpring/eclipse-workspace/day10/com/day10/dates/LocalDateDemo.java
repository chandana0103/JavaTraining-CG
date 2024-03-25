package com.day10.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateDemo {

	public static void main(String[] args) {
	
		LocalDate today = LocalDate.now();
		System.out.println("Date: "+today);
		
		LocalDateTime today2 = LocalDateTime.now();
		System.out.println("Date and Time: "+today2);
		
		LocalDate dob = LocalDate.of(1999, 12, 10);
		System.out.println("Dob: "+dob);
		
		LocalDate dob2 = LocalDate.of(1998, Month.JUNE, 20);
		System.out.println("Dob: "+dob2);
		
		LocalDate result = dob2.minusDays(30);
		System.out.println("Result: "+result);
		
		
	}

}
