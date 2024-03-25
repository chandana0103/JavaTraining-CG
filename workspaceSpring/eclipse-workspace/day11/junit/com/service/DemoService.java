package com.service;

import java.util.Arrays;

public class DemoService {

	public boolean isPalindrom(int n) {

		int temp = n;
		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			return true;
		else
			return false;
	}

	public int[] sort(int[] ary) {

		Arrays.sort(ary);

		return ary;
	}

	public String divison(int a, int b)  {

		String result = "";

		int c = a / b;
		result = "" + c;

		return result;
	}

}
