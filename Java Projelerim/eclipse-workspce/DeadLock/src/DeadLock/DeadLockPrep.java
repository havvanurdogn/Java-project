package DeadLock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockPrep {

	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();
	Random random = new Random();
	Hesap account1 = new Hesap();
	Hesap account2 = new Hesap();
	
	public void tryLock(Lock x ,Lock y) {
		boolean xLock = false;
		boolean yLock = false;
		
		while(true) {
			
			xLock = x.tryLock();
			yLock = y.tryLock();
			
			if(xLock == true && yLock == true) {
				return;
			}
			if(xLock == true) {
				x.unlock();
			}
			if(yLock == true) {
				y.unlock();
			}
			
		}
		
	}
	
	public void thread1() {
		tryLock(lock2, lock1);
		for(int i = 0 ; i < 5000 ; i++) {
			Hesap.transfer(account1, account2, random.nextInt(100));
		}
		lock2.unlock();
		lock1.unlock();
		
	}
	
	public void thread2() {
		tryLock(lock2, lock1);
		for(int i = 0 ; i < 5000 ; i++) {
			Hesap.transfer(account2, account1, random.nextInt(100));
		}
		lock2.unlock();
		lock1.unlock();
		
	}
	
	public void threadOver() {
		System.out.println("Account1 Balance : " + account1.getBalance());
		System.out.println("Account2 Balance : " + account2.getBalance());
		System.out.println("Sum of two account is : " + (account1.getBalance() + account2.getBalance()));
	}
	
	
	
}
