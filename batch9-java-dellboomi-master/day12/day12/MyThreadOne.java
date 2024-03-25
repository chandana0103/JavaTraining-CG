package day11;

public class MyThreadOne extends Thread {
	
	public void run() {
		
		for(int i = 11;i<=20;i++) {
			
			System.out.println(Thread.currentThread().getName()+" : "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
}
