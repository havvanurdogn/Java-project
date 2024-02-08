package com.thread.learn;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Thread1 is working right now.");
		
		Thread t3 = new Thread(new Create2("Thread3"));
		Create thread2 = new Create("Thread2");
		thread2.start();
		t3.start();
		
		/*Thread t5 = new Thread(new Runnable() {

			public void run() {
				System.out.println("Thread5 is working right now.");
				for(int i = 0 ; i <= 10 ; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("It throwed Interrupt Exception.");
					}
				}
			}
			
		});
		t5.start();*/
		
		new Thread(new Runnable() {

			public void run() {
				System.out.println("Thread5 is working right now.");
				for(int i = 0 ; i <= 10 ; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("It throwed Interrupt Exception.");
					}
				}
			}
			
		}).start();
		
		
		Thread thread4 = new Thread("Hello World!");
		thread4.start();
		String name = thread4.getName();
		System.out.println(name);
		

	}

}
