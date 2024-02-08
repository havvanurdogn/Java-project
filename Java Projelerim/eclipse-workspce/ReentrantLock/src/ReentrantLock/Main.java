package ReentrantLock;

public class Main {

	public static void main(String[] args) {
		
		ReentrantLockClass re = new ReentrantLockClass();
		
		Thread thread11 = new Thread(new Runnable() {
			
			public void run() {
				re.thread1();
			}
		});
		
		Thread thread22 = new Thread(new Runnable() {
			
			public void run() {
				re.thread2();
			}
		});
		
		thread11.start();
		thread22.start();
		
		try {
			thread11.join();
			thread22.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		re.threadOver();
		
	}

}
