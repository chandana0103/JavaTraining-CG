package com.thread;

public class InterThreadDemo {

	public static void main(String[] args) {
		NumberGenerator numberGenerator= new NumberGenerator();

		PrintEventNumbers even = new PrintEventNumbers(numberGenerator);

		PrintOddNumbers odd = new PrintOddNumbers(numberGenerator);

		Thread t1 = new Thread(even,"even");

		Thread t2 = new Thread(odd, "odd");

		t1.start();
		t2.start();

	}

}

class PrintEventNumbers implements Runnable {

	private NumberGenerator numberGenerator;

	PrintEventNumbers(NumberGenerator numberGenerator) {
		this.numberGenerator = numberGenerator;
	}

	@Override
	public void run() {
		numberGenerator.printEvenNumber();

	}

}

class PrintOddNumbers implements Runnable {


	private NumberGenerator numberGenerator;

	PrintOddNumbers(NumberGenerator numberGenerator) {
		this.numberGenerator = numberGenerator;
	}

	@Override
	public void run() {
		numberGenerator.printOddNumber();

	}



	}


