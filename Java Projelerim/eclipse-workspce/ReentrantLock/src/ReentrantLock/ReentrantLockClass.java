package ReentrantLock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockClass {

	private int num = 0 ;
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	Scanner read = new Scanner(System.in);
	
	public void increase() {
		
		for(int i = 0 ; i < 10000 ; i++) {
			num ++;
		}
		
	}
	
	
	public void thread1() {
		
		lock.lock();
		System.out.println("Thread1 is working...");
		System.out.println("Thread1 is waiting to wake up.");
		try {
			condition.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		increase();
		lock.unlock();
		
	}
	
	public void thread2() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lock.lock();
		System.out.println("Thread2 is working now...");
		increase();
		System.out.println("Please press any key to wake up Thread1.");
		read.nextLine();
		System.out.println("Thread2 have woken up Thread1.");
		condition.signal();
		lock.unlock();
		
	}
	
	public void threadOver() {
		
		System.out.println("Number : " + num);
		
	}
	
	
	
}
