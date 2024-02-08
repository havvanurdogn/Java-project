package WaitAndNotify;

public class Main {
	
	public static void main(String[] args) {
		
		WaitNotify wn = new WaitNotify();
		
		Thread thread1 = new Thread(new Runnable() {
			
			public void run() {
				wn.t1();
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			public void run() {
				wn.t2();
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
