package com.day10.enums;

public class EnumSwitchDemo {

	public static void main(String[] args) {

		// String input = "MONDAY"; // how to compare string values --> equals method

		Day inputDay = Day.SUNDAY; // how to compare enum values --> ==
		
		aMethod(inputDay);

	}

	static void aMethod(Day day) {
		
		switch(day) {
		
		case MONDAY : 
			System.out.println("monday .....");
			break;
		case TUESDAY :
			System.out.println("TUEday .....");
			break;
		case WEDNESDAY:
			System.out.println("WEDNESDAY .....");
			break;
		case THURSDAY :
			System.out.println("THURSDAY .....");
			break;
		case FRIDAY :
			System.out.println("FRIDAY .....");
			break;
		case SATURDAY :
			System.out.println("SATURDAY .....");
			break;				
		case SUNDAY :
			System.out.println("sunday .....");
			break;		
		}
			
	}

}
