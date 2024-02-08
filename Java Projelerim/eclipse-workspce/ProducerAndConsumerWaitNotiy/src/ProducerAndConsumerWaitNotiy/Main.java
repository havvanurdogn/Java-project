package ProducerAndConsumerWaitNotiy;

public class Main {

	public static void main(String[] args) {
		
		ProducerConsumer pr = new ProducerConsumer();
		
		Thread threadpr = new Thread(new Runnable() {
			
			public void run() {
				pr.produce();
			}
		});
		Thread threadcn = new Thread(new Runnable() {
			
			public void run() {
				pr.consume();
			}
		});
		
		threadpr.start();
		threadcn.start();
		
		try {
			threadpr.join();
			threadcn.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
