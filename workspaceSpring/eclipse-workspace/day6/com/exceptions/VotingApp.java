package com.exceptions;

public class VotingApp {

	public static void main(String[] args) {
		
		int age = 10;
		
		try {
			vote(age);
		} catch (AgeLimitException e) {			
			System.out.println("Not eligible for vote");
		}

	}
	
	static void vote(int age) throws AgeLimitException {
		
		if(age < 18 ) {
			
			throw new AgeLimitException();
		}
		else {
			System.out.println("Eligible for vote");
		}
	}

}
