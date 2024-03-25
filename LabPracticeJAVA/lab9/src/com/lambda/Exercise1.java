package com.lambda;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		PowerOf p =(x,y)->{
			return Math.pow(x, y);
		};
	
		System.out.println("Enter two numbers:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(" "+x+ " power "+y +" = "+ p.power(x,y));
	}
}
		
interface PowerOf { 
	double power(int x, int y);
	}
