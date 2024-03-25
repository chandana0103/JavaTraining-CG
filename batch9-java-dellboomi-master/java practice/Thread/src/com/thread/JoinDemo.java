package com.thread;

public class JoinDemo {
	public static void main(String[] args) {

		System.out.println("Main Starts...");

		MyThreadOne t1 = new MyThreadOne();
		t1.setName("T1");
		t1.start();

		try {
			t1.join();
		} catch (InterruptedException e1) {

			e1.printStackTrace();
		}

		for (int i = 1; i <= 10; i++) {

			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		System.out.println("Main ends...");
	}


}
