package SynchronizedWithManyKeys;
import java.util.ArrayList;
import java.util.Random;

public class ListWorker {

	Random random = new Random();
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	public void addValue1() {
		synchronized (lock1) {
			
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				list1.add(random.nextInt(100));
				
			}
		}
		
	
	public  void addValue2() {
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));
		}
	}

	
	public void getValue() {
		for(int i = 0 ; i < 1000 ; i++) {
			addValue1();
			addValue2();
		}
	}
	
	
	
	public void ThreadWorker() {
		Thread thread1 = new Thread(new Runnable() {
			
			public void run() {
				getValue();
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			public void run() {
				getValue();
			}
		});
		
		long start = System.currentTimeMillis();
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("List1 Size : " + list1.size() + " List2 Size : " + list2.size());
		System.out.println("The passed time : " + (end - start));
	}
	
}
