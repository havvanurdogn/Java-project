package ThreadInterrupt;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<Integer>();
		Thread t = new Thread(new Runnable() {
			
			public void run() {
				System.out.println("Thread is starting to work.");
				
				for(int i = 0 ; i < 10000000 ; i++) {
					
					if(Thread.currentThread().isInterrupted()) {
						System.out.println("Thread have woken up.");
						return;
					}
					
					list.add(i);
					
				}
				
				System.out.println("Thread have done succesfully!");
				/*for(int i = 1 ; i <= 10 ; i++) {
					System.out.println("Thread is working : " + i);
					
					try {
						Thread.sleep(1000);
						System.out.println("Thread have worked for " + i + " seconds.");
					} catch (InterruptedException e) {
						System.out.println("Thread have woken up.");
					}
					
					
				}*/
				
			}
		});
		
		t.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t.interrupt();
		
	}

}
