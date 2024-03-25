package com.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("Main starts");
		MyThreadOne t1 = new MyThreadOne();
		t1.setName("T1");
		t1.start(); 

		MyThreadOne t2 = new MyThreadOne();
		t2.setName("T2");
		t2.start(); 

		for(int i = 51;i<=100;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}

		System.out.println("Main ends...");
	}

}

