package com.thread.learn;

public class Create extends Thread{

	private String name;
	
	public Create(String name) {
		
		this.name = name;
	}

	public void run() {
		System.out.println("I create  a new thread by extends Thread class.");
		
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
