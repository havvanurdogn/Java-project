package ArrayBlockingQueue;

public class Main {

	public static void main(String[] args) {
		
		ProduceConsumer pr = new ProduceConsumer();
		
		Thread product = new Thread(new Runnable() {
			
			public void run() {
				pr.produce();
			}
		});
		
		Thread consumer = new Thread(new Runnable() {
			
			public void run() {
				pr.consume();
			}
		});
		
		product.start();
		consumer.start();
		
		try {
			product.join();
			consumer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
