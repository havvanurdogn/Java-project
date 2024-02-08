package CallableAndFuture;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class Main {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(1);
		Random random = new Random();
		
		/*executor.submit(new Runnable() {
			
			public void run() {
				int time = random.nextInt(1000) + 2000 ;
				System.out.println("Thread is working...");
				try {
					Thread.sleep(time);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread have done.");
			}
		});*/
		
		Future<?> future =  executor.submit(new Callable<Integer>() {

			public Integer call() throws Exception {
				int time = random.nextInt(1000) + 2000 ;
				System.out.println("Thread is working...");
				try {
					Thread.sleep(time);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(time > 2500) {
					throw new IOException("Thread took a lot time to work.");
				}
				System.out.println("Thread have done.");
				return time;
			}
		});
		
		executor.shutdown();
		
		try {
			System.out.println("Thread spends time " + future.get() + " seconds");
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		catch (ExecutionException e) {
			System.out.println(e);
		}
		
	}

}
