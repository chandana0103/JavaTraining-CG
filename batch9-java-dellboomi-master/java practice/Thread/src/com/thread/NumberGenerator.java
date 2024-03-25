package com.thread;

public class NumberGenerator {
	int i = 1;

	synchronized public void printOddNumber() {

		while(i < 31) {
		if (i % 2 == 0) {
             try {
				wait();
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" : "+i);
		i++;
		notify();
		}
	}

	synchronized public void printEvenNumber() {
		while(i < 31) {
		if (i % 2 == 1) {
           try {
			wait();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		}
		System.out.println(Thread.currentThread().getName()+" : "+i);
		i++;
		notify();
		}
	}
}


