package SynchronizedKeyWord;

public class ThreadSafe {
	private int count = 0;
	
	private synchronized void plus() {
		count++;
	}
	
	private void ThreadsWork() {
		
		Thread thread1 = new Thread( new Runnable() {
			
			public void run() {
				for(int i = 0 ; i < 5000 ; i++) {
					plus();
				}
			}
		});
		Thread thread2 = new Thread( new Runnable() {
			
			public void run() {
				for(int i = 0 ; i < 5000 ; i++) {
					plus();
				}
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
		
		System.out.println("Count value is "+ count);

		
	}

	public static void main(String[] args) {
		
		ThreadSafe threadsafe = new ThreadSafe();
		threadsafe.ThreadsWork();
		
	}

}
