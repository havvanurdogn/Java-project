package DeadLock;

public class Main {

	public static void main(String[] args) {
		
		DeadLockPrep deadLock = new DeadLockPrep();
		
		Thread th1 = new Thread(new Runnable() {
			
			public void run() {
				deadLock.thread1();
			}
		});
		
		Thread th2 = new Thread(new Runnable() {
			
			public void run() {
				deadLock.thread2();
			}
		});
		
		th1.start();
		th2.start();
		
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		deadLock.threadOver();
		
	}

}
