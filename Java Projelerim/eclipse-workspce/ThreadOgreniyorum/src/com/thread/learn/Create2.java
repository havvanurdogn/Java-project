package com.thread.learn;

public class Create2 implements Runnable{

	private String name;
	
	public Create2(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println("I create  a new thread by implements Runnable interface.");
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(name + " is working : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("It throwed Interrupt Exception.");
			}
		}
	}

}
