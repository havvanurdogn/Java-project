package Semaphore;

import java.util.concurrent.Semaphore;

public class SemaphorePrep {

	private Semaphore sem = new Semaphore(4);
	
	public void threadfunc(int id) {
		
		try {
			sem.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread is working. ID : " + id);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread have done. ID : " + id);
		sem.release();
		
	}
	
	
}
