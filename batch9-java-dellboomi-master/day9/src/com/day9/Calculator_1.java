package com.day9;

public class Calculator implements MaxFinder {

	@Override
	public int max(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		}
		return num2;
	}
}
