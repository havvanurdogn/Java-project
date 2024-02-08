package WaitAndNotify;

import java.util.Scanner;

public class WaitNotify {

	private Object lock = new Object();
	
	public void t1(){
		
		synchronized (lock) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Thread 1 is working.");
			System.out.println("Thread 1 is waiting to notify by Thread 2");
			
			try {
				lock.wait();
				System.out.println("Thread 1 is going on.");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	public void t2() {
		Scanner read = new Scanner(System.in);
		synchronized (lock) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread 2 is working.");
			System.out.println("Please press any key to notify Thread 1.");
			read.nextLine();
			lock.notify();
			System.out.println("Thread 1 is waking up.Please wait 2 seconds.");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
