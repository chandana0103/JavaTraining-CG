package day11;

public class NumberGenerator {

	int counter = 1;

	synchronized public void printOddNumber() {

		while(counter < 31) {
		if (counter % 2 == 0) {
             try {
				wait();
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" : "+counter);
		counter++;
		notify();
		}
	}

	synchronized public void printEvenNumber() {
		while(counter < 31) {
		if (counter % 2 == 1) {
           try {
			wait();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		}
		System.out.println(Thread.currentThread().getName()+" : "+counter);
		counter++;
		notify();
		}
	}
}
