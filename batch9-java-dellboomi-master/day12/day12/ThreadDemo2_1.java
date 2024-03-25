package day11;

public class ThreadDemo2 {

	public static void main(String[] args) {
	
		System.out.println("Main Starts...");
		
		MyThreadTwo threadTwo = new MyThreadTwo();
		Thread t1 = new Thread(threadTwo);
		
		t1.start();
		
		for(int i = 51;i<=100;i++) {
			System.out.println(i);
		}		
		
		System.out.println("Main ends...");	
		

	}

}


class MyThreadTwo implements Runnable {

	@Override
	public void run() {
		for(int i = 1;i<=50;i++) {
			System.out.println(i);
		}		
	}
	
}