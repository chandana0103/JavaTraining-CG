package com.thread;

public class SynchronizatonDemo {

	public static void main(String[] args) {
		MyResource m=new MyResource();
		SampleThread t1=new SampleThread(m);
		t1.setName("T1");
		
		SampleThread t2=new sampleThread(m);
		t2.setName("T2");
		t1.start();
		t2.start();
		
	}

}
class SampleThread extends Thread {
	Private MyResource m;
	
	public SampleThread(MyResource m) {
		this.m=m;
		
	}
	@Override
	public void run()
}

